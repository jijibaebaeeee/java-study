package bookExample;
// 예제 12-9 -> 인터페이스 선언
public interface Phone1 {
	//예제 12-10 -> 상수 추가
	public static final int MAX_BATTERY_CAPACITY = 100;
	
	abstract void powerOn(); // 구현부는 존재하지 않음.
	abstract void powerOff();
	abstract boolean isOn();
	abstract void watchUtube();
	abstract void charge();
}
