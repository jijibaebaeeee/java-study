package homework;

public class Account {
//	3) 잔액확인 프로그램
//	SavingsAccount와 CheckingAccount 클래스는 Account 클래스 상속
//	Account 클래스
//	필드
//	   balance
//	메소드
//	   deposit(double amount) : 금액을 추가
//	   withdraw(double amount) : 금액을 차감
//
//	SavingsAccount 클래스
//	메소드 
//	   withdraw()를 오버라이딩하여 출금 시 잔액이 부족하면 "출금 실패!" 출력
//
//	CheckingAccount 클래스
//	메소드
//	   withdraw()를 오버라이딩하여 추가로 1000원을 수수료로 부과
//
//	메인 메소드에서 두 클래스의 객체를 생성하고 입출금을 수행결과 출력
	
	// 로직구성
	// Account 클래스 생성
	// int balance (잔액)
	// void deposit(double amount) -> 아직 리턴타입 모르겠음 -> void쓰고 출력하기
	// void withdraw(double amount) -> "
	
	// SavingsAccount 클래스 생성 + extends
	// Shift + Alt + s -> v 메소드 오버라이딩
	// 조건에 맞게 수정
	
	// CheckingAccont 클래스 생성 + extends
	// Shift + Alt + s -> v 메소드 오버라이딩
	// 조건에 맞게 수정
	
	// 메인 메소드에서 두 클래스의 객체를 생성하고 입출금을 수행결과 출력
	
	// 필드
	double balance;
	String name; // 추가
	
	//생성자
	public Account(String name) {
		this.balance = 0; // 계좌 개설하면 0원 시작
		this.name = name; // 계좌 객체별 이름 저장을 위해
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
