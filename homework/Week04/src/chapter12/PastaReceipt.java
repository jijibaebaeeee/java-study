package chapter12;

public class PastaReceipt extends Receipt{

	//생성자
	public PastaReceipt(String chef) {
		super(chef);
	}
	
	void makeSource() {
		System.out.println("파스타 소스를 직접 만듭니다.");
	}
}
