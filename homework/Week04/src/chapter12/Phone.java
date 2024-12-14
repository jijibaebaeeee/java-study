package chapter12;
//예제 12-5 -> 추상 메서드 오버라이딩 및 재정의
public abstract class Phone {
	abstract void openingLogo(); // 추상 메소드생성 -> 추상 클래스 확정
	
	void powerOn() { // 일반 메소드 선언
		openingLogo(); // 추상 메소드 호출
		System.out.println("핸드폰이 켜집니다."); // 출력문
	}
	
	void powerOff() { // 일반 메소드 선언
		openingLogo(); // 추상 메소드 호출
		System.out.println("핸드폰이 꺼집니다."); // 출력문
	}

}
