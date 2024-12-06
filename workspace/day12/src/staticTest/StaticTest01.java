package staticTest;
//2번: 정적메소드와 인스턴스 메소드
public class StaticTest01 {
	public static void main(String[] args) {
//		StaticTest01.staticMethod();
////		StaticTest01.instanceMetohd2();
//		
//		//같은 클래스에 있는 static메소드는 메소드명으로만도 호출가능
//		staticMethod();
//		
		//인스턴스 메소드를 호출하기 위해 객체 생성
		StaticTest01 st = new StaticTest01();
		//정적메소드를 호출하지만 권장하지 않음
		st.staticMethod();
		
		//인스턴스 메소드 호출
		st.instanceMethod();
		st.instanceMethod2();
		
	}
	
	// 인스턴스 메소드1
	void instanceMethod() {
		System.out.println("인스턴스 메소드1 실행");
		instanceMethod2();
		staticMethod();
	}
	
	
	// 인스턴스 메소드2
	void instanceMethod2() {
		System.out.println("인스턴스 메소드2 실행");
	}
	
	// 정적 메소드
	static void staticMethod() {
		System.out.println("정적 메소드 실행");

//		instanceMethod(); //인스턴스 메소드 호출 불가
	}
	
}
