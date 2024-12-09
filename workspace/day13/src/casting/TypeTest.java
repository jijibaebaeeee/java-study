package casting;

import casting2.Child;
import casting2.Parents;

public class TypeTest {
	public static void main(String[] args) {
		Parents p = new Parents();
		Child c = new Child();
		
		System.out.println(p);
		System.out.println(c);
		
		//객체 instanceof 클래스명 : 객체 타입을 확인할 수 있음
		//     리턴타입 boolean
		// 객체가 특정 클래스나 해당 클래스의 자식 클래스인지 확인할 때 사용
		System.out.println(p instanceof Parents);
		System.out.println(p instanceof Child);
		System.out.println(c instanceof Child);
		System.out.println(c instanceof Parents); // 일반적인 부모와 자식의 상식적인 관계에 충합하다.
		//자식 클래스 타입의 객체는 부모 클래스 타입도 동시에 갖는다!!
		
		
	}

}
