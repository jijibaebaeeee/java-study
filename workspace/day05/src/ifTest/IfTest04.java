package ifTest;

import java.util.Scanner;

public class IfTest04 {
	public static void main(String[] args) {
		//삼항연산자로 작성했던 두 수를 입력받아 큰 수 출력하기
		// => if ~ else if ~ else문으로 변경
		
		// 로직구성
		// 변수 선언 int 2개
		// 입력 클래스 import
		// 입력 메시지 출력
		// 조건문(if ~ else if ~ else문)
		// if (변수1 > 변수2) {
		//		변수1이 변수2보다 큽니다 출력
		//	}else if(변수1 == 변수2){
		//	 	변수1과 변수2가 같습니다.
		//  }
		
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if(num1 == num2) {
			System.out.printf("%d와 %d가 같습니다.", num1, num2);
		}else if(num1 > num2) {
			System.out.printf("%d은 %d보다 %d 더 큽니다.", num1, num2, (num1 - num2));
		}else {
			System.out.printf("%d은 %d보다 작습니다.", num1, num2);
		}
		
		
		
		
		
	}
}
