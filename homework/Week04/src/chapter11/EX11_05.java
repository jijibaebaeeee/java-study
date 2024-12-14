package bookExample;
// 예제 11-5 클래스의 자동 타입 변환-5
public class EX11_05 { // 메인클래스
	public static void main(String[] args) {
		
		DeskCalendar dc = new DeskCalendar("보라색", 6); // DeskCalendar의 객체생성
		dc.info(); // 부모인 Calendar 클래스의 .info 호출
		dc.hanging(); // 자식클래스에서 오버라이딩된 메소드가 호출
		dc.onTheDesk(); // 자식 클래스의 메소드 호출
		
		System.out.println();
		
		Calendar c = new DeskCalendar("검은색", 12); // 참조변수의 다형성. 업캐스팅이 되었다.
		c.info(); //  부모클래스의 메서드 호출
		c.hanging(); // 자식클래스에서 오버라이딩된 메소드 호출
	}
}
