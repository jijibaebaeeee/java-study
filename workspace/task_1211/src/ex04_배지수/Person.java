package ex04_배지수;

public class Person {
//	[요구사항]
//	(1) Person 클래스
//	    - 필드 (private) : String name(학생 이름)
//	    - 생성자 : 이름을 매개변수로 받아 초기화
//	    - 메소드
//	        getName() : name 필드의 값을 반환
	
	
	//필드
	private String name;
	
	
	//생성자
	public Person(String name) {
		this.name = name;
	}
	

	//메소드
	void getName() {
		System.out.println(this.name);
	}

}
