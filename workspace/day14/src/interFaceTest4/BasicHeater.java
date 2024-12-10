package interFaceTest4;

public class BasicHeater extends HeaterAdapter{ // 완화한 Adapter 클래스를 상속받아서 강제성 없애기.

	@Override
	public void on() {
		System.out.println("버튼으로 히터를 켭니다");
	}

	@Override
	public void off() {
		System.out.println("버튼으로 히터를 끕니다");
	}
}
