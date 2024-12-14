package chapter10;

//예제 10-9 -> 메서드 오버라이딩
public class EX10_09 {
	public static void main(String[] args) {
		Samsong s = new Samsong(); // Samsong 클래스 타입의 객체 생성
		s.powerOn(); // Samsong 클래스에 있는 오버라이딩된 메서드 호출
		s.powerOff(); // 오버라이딩 없으므로 부모클래스의 메서드 호출
		
		Computer c = new Computer(); // Computer 클래스 타입의 객체 생성
		c.powerOn(); // Computer 클래스에 있는 powerOn() 호출
		c.powerOff(); // Computer 클래스에 있는 powerOff() 호출
	}

}
