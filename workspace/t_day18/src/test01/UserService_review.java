package test01;

import java.util.ArrayList;

public class UserService_review {
//	로직구성
//	<필드>
//	private ArrayList list; -> 회원정보를 저장할 list를 private으로 선언 -> 같은 클래스에서만 접근이 가능하겠구나 생각.
//
//	<메소드>
//	1. 아이디 중복검사 메소드
//	  리턴타입 : void (아직 모름) -> boolean
//	  메소드명 : checkId
//	  매개변수 : 객체?, 객체의 id값?
//	  구현부 : if 기존에 있던 id와 이번의 id가 같은경우 false
//					  다른경우 true
//
//	2. 회원가입 메소드
//	  리턴타입 : void
//	  메소드명 : signUp
//	  매개변수 : 모르겠음 -> 아직도 모르겠음
//	  구현부 : 회원가입에 성공했는지 실패했는지의 유무?
//		 if 아이디가 중복이 아니면 -> syso(회원가입에 성공했습니다)
//			else -> syso(아이디가 중복입니다 다시 입력해주세요)
//
//	3. 로그인 메소드
//	  리턴타입 : boolean
//	  메소드명 : login
//	  매개변수 : id와 비밀번호?
//	  구현부 : list에 저장되어있는 객체를 하나씩 순회하면서 id와 passwd가 맞는지 확인한다.
	
	//필드
	private ArrayList<UserVO_review> list = new ArrayList<>();
	
	//메소드 -> 다른클래스에서 UserVO_review 의 값이 필요하므로 getter 사용해야함
	boolean checkId(String id) {
		for(UserVO_review user : list) {
			if(user.getId().equals(id)) {
				return false;
			}
		
		}
		return true;
	}
	
//	void signUp(boolean check) {
//		if(check) {
//			System.out.println("회원가입 성공!");
//		}else {
//			System.out.println("id가 중복됩니다 다시 시도해주세요");
//		}
//	}
	
	void signUp(UserVO_review user) {
		if(checkId(user.getId())) {
			list.add(user);
			System.out.println("회원가입 성공!");
		}else {
			System.out.println("회원가입 실패!");
		}
	}
	
	boolean login(String id, String passwd) {
		for(UserVO_review user : list) {
			if(user.getId().equals(id) && (user.getPasswd().equals(passwd))) {
				return true;
			}
		}
		return false;
	}
	
}
