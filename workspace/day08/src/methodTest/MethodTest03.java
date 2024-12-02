package methodTest;
// 15번 : 메소드 호출방법 4가지 연습

public class MethodTest03 {
	public static void main(String[] args) {
		MethodTest03 mt = new MethodTest03();
		mt.printHello();
		
		mt.printName("배지수");
		
		// 매개변수x, 리턴값 o 메소드 syso(printTotal()); or 변수에 저장
		System.out.println(mt.printTotal());
		
		System.out.println("합 : " + mt.printNum(5));
		
	}
	
	// 매개변수x, 리턴값 x 메소드
	// 메소드명 : printHello ( 안녕하세요를 5번 출력하는 메소드)
	void printHello() {
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
	}
	
	// 매개변수o, 리턴값  x 메소드
	// 메소드명 : printName (본인이름님 환영합니다)
	void printName(String name) {
		System.out.printf("%s님 환영합니다\n", name);
	}
	
	// 매개변수x, 리턴값 o 메소드
	// 메소드명 : printTotal 매개변수 : x
	// 1부터 10까지의 합을 출력하는 메소드
	int printTotal() {
		int total = 0;
		
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		
		return total;
	}
	
	// 매개변수o, 리턴값 o 메소드
	// 정수1개를 넘겨받아 1~넘겨받은 정수까지의 합을 반환하는 메소드
	// 매개변수로 전달된 값을 출력
	// 최종 합을 반환
	// 메소드명 : printNum
	// 매개변수 : 1개 int
	
	int printNum(int num) {
		System.out.println(num);
		int total = 0;
		
		for(int i = 1; i <= num; i++) {
			total += i;
		}
			
		return total;
	}

}
