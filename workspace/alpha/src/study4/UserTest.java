package study4;

public class UserTest {
//	2. 회원관리 시스템을 아래 요구사항에 맞게 만드세요
//	UserDTO 클래스
//	 필드 private 아이디, 비밀번호, 이름, 나이
//	 생성자를 통해서만 초기화 – 단 회원의 리스트만 초기화한다
//	 toString() 재정의하여 모든 필드의 값을 확인할 수 있도록 한다
//	 모든 필드의 getter 메소드를 만든다
//
//	UserService 클래스
//	 회원정보를 저장할 list를 private으로 선언한다
//	 아이디 중복검사 메소드 정의(메소드명 : checkId)
//	 회원가입 메소드 정의(메소드명 : signUser)
//	 로그인 메소드 정의
//	 * 단, 모든 메소드에 예외처리를 추가해야한다
//	 - null 또는 빈 문자열로 아이디를 검사할 경우 IllegalArgumentException을 발생시킨다
//	 - 중복 아이디 검사 중 발생할 수 있는 예외를 try-catch 블록으로 처리하여, 예외가 발생했을 때 적절한 메시지를 반환한다
//	 - 로그인 시 아이디와 비밀번호가 null이거나 빈 문자열인 경우 IllegalArgumentException을 발생시키도록 처리한다,
//	   try-catch를 사용하여 로그인 실패 시도와 예외를 구분하여 처리한다
//	 - 회원 리스트가 비어있을 경우 "저장된 회원이 없습니다" 메시지를 출력하고 함수를 종료한다
//
//	UserTest 클래스
//	 main 메소드에 객체 2개 생성 후 list에 저장하고 모든 메소드 호출
	
	public static void main(String[] args) {
		UserService us = new UserService();
		
		UserDTO dto = new UserDTO("isnna1","1234","배지수", 26); // 리스트에 추가하는법
		
		
		us.
		
		
		try {
			if(us.checkId("isnna1")) {
				System.out.println("중복이 없습니다.");
			}else {
				System.out.println("중복입니다.");
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
}
