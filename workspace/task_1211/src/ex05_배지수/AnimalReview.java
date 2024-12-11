package ex05_배지수;

public abstract class AnimalReview {
	//필드
	protected String name;

	//생성자
	public AnimalReview(String name) {
//		super();
		this.name = name;
	}
	
	//메소드
	String getName() {
		return this.name;
	}
	
	abstract void performActions(); // 추상메소드
	
}
