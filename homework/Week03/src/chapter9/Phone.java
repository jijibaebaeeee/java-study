package chapter9;

//예제 9-7 생성자 매개변수 부족
public class Phone { // 클래스 선언
	String brand;
	int series;
	String color = "검정색"; // 필드 기본값 초기화

	
	//예제 9-9 생성자 추가 (생성자 오버로딩)
	public Phone(String brand, int series) { // 매개변수 2개를 필요로하는 생성자 선언
		this.brand = brand; 
		this.series = series;
	}
	
	
	//모든 매개변수를 필요로하는 생성자 선언
	public Phone(String brand, int series, String color) { 
		this.brand = brand; // 각 객체의 필드에 저장
		this.series = series;
		this.color = color;
	}
	

	// 인스턴스 메소드 선언
	void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
