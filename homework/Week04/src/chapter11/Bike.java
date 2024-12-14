package chapter11;
//예제 11-6 강제형변환1
public class Bike {
	//필드
	String riderName;
	int wheel = 2;
	
	//생성자
	public Bike(String riderName) {
//		super();
		this.riderName = riderName;
	}
	
	//메서드
	void info() {
		System.out.println(riderName + "의 자전거는 " + wheel + "발 자전거입니다.");
	}
	
	void ride() {
		System.out.println("씽씽");
	}
	
}
