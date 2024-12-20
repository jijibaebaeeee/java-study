package study2;

public class Book {
	//필드
	String title;
	Author author;
	
	//생성자
	public Book(String title, Author author) {
		this.title = title;
		this.author = author;
	}
	
	
	//메서드
	public String getBookDetails() {
		return "책 제목 : " + this.title + ", 저자 : " + this.author.name;
	}
	

	//메서드
	public void printBookDetail() {
		System.out.println("책 제목 : " + this.title + ", 저자 : " + author.name
				+ ", 저자 이메일 : " + author.email);
	}
	

}
