package exceptionTask;

public class AccountMain {
   public static void main(String[] args) {

      // AccountMain클래스
//         메인메소드
//         입금메소드 호출
//         출금메소드 호출

//         사용자 예외 정의 클래스
//         AccountException extends Exception
	   
	   // 로직구성
	   // Account 클래스 조건에 맞게 수정
	   // 
	   //
	   
	   
	   Account a = new Account();
	 
	   try {
		a.withdraw(5000);
	} catch (AccountException e) {
		System.out.println(e.getMessage());
	}
	   
	   
	   

   }
}
