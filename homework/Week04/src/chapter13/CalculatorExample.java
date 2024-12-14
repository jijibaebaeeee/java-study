package chapter13;
//예제 13-1 인스턴스 클래스
class Calculator{ // default 접근제한자이므로 같은 패키지에서만 접근 가능
	private int val1; // priavte 접근제한자이므로 같은 클래스에서만 접근 가능
	private int val2; // priavte 접근제한자이므로 같은 클래스에서만 접근 가능
	
	//매개변수 모두 가지는 생성자
	public Calculator(int val1, int val2) {
//		super();
		this.val1 = val1; // 생성자를 통해서 priavte 접근이 가능합니다
		this.val2 = val2; // 생성자를 통해서 priavte 접근이 가능합니다
	}
	
	public class Calc{ // public 접근제한자의 내부 클래스 선언
		public int add() { // public 접근제한자의 메서드 선언
			return val1 + val2;
		}
	}	
}

public class CalculatorExample { // 메인 클래스
	public static void main(String[] args) { 
		Calculator cal = new Calculator(10, 11); //Calculator 객체생성
		Calculator.Calc c = cal.new Calc(); //내부클래스의 인스턴스 클래스 선언 한 계단 더 내려가면 된다.
		System.out.println("합 : " + c.add());
	}
}
