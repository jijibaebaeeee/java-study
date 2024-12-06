package homework;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee("배지수", 80); // employee는 현재 Employee 클래스의 참조값을 가짐
		Manager manager = new Manager("문준혁님", 100);
		Developer developer = new Developer("임초현님", 120);
		
		Employee[] arr = new Employee[3]; // arr은 Employee 타입인 배열의 시작주소를 가진다.
		arr[0] = employee; // arr[0] 은 employee 클래스의 참조값을 가진다
		arr[1] = manager; // arr[1] 은 manager 클래스의 참조값을 가진다
		arr[2] = developer; //arr[2] 는 developer 클래스의 참조값을 가진다
		
		//결과 출력
		arr[0].calculateBounus();
		arr[1].calculateBounus();
		arr[2].calculateBounus();
		
		
	}

}
