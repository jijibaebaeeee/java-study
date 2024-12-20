package study3;

public class PaypalPayment implements Payment{
	double balance;
	@Override
	public void processPayment(double amount) {
		this.balance += amount;
		System.out.println("잔액은 : " + this.balance + "원 입니다.");
		
	}
	
	public void handlePayment(double amount) {
		this.balance -= (amount + 2000);
		System.out.println("2000원의 수수료를 차감하여 잔액은 : " + this.balance + "원 입니다.");
	}

}
