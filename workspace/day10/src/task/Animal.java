package task;

public class Animal {
//	1. 동물 클래스를 작성하세요
//	 필드(속성) : '이름', '나이', '종류'라는 필드
//	    - 이름 : 동물의 이름을 저장하는 곳
//	    - 나이 : 동물의 나이를 저장하는 곳
//	    - 종류 : 동물의 종류(개, 고양이, 새 등)를 저장하는 곳
//	 메서드(행동)
//	    - 밥먹기() : 동물이 밥을 먹는 행동을 하는 메서드
//	    - 놀기() : 동물이 노는 행동을 하는 메서드
//	    - 자다() : 동물이 자는 행동을 하는 메서드
//	    - 생일축하() : 동물의 생일을 축하하는 메서드
	
	String name;
	int age;
	String sort;
	
	
	// 인수 1개 요하는 생서자 생성 이름
	public Animal(String name) {

		this.name = name;
	}


	// 인수 2개 요하는 생성자 생성 이름 + 나이
	public Animal(String name, int age) {

		this.name = name;
		this.age = age;
	}
	
	// 매개 변수 3개 생성자
	
	
	
	void eat() {
		System.out.println(this.name + "이/가 밥을 먹습니다");
	}
	

	void play() {
		System.out.println(this.name + "이/가 신나게 놉니다");
	}
	
	void sleep() {
		System.out.println(this.name + "이/가 잠을 잡니다");
	}
	
	void birthday() {
		System.out.println(this.name + "의 생일을 축하합니다!");
	}


}
