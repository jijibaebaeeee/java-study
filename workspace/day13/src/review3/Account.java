package review3;

public class Account {
	double balance;
	String name; // 추가
	
//	//생성자
//	public Account(String name) {
//		this.balance = 0; // 계좌 개설하면 0원 시작
//		this.name = name; // 계좌 객체별 이름 저장을 위해
//	}
	
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	
	// 메소드
	void deposit(double amount) {
		this.balance += amount;
		System.out.println(this.name +"님 성공적으로 입금되었습니다. 잔액은 " + this.balance + "원 입니다.");
	}
	



	void withdraw(double amount) {
		this.balance -= amount; // 오류 발생함
		
	}
	

}
