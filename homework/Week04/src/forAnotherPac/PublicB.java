package bookExample1;

import bookExample.*; // 다른 클래스에서 사용하기 위해 임포트

//예제 10-12 -> 접근 제한자 public
public class PublicB {
	public static void main(String[] args) {
		PublicA a = new PublicA(10); // PublicA 클래스의 객체 생성 + 생성자로 초기화
		a.printA(); // PublicA 클래스의 printA 메서드 호출
		
		//예제 10-15 접근 제한자 default
//		DefaultC c = new DefaultC(); default 클래스 이므로 임포트를 해와도 객체 생성이 불가능하다.
//		c.variableC = 10; 객체 생성이 안되기 때문에 필드가 public 이라도 접근 불가
		
	}

}
