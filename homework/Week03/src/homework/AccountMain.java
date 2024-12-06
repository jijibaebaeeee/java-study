package homework;

public class AccountMain {
	public static void main(String[] args) {
		
		SavingsAccount ac1 = new SavingsAccount("배지수");
		SavingsAccount ac2 = new SavingsAccount("허준혁");
		CheckingAccount ac3 = new CheckingAccount("문준혁");
		CheckingAccount ac4 = new CheckingAccount("임초현");
		
		ac1.deposit(10000);
		ac2.deposit(10000);
		ac3.deposit(10000);
		ac4.deposit(10000);
		
		ac1.withdraw(20000); // 더 많이
		ac2.withdraw(2000); // 더 적게
		ac1.withdraw(0); // 안녕히가세요 출력
		ac3.withdraw(9000); // 딱 맞게
		ac4.withdraw(0); // 취소한 경우는 수수료도 안 받게
	}

}
