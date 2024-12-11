package ex02_배지수;

public class print {
//	2. 15부터 30까지 중 짝수의 합을 출력하라
//
//	- 클래스명 : Print
//	- 단, while문을 사용할 것
	
	// 로직구성
	// 짝수는 16, 18, 20 ...이므로 정수형 변수 선언할 때 16으로 선언
	// while문 사용
	// 조건에는 관계연산자 이용하고 논리연산자 이용할 것
	// 복합대입연산자 이용
	
	public static void main(String[] args) {
		int n = 16;
		int sum = 0;
		
		while((n >= 15 && n <= 30)) {
			sum += n;
			n += 2;
//			System.out.println("누적합 : " + sum);
		}
		
		System.out.println("짝수의 합 : " + sum);
	}

}
