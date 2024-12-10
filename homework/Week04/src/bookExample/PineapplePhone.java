package bookExample;

public class PineapplePhone extends Phone{

	@Override
	void openingLogo() { // 추상 클래스로부터 상속 받았으므로 추상 메소드의 오버라이딩 필수
		System.out.println("@@@");		
	}

}
