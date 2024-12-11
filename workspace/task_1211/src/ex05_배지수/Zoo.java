package ex05_배지수;

public class Zoo {
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
	
	//필드
	Animal[] animals ; // 동물 객체 배열 바로 업캐스팅 가능
	int score;
	int animalCount; // 현재 동물 수
	
	//생성자
	public Zoo(int size) {
		super();
		Animal[] animals = new Animal[size];
	}
	
	//메서드
	void addAnimal(Animal[] ani) {
		if(animalCount > ani.length) {
			System.out.println("더 이상 동물을 추가할 수 없습니다.");
			return; // 메서드 끝내기
		}else {
			System.out.println("추가 완료했습니다.");
			this.animalCount++;
		}

		
	}
	
//	void printAllAnimals(Animal[] ani) {
//		Animal.performActions(ani);
//		
//	}
	

}
