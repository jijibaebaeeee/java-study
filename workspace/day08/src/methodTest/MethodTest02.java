package methodTest;

// 14번 : 메소드 정의 및 호출
public class MethodTest02 {
	public static void main(String[] args) {
	
		// 메소드 호출 방법 2가지
		// 1) 메소드 정의하는 부분에서 static 키워드를 붙인다(main메소드가 메모리에 할당될 때, add 메소드도 같이 메모리 할당시키는 방법)
		// 2) 메인 메소드에 add메소드가 있는 클래스를 알려준다
//			  클래스명 변수 = new 클래스명();
		
		MethodTest02 mt = new MethodTest02();  // MethodTest02 클래스에서 만들어진 모든 것이 mt라는 참조변수에 저장된다.
		mt.add(10, 20); // return 값이 없는 것은 출력문에 쓸 수 없다. (인수)
		
		
		
		
		
	}
	
	// 2개의 값을 더하는 기능의 메소드 add
	// 리턴타입 => void
	// 메소드명 => add
	// 매개변수 => int num1, int num2
	// 실행할 문장 => num1 출력, num2 출력, num1+num2 출력
	// 리턴값 x
	
	void add(int num1, int num2) {
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2);
	}

}
