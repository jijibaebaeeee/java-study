package chapter12;

public class EX12_18 {
	public static void main(String[] args) {
		BluetoothMIC bm = new BluetoothMIC();
		bm.music();
		bm.sing();
		Microphone m = bm; // 업캐스팅 되었다.
		Speaker s = bm; // 업캐스팅 되었다.
	}

}
