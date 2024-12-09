package accessModifier2;

public class SuperCar extends Car{
	
	// 저장변수 필요없음. set 이 리턴값이 없기 때문 
	@Override
	void speedUp() {
		setSpeed(getSpeed() + 20);
		System.out.println("슈퍼카가 가속합니다" + getSpeed());
	}
	
	
}
