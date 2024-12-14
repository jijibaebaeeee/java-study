package chapter11;

//예제 11-4 클래스의 자동 타입 변환 4
public class DeskCalendar extends Calendar{

	//생성자
	public DeskCalendar(String color, int months) {
		super(color, months);
	}
	
	//상속받아서 오버라이딩했으니. 업캐스팅이 되어도 hanging 메소드는 이것이 출력된다.
	@Override
	void hanging() {
		System.out.println(color + " 달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	void onTheDesk() {
		System.out.println(color + " 달력을 책상에 세울 수 있습니다.");
	}
	
}
