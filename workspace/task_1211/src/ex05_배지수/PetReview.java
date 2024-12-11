package ex05_배지수;

public class PetReview extends AnimalReview {
	
	public PetReview(String name) {
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
