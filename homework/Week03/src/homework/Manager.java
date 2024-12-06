package homework;

public class Manager extends Employee {

	//Shift + Alt + S -> V 로 오버라이드
	@Override
	void calculateBounus() {
		System.out.println(this.name + "의 보너스는 : "+ this.salary * 0.2 + " 입니다." );
	}

	
	//생성자 생성
	public Manager(String name, int salary) {
		super(name, salary);
	}
	
	
	
	
}
