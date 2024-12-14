package chapter11;
// 예제 11-14 ComputerRoom 객체를 만들어줄 클래스
public class EX11_14 {
	public static void main(String[] args) {
		ComputerRoom1 cr = new ComputerRoom1();
		cr.computer1 = new LZ();
		cr.computer2 = new LZ();
		
		cr.allPowerOn();
		cr.allPowerOff();
	}

}
