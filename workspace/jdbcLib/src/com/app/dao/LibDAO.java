package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.domain.BookDTO;
import com.app.domain.RentalDTO;
import com.app.domain.UserDTO;

public class LibDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;

//  1) 사용자 관리   
//  - 사용자 등록 join 준혁
	public void join(UserDTO userDTO) {
		String query = "INSERT INTO TBL_USER2(user_number, user_id, user_pw, " + "user_name, user_phone) "
				+ "VALUES(seq_user2.NEXTVAL, ?, ?, ?, ?)";
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userDTO.getUserId());
			preparedStatement.setString(2, userDTO.getUserPw());
			preparedStatement.setString(3, userDTO.getUserName());
			preparedStatement.setString(4, userDTO.getUserPhone());

			int result = preparedStatement.executeUpdate();
			if (result >= 1) {
				System.out.println("가입 성공");
			} else {
				System.out.println("가입 실패");
			}

		} catch (SQLException e) {
			System.out.println("join() SQL오류!!");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//	   - 사용자 로그인	login 승우
	// 로그인 메소드(매개변수 id, pw)
	public int login(String userId, String userPw) {
		String query = "SELECT user_number " + "FROM tbl_user2 " + "WHERE user_id = ? AND user_pw = ?";
		int userNumber = -1;
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPw);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {

				userNumber = resultSet.getInt(1);
				System.out.println(userNumber);
			}

		} catch (SQLException e) {
			System.out.println("로그인 실패");
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return userNumber;
	}

//	2) 도서관리
//	   - 도서 등록 addBook 형우
	public void addBook(BookDTO bookDTO) {
		String query = "INSERT INTO TBL_BOOK " + "VALUES(SEQ_BOOK.NEXTVAL, ?, ?)";

		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bookDTO.getBookTitle());
			preparedStatement.setString(2, bookDTO.getBookAuthor());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("addBook() SQL오류");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//	   - 도서 목록 조회 bookList지수
	public List<BookDTO> bookList() {
		String query = "SELECT BOOK_NUMBER, BOOK_TITLE, BOOK_AUTHOR " + "FROM TBL_BOOK";

		List<BookDTO> bList = new ArrayList<>();
		BookDTO tempBookDTO = null;

		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				tempBookDTO = new BookDTO();
				tempBookDTO.setBookNumber(resultSet.getInt("book_number"));
				tempBookDTO.setBookTitle(resultSet.getString("book_title"));
				tempBookDTO.setBookAuthor(resultSet.getString("book_author"));
				bList.add(tempBookDTO);
			}
		} catch (SQLException e) {
			System.out.println("bookList() 메소드 오류");
			e.printStackTrace();
		} finally {

			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("close() 메소드 오류");
			}
		}
		return bList;
	}

//	   - 도서 검색 bookSearch동석
	public BookDTO bookSearch(int bookNumber) {

		String query = "SELECT book_number, book_title, book_author " + "FROM TBL_BOOK " + "WHERE BOOK_NUMBER = ?";

		BookDTO bookDTO = null;

		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, bookNumber);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				bookDTO = new BookDTO();

				bookDTO.setBookNumber(bookNumber);
				bookDTO.setBookTitle(resultSet.getString("book_title"));
				bookDTO.setBookAuthor(resultSet.getString("book_author"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("book조회 sql오류");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return bookDTO;

	}

//	3) 대여관리
//	   - 도서 대여 rentalBook 명진
// 도서 대여 메소드
	public void rental(int userNum, int bookNum, int day) {
		String query = "INSERT INTO TBL_RENTAL values(seq_rental.nextVal, ?, ?, sysdate, ?)";

		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, userNum);
			preparedStatement.setInt(2, bookNum);
			preparedStatement.setInt(3, day);

			int result = preparedStatement.executeUpdate();
			if (result == 1) {
				System.out.println("추가 완료");
			} else {
				System.out.println("추가 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//	   - 대여상태확인 rentalCheck 태현
	public RentalDTO rentalCheck(int bookNumber) {
		String query = "SELECT book_number, rental_number, user_number, rental_date, rental_day " + "FROM tbl_rental "
				+ "WHERE BOOK_NUMBER = ?";

		RentalDTO rentalDTO = null;

		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, bookNumber);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				rentalDTO = new RentalDTO();

				rentalDTO.setBookNumber(resultSet.getInt("book_number"));
				rentalDTO.setRentalNumber(resultSet.getInt("rental_number"));
				rentalDTO.setUserNumber(resultSet.getInt("user_number"));
				rentalDTO.setRentalDate(resultSet.getString("rental_date"));
				rentalDTO.setRentalDay(resultSet.getInt("rental_day"));
			}
		} catch (SQLException e) {
			System.out.println("rentalCheck() 오류!");
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return rentalDTO;

	}

}
