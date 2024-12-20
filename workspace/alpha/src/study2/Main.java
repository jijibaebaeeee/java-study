package study2;

public class Main {
//	2. Author 클래스
//	name과 email 필드 포함
//
//	Book 클래스
//	title 필드와 Author 객체 포함
//
//	public String getBookDetails() → 책의 제목과 저자를 반환
//
//	public void printBookDetail() → Book 객체에서 정보를 출력하세요.
	public static void main(String[] args) {
		
		Author au = new Author("배지수","isnna1@naver.com"); // Author 객체생성
		Author au2 = new Author("김박최", "kimparkchoi@hahaha.com"); // Author 객체 생성
		
		
		Book b1 = new Book("노인과바다", au); // Book 객체생성하고 Author 생성한 객체 넘기기...?
		Book b2 = new Book("나와너",au2); // Book 객체생성하고 Author 생성한 객체 넘기기...?
		
		System.out.println(b1.getBookDetails()); // Book 클래스의 메소드 호출

		b2.printBookDetail(); // Book 클래스의 메소드 호출
		
	}
}
