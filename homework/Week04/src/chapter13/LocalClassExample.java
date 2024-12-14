package chapter13;
//예제 13-3 지역 클래스 예제
public class LocalClassExample {
	private int speed = 10;
	
	public void getUnit(String unitName) { // 메서드 시작영역
		//예제 13-5 지역 클래스의 접근 제한
//		unitName = unitName + "님"; // 지역 클래스에서 메서드 내의 변수를 사용할 때 해당 벼수가 변경되면 오류가 발생한다.
		class Unit{ // 메서드 안의 내부클래스 시작 영역
			public void move() { // 내부 클래스의 메서드 시작 영역
				System.out.println(unitName + "이 " + speed + " 속도로 이동합니다."); // 출력문
			} // 내부 클래스의 메서드 끝 영역
		} // 메서드 안의 내부클래스 끝 영역
		
		Unit unit = new Unit(); // 내부클래스인 Unit 클래스 객체 생성
		unit.move(); // 내부 클래스에 있는 메소드 호출
		
	} // 메서드 끝 영역
	
	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();
		local.getUnit("마린");
	}
	
	
	
	
}
