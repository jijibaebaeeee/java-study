package ex01_배지수;

import java.util.Scanner;

public class InputNumber {
//	1. 사용자로부터 3개의 정수를 입력받아 아래 요구사항대로 구현하라
//
//	- 클래스명 : InputNumber
//	- 배열은 사용하면 안된다
//	1) 최소값과 최대값 출력
//	2) 5개 숫자의 평균을 소수점 2자리까지 출력
	
	// 로직구성
	// (1) 문제
	// 스캐너 클래스 임포트
	// 정수를 받아올 3개의 정수형 변수 선언
	// 출력문 + 받아오기 + 버퍼비우기
	// 삼항 연산을 이용해서 3개의 숫자를 비교하기
	// (2) 문제
	// 3개의 숫자의 합계의 평균을 구하기
	// 스캐너 할당 해제
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0;
		double avg = 0.0;
		
		
		System.out.println("숫자를 띄어쓰기로 구분하여 차례로 입력하세요 : ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sc.nextLine();
		
		int max = num1;
		int min = num1;
		

		max = (max < num1) ? num1 : (max < num2) ? num2 : max;
		min = (min > num1) ? num1 : (min > num2) ? num2 : min;

		avg = (num1 + num2 + num3) / 3.0;
		
		System.out.printf("최대값 : %d, 최소값 : %d\n", (int)max, (int)min);
		System.out.printf("평균 : %.2f", avg);
		
		
		sc.close();
	
		
	}

}
