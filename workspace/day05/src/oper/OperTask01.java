package oper;

import java.util.Scanner;

//1번 : 삼항연산자
public class OperTask01 {
	public static void main(String[] args) {
		// 정수 2개를 입력받아서 큰 수 출력하기(삼항 연산자 이용)
		// 로직 구성
		// 정수형 변수 2개 선언
		// 입력 클래스 import
		// 출력 메시지 -> 정수 2개를 입력하세요
		// 입력 메소드 ->  .nextInt()
		// 출력 메시지 -> 삼항 연산자 이용
		
		int num1 = 0, num2 = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
//		System.out.printf(num1 > num2 ? "%d 는 %d 보다 큽니다" : "%d 는 %d 보다 큽니다", num1,num2,num2,num1);
		
//		result = num1 > num2 ? num1 : num2;
		result = num1 == num2 ? "두 수는 같습니다." : num1 > num2 ? "큰 수 : " + num1 : "큰 수 : " + num2;
		System.out.println(result);
//		System.out.println("큰 수는 " + result + "입니다.");
		
	}
}
