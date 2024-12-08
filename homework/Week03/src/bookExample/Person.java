package bookExample;

// 예제 9-5 매개변수 2개로 객체 생성하기
public class Person {
	String name; // 필드
	int age; // 필드
	
	// 생성자 추가 Shift + Alt + S -> O
	public Person(String name, int age) { // 매개변수 2개로 생성자 추가
		this.name = name; // 입력받은 인수를 객체의 필드에 저장
		this.age = age; // 입력받은 인수를 객체의 필드에 저장
	}
	
	void introduce() {
		System.out.println("안녕하세요. 저는 " + this.age + "세 " + this.name + "입니다.");
	}
	
	
}
