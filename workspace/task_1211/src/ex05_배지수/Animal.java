package ex05_배지수;

public abstract class Animal {
//	5. 동물원 프로그램을 구현하라
//	[요구사항]
//	(1) 추상 클래스 Animal
//	필드
//	    String name : 동물 이름 (protected)
//	생성자
//	    이름을 매개변수로 받아 초기화
//	메소드
//	    String getName() : 동물의 이름을 반환
//	    void performActions() : 추상 메소드, 동물의 행동을 출력
	// 필드
	protected String name; // 상속받는 경우에만 접근 가능함

	//생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	//메소드
	String getName() {
		return this.name;
	}
	
	//추상메서드 -> 오버라이딩 필수
	abstract void performActions();
	

}
