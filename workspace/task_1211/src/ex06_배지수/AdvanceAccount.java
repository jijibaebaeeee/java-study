package ex06_배지수;

public interface AdvanceAccount extends Account{
//	final rate = ??;
	
	void addInterest(double rate);
	
	void transfer(Account target, double amount);
	
	void receive(double amount);
}
