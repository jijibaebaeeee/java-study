package review;

public class Employee {
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	double calculateBonus(int salary) {  // void -> double
		 return  salary * 0.1;
	}
}
