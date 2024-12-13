package bookExample;
//예제 11-7 강제형변환2
public class FourWheelBike extends Bike{
	//생성자
	public FourWheelBike(String riderName) {
		super(riderName);
	}
	
	//부모클래스의 info() 메소드 오버라이딩. 업캐스팅되어도 이 메서드는 출력된다.
	@Override
	void info() {
		super.info(); // 부모의 info() 메서드 호출
	}
	
	//메서드
	void addWheel() {
		if(wheel == 2) { // 바퀴가 2개면
			wheel = 4; // 4개로
			System.out.println(riderName + "의 자전거에 보조 바퀴를 부착하였습니다."); // 출력문
		}else { // 2개가 아니면
			System.out.println(riderName + "의 자전거에 이미 보조 바퀴가 부착되어 있습니다."); // 출력문
		}
	}
	
}
