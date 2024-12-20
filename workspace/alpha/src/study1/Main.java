package study1;

public class Main {
//	1. Person (부모 클래스)
//	name 필드와 public void introduce() 메소드 포함
//
//	Student와 Teacher (자식 클래스)
//	각각 introduce()를 오버라이드하여 다른 출력 내용 작성
//
//	public void introducePerson() → 다형성을 사용해 객체 정보를 출력하세요.
	
	
	public static void main(String[] args) {
		
		Person p1 = new Student(); // Student 객체 업캐스팅 하여 생성
		Person p2 = new Teacher(); // Teacher 객체 업캐스팅 하여 생성
		
		Student s1 = new Student(); // 업캐스팅 없이 객체 생성
		Teacher t1 = new Teacher(); // 업캐스팅 없이 객체 생성
		
		Person p = new Person(); // Person 객체 생성
		
		Main main = new Main(); // introducePerson 메소드 사용을 위해 메인 참조변수 생성
		
		main.introducePerson(p1); // 메소드 호출
		main.introducePerson(p2); // 메소드 호출
		main.introducePerson(p); // 메소드 호출
		
		main.introducePerson(s1); // 업캐스팅하여 메소드 호출
		main.introducePerson(t1); // 업캐스팅하여 메소드 호출
		
		
		
	}
	
	public void introducePerson(Person person) {
		person.introduce(); // Person 객체만 자신의 메서드를 호출하고
							// 자식들은 오버라이딩 된 메소드 호출한다.
	}
	
}
