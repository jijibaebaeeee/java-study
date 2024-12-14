package chapter12;
//예제 12-21 인터페이스 상속
public interface BluetoothMIC1 extends Microphone1, Speaker1{ // implements 키워드로 받을 수 없음. 같은 인터페이스로 구현을 할 수 없으므로
	abstract void connect();
}
