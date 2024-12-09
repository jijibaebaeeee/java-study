package review2;

public class Book {

	String title;
	String author;

//	// 기본 생성자 (내가한것)
//	public Book() {
//		this.title = "알수없음";
//		this.author = "알수없음";   // 총 2줄
//	}
	public Book() {
		this("알수없음", "알수없음");  // 총 1줄
	}
	
	// 생성자(제목만)
	public Book(String title) {
		this(title, "알수없음");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

}
