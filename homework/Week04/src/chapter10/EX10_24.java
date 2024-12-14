package chapter10;

//예제 10-24 -> N차 상속
public class EX10_24 {
	public static void main(String[] args) {
		SchoolBus sb = new SchoolBus(10); // SchoolBus 클래스의 객체 생성
		sb.takePerson(); // SchoolBus의 tkakePerson() 호출 -> super 때문에 부모의 것도 호출된다.
		sb.ride(); // 오버라이딩때문에 자식의 것이 호출이된다.
	}

}
