package homework;

public class CheckingAccount extends Account{

	//생성자 생성
	public CheckingAccount(String name) {
		super(name);
	}
	
	@Override
	void withdraw(double amount) {
		System.out.println(this.name +"님 안녕하세요");
		if(amount == 0) {
			System.out.println(this.name + "님 안녕히가세요");
		}else if(this.balance - (amount + 1000) < 0.0) {
			System.out.println("출금 실패!");
		}else {
			System.out.println("출금 성공!");
			this.balance -= (amount + 1000);
			System.out.println("1000원의 수수료가 부과되었습니다. 잔액은 : " + this.balance + "원 입니다");
		}
	}

	
	
	
	
	

}
