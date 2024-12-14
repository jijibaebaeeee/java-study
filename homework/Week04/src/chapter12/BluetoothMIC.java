package chapter12;
//예제 11-17 -> 다중 인터페이스
public class BluetoothMIC implements Microphone, Speaker{ // 인터페이스 구현 클래스


	@Override
	public void sing() { // 오버라이딩 필수
		System.out.println("마이크에 대고 노래를 부릅니다");
	}
	
	@Override
	public void music() { // 오버라이딩 필수
		System.out.println("마이크에 장착된 스피커로 반주가 납니다");
	}

}
