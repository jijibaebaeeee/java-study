package ex05_배지수;

public class Pet extends Animal{

//	(2) Pet 클래스
//    Animal 추상 클래스를 상속받아 구현
//생성자
//    name을 매개변수로 받아 초기화
//메소드
//    void play() : 동물이 장난치는 행동을 출력
//    void eat() : 동물이 먹는 행동을 출력
//    void sleep() : 동물이 잠자는 행동을 출력
//    void performActions() : 위 세 메소드를 호출하여 행동을 출력
	
	public Pet(String name) {
		super(name);
	}
	
	void play() {
		System.out.println(this.getName() + "이 장난을 칩니다");
	}
	
	void eat() {
		System.out.println(this.getName() + "이 밥을 먹습니다");
	}
	
	void sleep() {
		System.out.println(this.getName() + "이 잠을 잡니다");
	}
	
	@Override
	void performActions() {
		play();
		eat();
		sleep();
		
	}
	
	

}
