package casting4;

public class Hulk extends Hero{

	
	//생성자
	public Hulk(String name) {
		super(name);
	}

	//메소드 오버라이딩
	@Override
	void superPower() {
		System.out.println(getName() + "가 거대해지며 공격합니다");
	}
	
	

}