package InnerTest;
//1번 : 내부클래스
public class Outer {
	//필드
	int var1;
	String data1 = "Outer"; // 생성과 동시에 초기화는 가능
	
	
	//Outer 클래스의 기본 생성자
	public Outer() {
		System.out.println("외부 클래스 생성자");
	}
	
	//내부 클래스 Inner 정의
	class Inner{
		//필드, 생성자, 메소드
		//inner 클래스의 필드
		int var2 = 10;
		
		//Inner 클래스의 생성자
		String data2 = "Inner";
		public Inner() {
			super();
			System.out.println("내부 클래스의 생성자");
		}
		
		//Inner 클래스의 메소드
		void innerMethod() {
			System.out.println("내부클래스의 메소드 호출");
			var1 = 10; // 전역변수 느낌으로다가 쓴대
			//this.var1 = 10; // this는 내부 클래스의 참조값을 의미하니까. 외부의 var1와 내부의 var1의 값이 다르다. 참조값이 다르기 때문!
			System.out.println("내부클래스의 메소드에서의 var1의 값" + var1);
			outerMethod();
			
		}
	}

	//메소드
	void outerMethod() {
		System.out.println("외부클래스의 메소드 호출");
	}
	
	
}
