package review;

public class Manager extends Employee {
	//생성자 생성
	public Manager(String name, int salary) {
		super(name, salary); // 부모의 생성자(Employee 클래스)
	}

	@Override
	double calculateBonus(int salary) {
		return salary * 0.2;
	}
	
	
	

}
