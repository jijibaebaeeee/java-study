package test01;

public class Main_review {
//	UserVO 클래스의 객체를 3개 생성한다 + 생성자에 맞게 인수를 전달한다.
//	  각 객체를 생성할 때, 기존에 저장되어있는 id와 비교를 해야한다. -> 어떻게 ? 어떻게 UserVO 클래스의 객체와 UserService 클래스의 ArrayList와 연결할 것이냐?
	public static void main(String[] args) {
		UserService_review usr = new UserService_review();
		
		//생성자 있는곳에 생성을 해야할거아니냐
		UserVO_review ur1 = new UserVO_review(1, "isnna1", "1234", "배지수", 26);
		UserVO_review ur2 = new UserVO_review(2, "isnna2", "1234", "지수", 25);
		UserVO_review ur3 = new UserVO_review(3, "isnna3", "1234", "수", 24);
		
		usr.signUp(ur1);
		usr.signUp(ur2);
		usr.signUp(ur3);
		
		System.out.println(usr.checkId(ur1.getId()));
		System.out.println();
		
		
		System.out.println("로그인 결과" + usr.login(ur1.getId(), ur1.getPasswd()));
		System.out.println("로그인 결과" + usr.login("isnna1", "1234"));
		System.out.println("로그인 실패 결과" + usr.login("isnna2", "12234"));
		
		
	}




}
