package exceptionTask;

public class Account {
	//필드
	private int balance; //잔고

	//생성자
	public Account() {
//		super();
		this.balance = 10000;
	}
	
	//게터
	public int getBalance() {
		return balance;
	}
	
	// 출금메소드 : withdraw 매개변수 1개
	//   잔액보다 출금금액이 크다면 출금불가 예외처리/현재 잔고는 _원입니다. 출금금액의 _원이 부족하여 출금이 불가능합니다 출력
	void withdraw (int money) throws AccountException { // 이것을 호출하는 쪽으로 예외를 던질것이므로 throws 붙이기
		if(this.balance < money) {
			throw new AccountException("출금이 불가합니다. 현재 잔고는 " + this.balance + "원이고," + "출금금액의 + " + money + "원이 불가능합니다.");
		}else {
			this.balance -= money;
		System.out.println(money+ "원이 출금되었습니다. 잔액 : " + this.balance);
		}
	}
    // 입금메소드 : deposit 매개변수 1개
	//  잔액에 입금된 금액 추가후 입금된 금액은 _원입니다. 현재 잔고는 _원입니다. 출
	void deposit(int money) {
		this.balance += money;
		System.out.println("입금된 금액은 " + money + "원 입니다. 현재 잔고는 " + this.balance + "원입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
