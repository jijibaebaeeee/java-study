package study4;

import java.util.ArrayList;
import java.util.List;

public class UserService {
//	UserService 클래스
//	 회원정보를 저장할 list를 private으로 선언한다
//	 아이디 중복검사 메소드 정의(메소드명 : checkId)
//	 회원가입 메소드 정의(메소드명 : signUser)
//	 로그인 메소드 정의
//	 * 단, 모든 메소드에 예외처리를 추가해야한다 
//	 - null 또는 빈 문자열로 아이디를 검사할 경우 IllegalArgumentException을 발생시킨다 O -> 따로 클래스 만들필요 X
//	 - 중복 아이디 검사 중 발생할 수 있는 예외를 try-catch 블록으로 처리하여, 예외가 발생했을 때 적절한 메시지를 반환한다 -> main 에서 할까요?
//	 - 로그인 시 아이디와 비밀번호가 null이거나 빈 문자열인 경우 IllegalArgumentException을 발생시키도록 처리한다,
//	   try-catch를 사용하여 로그인 실패 시도와 예외를 구분하여 처리한다
//	 - 회원 리스트가 비어있을 경우 "저장된 회원이 없습니다" 메시지를 출력하고 함수를 종료한다
	private List<UserDTO> list = new ArrayList<>();

	public boolean checkId(String id) throws IllegalAccessException { // Object obj 안된다 + list가 매개변수도 아니다
		if(id.length() == 0) { // null 비교 어떻게?
			throw new IllegalAccessException("문자열의 길이가 0인 문자를 입력했습니다.");
		}else {
			if() // 리스트 비어있는경우 추가
				for(UserDTO user : list) {
					if(user.getId().equals(id)) {
						return false;
					}
				}
			}	
		return true;
		}
	
//	public void signUser(Object obj) { 이것은 왜 안되는가. . . .
//		if(obj instanceof UserDTO) {
//			obj = ((UserDTO)obj);
//		}
//		if(checkId(obj.))
//	}
	
	
	public void signUser(UserDTO user) {
		try {
			if(checkId(user.getId())){
				list.add(user);
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
