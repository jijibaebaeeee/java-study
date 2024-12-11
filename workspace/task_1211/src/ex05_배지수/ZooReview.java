package ex05_배지수;

public class ZooReview {
	//필드
	AnimalReview[] animals;
	int animalCount = 0;
	
	//생성자
	public ZooReview(int size) {
//		super();
//		this.animalCount = animalCount;
		animals = new AnimalReview[size];
	}
	
	//메소드
	void addAnimal(AnimalReview a) { // 업캐스팅하여 전달
		if(animalCount == 3) {
			System.out.println("더 이상 동물을 추가할 수 없습니다.");
		}else {
			animals[animalCount] = a;
			animalCount++;
			System.out.println("추가 완료");
			
		}
	}
	
	void printAllAnimals() {
		for(AnimalReview animal : animals) {
			animal.performActions();
		}
	}

}
