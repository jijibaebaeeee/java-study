package homework;

public class Book {
//	2) 도서 프로그램
//	Book 클래스 
//	필드
//	   title, author
//
//	생성자
//	기본 생성자 : 제목과 작가를 "알수없음"으로 초기화
//	매개변수 생성자 : 제목만 받아 작가를 "알수없음"으로 초기화
//	매개변수 생성자 : 제목과 작가를 모두 받아 초기화
//
//	EBook 클래스 Book 클래스를 상속
//	필드
//	   sizeInMB
//
//	생성자
//	기본 생성자
//	   super()를 호출하여 제목과 작가를 "알수없음"으로 초기화하고 크기를 0으로 설정
//	매개변수 생성자 
//	   제목, 작가, 크기를 받아 초기화
	
	// 로직 구성
	// Book 클래스 생성
	// String 형 title, author 멤버변수 선언
	// 생성자 3개를 생성해야함
	// EBook 클래스 생성
	// extends를 사용하여 Book 상속
	// int형 ..? sizeInMB 
	// 기본 생성자에 맞게 생성
	// 매개변수 생성자에 맞게 생성
	// Main에서 객체를 만들어서 테스트
	
	// 필드
	String title;
	String author;
	
	
	// 기본 생성자
	public Book() {
		this.title = "알수없음";
		this.author = "알수없음";
	}
	
	// 생성자(제목만)
	public Book(String title) {
		this.title = title;
		this.author = "알수없음";
	}

	// 생성자(제목+작가)
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// 메소드
	void printInfo() {
		System.out.println("제목 : " + this.title + ", 작가 : " + this.author);
	}
	
	
	
	
	
	
	
}
