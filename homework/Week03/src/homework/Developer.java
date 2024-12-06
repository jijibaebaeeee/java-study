package homework;

public class Developer extends Employee{
	
	//Shift + Alt + S -> V
	@Override
	void calculateBounus() {
		System.out.println(this.name + "의 보너스는 : "+ this.salary * 0.15 + " 입니다." );
	}

	//생성자 생성
	public Developer(String name, int salary) {
		super(name, salary);
	}
	
	
	

}
