package bookExample;

public class StakeReceipt extends Receipt{
	
	//생성자
	public StakeReceipt(String chef) {
		super(chef);
	}
	
	void grillStake() {
		System.out.println("스테이크를 맛있게 굽습니다.");
	}
}
