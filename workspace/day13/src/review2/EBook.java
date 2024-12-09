package review2;

public class EBook extends Book {
	// 필드
	double sizeInMB;

//	// 기본생성자 (내가 한 것)
//	public EBook() {
//		super("알수없음", "알수없음"); // 부모의 생성자를 호출하여 제목 작가에 알수없음 저장
//		this.sizeInMB = 0; // 해당 객체의 사이즈는 0으로 초기화
//	}

	// 생성자
	public EBook() {
		this("알수없음", "알수없음", 0); // -> 모든 
	}

	public EBook(String title, String author, double sizeInMB) {
		super(title, author);
		this.sizeInMB = sizeInMB;
	}
}
