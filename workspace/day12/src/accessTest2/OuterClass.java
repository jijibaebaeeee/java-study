package accessTest2;

import accessTest.Parent;

public class OuterClass {
	public void printAccess() {
		Parent p = new Parent(); // 객체 생성
		System.out.println(p.publicValue);
	}

}
