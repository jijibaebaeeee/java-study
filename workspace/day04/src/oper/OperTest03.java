package oper;
// 11번 : 관계 연산자와 논리 연산자

import java.util.Scanner;

public class OperTest03 {
	public static void main(String[] args) {
		// 사용자가 입력한 값 2개를 서로 비교하기
		// 로직 구성
		// 값 2개를 받을 변수 선언
		// 스캐너 클래스 import
		// 출력 메시지 :
		// 입력 메소드 : .nextDouble()
		// 출력 메시지 : 비교한 것
		// .nextLine()
//		
//		int num1 = 0, num2 = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두 수를 입력하세요 : ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		sc.nextLine();
		
		
		
		int num1 = 10;
		int num2 = 15;
		
		System.out.println("num1 > num2 : num1이 num2보다 크니? " + (num1 > num2));
		System.out.println("num1 < num2 : num1이 num2보다 작니? " + (num1 < num2));
		System.out.println("num1 >= num2 : num1이 num2보다 크거나 같니? " + (num1 >= num2));
		System.out.println("num1 <= num2 : num1이 num2보다 작거나 같니? " + (num1 <= num2));
		System.out.println("num1 == num2 : num1이 num2랑 같니? " + (num1 == num2));
		System.out.println("num1 != num2 : num1이 num2랑 같지 않니? " + (num1 != num2));
	
		System.out.println("--------논리연산자--------");
		System.out.println("===and 둘다 참이면 참(&&)===");
		System.out.println(true && true);  // 엔퍼센트
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("===or 둘중 하나라도 참이면 참(||)===");
		System.out.println(true || true);  // 파이프
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("===not 참이면 거짓 거짓이면 참(!)===");
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		
	}
}
