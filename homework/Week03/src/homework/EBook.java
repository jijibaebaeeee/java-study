package homework;

public class EBook extends Book{
	//필드
	double sizeInMB;
	
	//기본생성자
	public EBook() {
		super("알수없음","알수없음"); // 부모의 생성자를 호출하여 제목 작가에 알수없음 저장
		this.sizeInMB = 0; // 해당 객체의 사이즈는 0으로 초기화
	}

	//매개변수 생성자(제목 작가 사이즈)
	public EBook(String title, String author, double sizeInMB) {
		super(title, author); // 부모의 생성자를 호출하여 제목 작가에 알수없음 저장
		this.sizeInMB = sizeInMB; // 받은 크기로 초기화
	}

	//메소드 오버라이딩
	@Override
	void printInfo() {
		System.out.println("제목 : " + this.title + ", 작가 : " + this.author + ", 크기 : " + this.sizeInMB +"MB");
	}
	
	
	
}
