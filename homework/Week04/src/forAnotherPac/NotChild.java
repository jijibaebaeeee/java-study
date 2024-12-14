package forAnotherPac;

import chapter10.Parent;

//예제 10-18 접근제한자 protected
public class NotChild {
	void accessTest() {
		Parent p2 = new Parent(); // Parent 클래스는 public이므로 객체 생성 가능!
//		p2.accessProtected() 똑같이 객체를 만들어서 접근하는 것은 불가능. NotChild는 자식도 아니므로 super 불가능
	}

}
