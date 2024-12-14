package bookExample;
// 예제 12-1 추상클래스
public abstract class Receipt {
	String chef;

	
	//생성자
	public Receipt(String chef) {
		this.chef = chef;
	}
	
	void info() {
		System.out.println("이 레시피는 " + chef + "셰프님의 레시피입니다.");
	}
	

}
