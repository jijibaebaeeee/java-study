package bookExample1;

import bookExample.Parent;

//예제 10-17 접근제한자 protected
public class Child extends Parent{
	void accessTest() { // 클래스 내부 메서드 선언
		super.accessProtected(); // 부모클래스의 accessProtected() 메소드 (protected 접근제한자) 호출
		Parent p1 = new Parent(); // Parent 클래스의 객체 생성
//		p1.accessProtected(); // 객체로 접근하려니 안된다..!!! -> super로 접근해야하는구나 protected는!
		
	}

}
