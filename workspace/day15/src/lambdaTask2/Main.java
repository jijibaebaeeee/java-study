package lambdaTask2;

public class Main {
//	(1) MultipleInter.java(인터페이스) 에  두 수를 매개변수로 받고 정수값을 반환하는 추상메소드를 만든다.
//	(2) Main.java(클래스)에 다음과 같은 static 메소드를 선언한다.
//	- MultipleInter 타입을 반환한다.
//	- 이름은 claculator
//	- 매개변수는 boolean타입을 받는다.
//	매개변수로 true가 들어오면 두 수의 곱을 반환하는 람다식을 만들고
//	false가 들어오면 0을 반환하는 람다식을 만든다.
//	작성된 람다식을 MultipleInter 타입의 변수에 저장하여 반환하는 메소드를 만든다.

	public static void main(String[] args) {
		MultipleInter multiple = calculator(true);
		
		System.out.println(multiple.what(4, 9));
		
		MultipleInter multiple2 = calculator(false);
		System.out.println(multiple2.what(4, 9));

	}

	static MultipleInter calculator(boolean type) {
		if (type) {
//			MultipleInter mul1 = new MultipleInter() {
//
//				@Override
//				public int what(int num1, int num2) {
//					return num1 * num2;
//				}
//			};
//			매개변수로 true가 들어오면 두 수의 곱을 반환하는 람다식을 만들고
			MultipleInter mul = (num1, num2) -> num1 * num2;
//			작성된 람다식을 MultipleInter 타입의 변수에 저장하여 반환하는 메소드를 만든다.
			return mul;
//			false가 들어오면 0을 반환하는 람다식을 만든다.
		} else {
			MultipleInter mul = (num1, num2) -> 0;
//			작성된 람다식을 MultipleInter 타입의 변수에 저장하여 반환하는 메소드를 만든다.
			return mul;
		}

	}

}
