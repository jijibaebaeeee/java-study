package constructorOverloading;
// 10번 : 생성자 오버로딩
public class Person {
	//필드
	String name;
	int age;
	String job;

	
	//생성자
	public Person() {
		System.out.println("기본생성자가 호출되었습니다."); // 출력되면 이것이 호출된다.
	}

	//이름을 초기화하는 생성자
	public Person(String name) {
		this.name = name;
//		this.age = 20;
		System.out.println("이름은 인수로 받고, " + " 나이는 0살 기본값으로 할당한 생성자가 호출되었습니다.");
	}
	
	//이름과 나이를 초기화 하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.job = "미정";
		System.out.println("이름과 나이를 초기화하는 생성자가 호출되었습니다.");
	}
	
	// 이름과 직업을 초기화 하는 생성자
	public Person(String name, String job) {
	}


	
//	// 직업과 이름을 초기화 하는 생성자   -> 오버로딩 안된다. -> 같은 타입의 매개변수를 가지기 때문이다.
//	public Person(String job, String name) {
//	}
	
	// 모든 정보를 초기화하는 생성자
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	


}
