package chapter11;
//예제 11-3 클래스의 자동 타입 변환 3
public class Calendar {
	//필드
	String color;
	int months;
	
	//매개변수를 모두 갖는 생성자
	public Calendar(String color, int months) {
//		super();
		this.color = color;
		this.months = months;
	}
	
	void info() {
		System.out.println(color + "달력은 " + months + "월까지 있습니다.");
	}
	
	void hanging() {
		System.out.println(color + " 달력을 벽에 걸 수 있습니다.");
	}
}
