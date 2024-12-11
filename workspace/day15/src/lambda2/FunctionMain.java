package lambda2;

public class FunctionMain {
	public static void main(String[] args) {
		
		// 익명클래스로 객체 생성
		FunctionalInter1 fi1 = new FunctionalInter1() {

			@Override
			public int addTen(int number) {
				return number + 10;
			}
		};
		
		//람다식으로 객체 생성
		FunctionalInter1 fii = number -> number + 10;
//		int addTen(int number) {return number + 10;}
//		메소드명 없애고 화살표추가
//		반환타입 생략
//		매개변수 타입 추론 가능 1개이므로 생략가능
//		매개변수 1개이므로 ()생략가능
//		number -> {return number + 10;}  // 선언부가 끝난 부분
//		number -> number + 10
		System.out.println(fi1.addTen(10));
		System.out.println(fii.addTen(20));
		
		System.out.println("=======================");
		//익명 클래스로 재정의
		FunctionalInter2 f1 = new FunctionalInter2() {
			
			@Override
			public int printSum(int num1, int num2) {
				System.out.println("num1의 값 : " + num1 + "num2의 값 : " + num2);
				return num1 + num2;
			}
		};
		
		//람다식으로 재정의
		FunctionalInter2 f2 = (num1, num2) -> {
			System.out.println("num1의 값 : " + num1 + "num2의 값 : " + num2);
			return num1 + num2;
		};
		
		
		//메소드 호출
		System.out.println(f1.printSum(10, 5));
		System.out.println(f2.printSum(1, 2)); 
		
		
	}

}
