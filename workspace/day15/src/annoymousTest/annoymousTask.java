package annoymousTest;

//Calculator 인터페이스
//추상메소드2
//- 두 개의 매개변수 받아 더한값을 반환하는 메소드
//- 두개의 매개변수를 받아 곱한 값을 반환하는 메소드

interface Calculator {
	int add(int num1, int num2);

	int multiply(int num1, int num2);
}

public class annoymousTask {
	// 익명클래스로 객체 생성 후 메소드 호출하기
	public static void main(String[] args) {

		Calculator cal = new Calculator() { // 익명클래스 시작 영역

			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}

			@Override
			public int multiply(int num1, int num2) {
				return num1 * num2;
			}
		}; // 익명클래스 끝 영역
		
		System.out.println(cal.add(10, 20));
		System.out.println(cal.multiply(10, 20));
	}

}
