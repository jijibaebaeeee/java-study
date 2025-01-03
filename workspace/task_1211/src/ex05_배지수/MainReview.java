package ex05_배지수;

public class MainReview {
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
//	(4) Main 클래스
//	    Zoo 객체를 생성하여(3마리) printAllAnimals() 메소드를 호출하여 모든 동물의 행동을 출력
	
	public static void main(String[] args) {
		ZooReview z = new ZooReview(3); // 3칸 생성을 했음.
		
		z.addAnimal(new PetReview("멍이"));
		z.addAnimal(new PetReview("냥이"));
		z.addAnimal(new PetReview("아이언맨"));
		z.addAnimal(new PetReview("배지수"));
		
		z.printAllAnimals();
	}
	
	
}
