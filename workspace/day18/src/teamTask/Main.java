package teamTask;

public class Main {
	/* Main클래스
	 * Main 클래스
	 * 객체 3개 생성, 오버라이딩 된 메소드 포함한 모든 메소드 출력
	 * 로직구성
	 * 
	 * sign()
	 * 
	 * 객체 3개 생성
	 * 
	 * UserService us1 = new UserService(1, a, 배, 1234);
	 * UserService us2 = new UserService(2, b, 형우님, 1234);
	 * 
	 * list.add(us1);
	 * list.add(us2);
	 * 
	 * 
	 *                   (new UserService(1, a, 배지수, 1234), new UserSErvice(
	 * 
	 * */
	
	
	public static void main(String[] args) {
		UserService us = new UserService();
		
		us.sign(); // 회원가입 메소드 호출
		us.sign();
		us.sign();
		
		
	}
	
	
	
	

}
