package homework;

public class Employee {
//	1) 직원 프로그램
//	Employee 클래스
//	필드 
//	   name, salary
//	메소드
//	   calculateBonus() : 기본적으로 salary * 0.1 반환
//
//	Manager와 Developer 클래스는 Employee 클래스 상속
//	Manager 클래스
//	   calculateBonus()를 오버라이딩하여 salary * 0.2 반환
//	Developer 클래스
//	   calculateBonus()를 오버라이딩하여 salary * 0.15 반환
//	메인 메소드에서 다형성을 사용하여 Employee 타입 배열에 각 객체를 저장하고, 보너스 계산
//	로직구성
//	Employee 클래스 생성
//
//	필드선언, 멤버변수 선언
//	String name;
//	int salary;
//
//	상속받을 Manager Developer 클래스 생성 + extends Employee
//	리턴타입 변수명 매개변수 (선언부) 동일하게 작성하여 오버라이딩 이용하기
//	메인 클래스 생성
	//	필드, 멤버변수 선언
	String name;
	int salary;

	//	메소드 선언
	void calculateBounus() {
		 System.out.println(this.name + "의 보너스는 : "+ this.salary * 0.1 + " 입니다." );
	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	// 생성자 정의
	
	

}
