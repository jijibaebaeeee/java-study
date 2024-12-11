package InnerTest;

public class Main {
	public static void main(String[] args) {
		//외부클래스의 객체 생성
		Outer outer = new Outer();   //        (1번)
		System.out.println(outer);
		System.out.println("외부클래스의 참조값 : " + outer);
		System.out.println("외부클래스의 데이터 : " + outer.var1);
		
		//내부클래스의 객체 생성
		//내부클래스는 외부 클래스의 인스턴스를 통해 생성해야함
		Outer.Inner inner = outer.new Inner(); // inner 클래스이기 때문에, 우선 outer 안에 생성자가 있다는 것을 알려야함.   (2번)
		System.out.println("내부클래스의 참조값 : " + inner); // $가 있으면 내부클래스
		System.out.println("외부클래스의 데이터 : " + outer.var1);
		System.out.println("내부클래스의 데이터 : " + inner.var2);
		inner.innerMethod();
		
		
		// 위의 (1번)+ (2번)을 ! 한번에 작성한 것이다 !
		Outer.Inner inner2 = new Outer().new Inner();
		
	}

}
