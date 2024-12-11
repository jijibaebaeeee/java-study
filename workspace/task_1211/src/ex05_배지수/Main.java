package ex05_배지수;

public class Main {
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
//
//	 
//
//	(2) Pet 클래스
//	    Animal 추상 클래스를 상속받아 구현
//	생성자
//	    name을 매개변수로 받아 초기화
//	메소드
//	    void play() : 동물이 장난치는 행동을 출력
//	    void eat() : 동물이 먹는 행동을 출력
//	    void sleep() : 동물이 잠자는 행동을 출력
//	    void performActions() : 위 세 메소드를 호출하여 행동을 출력
//
//	 
//
//	(3) Zoo 클래스
//	필드
//	    Animal[] animals : 동물 객체 배열
//	    int animalCount : 현재 동물 수
//	생성자
//	    배열 크기를 매개변수로 받아 초기화
//	메소드
//	    void addAnimal : 동물을 배열에 추가, 매개변수는 참조변수의 다형성 이용할 것
//	        배열 크기를 초과하면 "더 이상 동물을 추가할 수 없습니다"를 출력
//	    void printAllAnimals() : 모든 동물의 이름과 행동을 출력
//
//
//	(4) Main 클래스
//	    Zoo 객체를 생성하여(3마리) printAllAnimals() 메소드를 호출하여 모든 동물의 행동을 출력

	// 로직구성
	// (1), (2), (3) 클래스 조건에 맞게 필드, 메서드, 추상메서드 선언하고, 생성자 생성
	// (3) 에서 Animal 배열 선언후 크기 만들기
	// <Main>
	// Zoo 객체 생성자 통해서 크기 전달
	// 
	public static void main(String[] args) {
		Zoo z = new Zoo(3); // 생성자를 이용해서 3칸의 Animal 타입의 배열 생성
//		int[] num = new int[3];
		Animal cat = new Pet("고양이");
		Animal dog = new Pet("멍멍이");
		Animal Iron = new Pet("IronMan");
		
//		z.animals = z.addAnimal(z);
		

		Animal[] animals = {cat, dog, Iron};
		
//		z.printAllAnimals(animals);
		
		
	
	
	
	
	
	}
	
}
