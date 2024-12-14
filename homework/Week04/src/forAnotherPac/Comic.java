package forAnotherPac;
//예제 10-26 -> final 메서드
public class Comic extends Book{
	//필드
	boolean isColor;

	//생성자
	public Comic(String title, String author, boolean isColor) {
		super(title, author); // 부모 생성자 호출하여 초기화
		this.isColor = isColor; // 나머지 하나는 직접 초기화
	}
	
	
	//final 키워드가 붙은 메서드는 오버라이딩 대상이 아니다.
	
	@Override
	void info_author() {
		System.out.println("이 만화책의 저자는 " + author + "입니다.");
	}
	
	void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		}else {
			System.out.println("이 만화책은 흑백입니다.");
		}
	}
	
	

}
