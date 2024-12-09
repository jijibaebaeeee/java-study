package review;

public class Developer extends Employee{
	//생성자 생성
	public Developer(String name, int salary) {
		super(name, salary);
	}

	@Override
	double calculateBonus(int salary) {
		return 0.15 * salary;
	}
	
	

}
