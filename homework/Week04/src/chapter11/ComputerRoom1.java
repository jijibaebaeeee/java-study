package chapter11;

//예제 11-11 ComputerRoom1 객체를 만들어줄 클래스
public class ComputerRoom1 {
	//필드
//	Samsong computer1; // Samsong 타입의 computer1 변수? 선언
//	Samsong computer2; // Samsong 타입의 computer1 변수 선언
	
	//예제 11-13 코드수정
	LZ computer1;
	LZ computer2;
	
	//메서드
	void allPowerOn() {
		computer1.powerOn(); // computer1 클래스의 powerOn()메소드 호출
		computer2.powerOn(); // computer2 클래스의 powerOn()메소드 호출
	}
	
	void allPowerOff() {
		computer1.powerOff(); // computer1 클래스의 powerOff()메소드 호출
		computer2.powerOff(); // computer2 클래스의 powerOff()메소드 호출
	}
}
