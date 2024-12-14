package chapter12;
//예제 12-22 인터페이스 상속
public class TJmic implements BluetoothMIC1{ // Microphone1과 Speaker1을 상속받은 BluetoothMIC1을 구현하는 클래스 생성

	@Override
	public void sing() {
		System.out.println("마이크에 대고 노래를 부릅니다");
	}

	@Override
	public void music() {
		System.out.println("마이크에 장착된 스피커로 반주가 납니다");
	}

	@Override
	public void connect() {
		System.out.println("핸드폰과 블루투스 연결이 되었습니다.");
	}
	
	void hi() {
		System.out.println("안녕하세요");
	}
	
}
