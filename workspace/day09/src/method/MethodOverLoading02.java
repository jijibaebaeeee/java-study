package method;

public class MethodOverLoading02 {
	public static void main(String[] args) {
	
		System.out.println(add(10,20));
		add(10,20,30);
		add(1.1, 5);
	}
	
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// 매개변수의 개수가 다름
	static void add(int num1, int num2, int num5) {
		System.out.println(num1 + num2 + num5);
	}
	
	// 매개변수의 타입이 다름
	static void add(int num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	// 매개변수의 순서가 다름
	static void add(double num1, int num2) {
		System.out.println(num1 + num2);
	}

}