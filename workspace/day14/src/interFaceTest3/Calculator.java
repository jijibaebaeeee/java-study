package interFaceTest3;
//★★★★★★★★★★★★★★★★★★
public interface Calculator {
	default int add(int num1, int num2) {
		return validate(num1, num2) + num1 + num2;
	}

	default int subtract(int num1, int num2) {
		return validate(num1, num2) + num1 - num2;
	}
	
	private int validate(int num1, int num2) { // private로 유효성 검사하기.
		if(num1 < 0 || num2 < 0) {
			System.out.println("음수값은 출력 불가");
			return 0;
		}
		return 1;
	}
}
