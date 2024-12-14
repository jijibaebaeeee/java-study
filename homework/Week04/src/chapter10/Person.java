package bookExample;
//예제 10-4 -> 상속에서 생성자
public class Person {
	//필드
	String name;
	int age;
	
	//생성자
	public Person(String name, int age) {
		this.name = name; // 객체 생성시 이름 초기화
		this.age = age; // 객체 생성시 나이 초기화
	}

}
