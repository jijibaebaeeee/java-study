package lambda;
//람다식
public class LambdaTest2 {
	
	void printHello() {
		System.out.println("안녕하세요");
	}
	
	// 익명 메소드 만드는 법
	// 1. 원래 메소드에서 모두 한줄로 복붙하기
	// void printHello() { System.out.println("안녕하세요"); }
	// 2. 이름을 없애고 -> 추가한다
	// void () ->  { System.out.println("안녕하세요"); }
	// 3. 반환타입 추론가능하므로 생략한다
	// () -> { System.out.println("안녕하세요"); }
	// 4. 명령문이 1줄이면 중괄호와 세미콜론 생략가능하다(선택)
	// () -> System.out.println("안녕하세요")
	
	// 매개변수o, 리턴값 o
	int addTen(int num) {
		return num + 10;
	}
	
	// 1. 한줄로
	//int addTen(int num) {return num + 10;}
	// 2. 이름을 없애고 -> 추가
	// int (int num) {return num + 10;}
	// 3. 반환타입 추론가능하므로 생략
	// (int num) -> { return num + 10;}
	// 4. 매개변수 타입은 추론이 가능하므로 생략가능하다(선택)
	//    매개변수 타입을 생략한다면 소괄호도 생략가능하다(선택)
	// num -> {return num + 10;}
	// 5. 명령문이 1줄이면 중괄호와 세미콜론 생략가능하다(선택)
	//	  이때 중괄호와 세미콜론을 생략했다면 return도 생략해야함(필수)
	//    바디의 결과가 값이라면 자동으로  return된다. 단, 바디에 명령문이 1개이어야만 한다.
	// num -> num + 10
	
	// 매개변수 2개, 리턴 o, 바디에 명령문 2개
	
	int addNumber(int num1, int num2) {
		System.out.println("num1의 값 : " + num1 + "num2의 값 : " + num2);
		return num1 + num2;
	}
	
//	int addNumber(int num1, int num2) { System.out.println("num1의 값 : " + num1 + "num2의 값 : " + num2); return num1 + num2;}
//	1. 이름 없애고 화살표 추가
//	int (int num1, int num2) -> { System.out.println("num1의 값 : " + num1 + "num2의 값 : " + num2); return num1 + num2;}
//	2. 리턴타입 추론가능하므로 생략가능
//	(int num1, int num2) -> { System.out.println("num1의 값 : " + num1 + "num2의 값 : " + num2); return num1 + num2;}
//	3. 매개변수 타입은 주론 가능하므로 생략가능(선택)
//	   매개변수가 2개 이상이면 () 생략 불가
//	(num1, num2) -> { System.out.println("num1의 값 : " + num1 + "num2의 값 : " + num2); return num1 + num2;}
//	4. 명령문이 2개 이상이므로 {}와 ; 생략 불가
//	(num1, num2) -> { System.out.println("num1의 값 : " + num1 + "num2의 값 : " + num2); return num1 + num2;}
	
}
