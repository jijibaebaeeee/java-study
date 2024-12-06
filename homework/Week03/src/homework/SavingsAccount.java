package homework;

public class SavingsAccount extends Account{
	
	//생성자 생성
	public SavingsAccount(String name) {
		super(name);
	}
	
	
	
	
	@Override
	void withdraw(double amount) {
		System.out.println(this.name +"님 안녕하세요");
		if(amount == 0) {
			System.out.println(this.name + "님 안녕히가세요");
		}else if(this.balance - amount < 0.0) {
			System.out.println("출금 실패!");
		}else {
			System.out.println("출금 성공!");
			this.balance -= amount;
			System.out.println("잔액은 " + this.balance +"원 입니다.");
		}
	}


	
	
	
}
