package forAnotherPac;
// 예제 10-25 -> final 메서드
public class Book { // 클래스 선언
	//필드
	String title;
	String author;
	
	//생성자
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	final void info_title() { // final 로 선언했기때문에 상속받아도 오버라이딩이  불가능
		System.out.println("책의 제목은" + title + "입니다."); // 출력
	}
	
	void info_author() {
		System.out.println("책의 저자는" + author + "입니다.");
	}
	
}
