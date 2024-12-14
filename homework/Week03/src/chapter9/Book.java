package chapter9;

// 에제 9-11 오버로딩
public class Book {
	String title = "제목없음";
	int series = 1;
	int page = 100;
	
	// 기본 생성자 
	Book(){
		
	}
	
	// 매개변수 1개 받는 생성자(오버로딩)
	public Book(String title) {
		this.title = title;
	}
	
	// 매개변수 2개 받는 생성자(오버로딩)
	public Book(String title, int page) {
		this.title = title;
		this.page = page;
	}

	// 매개변수 2개 받는 생성자(오버로딩) 매개변수의 순서를 바꿔서 가능
	public Book( int series, String title) {
		super();
		this.title = title;
		this.series = series;
	}
	
	
	
	
	
	
	
	
}
