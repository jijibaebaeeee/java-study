package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		// 1. 사용자로부터 두개의 숫자를 입력받아 두 숫자의 합과 곱을 각각 출력하기
		
		
		// 2. 1번에서 입력받은 두개의 숫자를 사용하여 평균을 계산하고 소수점 두 자리수까지 출력하기
		
		
		// 3. 두 자리수 정수를 입력받고 십의자리와 일의자리를 출력하기
		// 입출력 결과
		// 십의 자리는 _ 입니다. 일의 자리는 _ 입니다.
		
		// 4. 코인노래방 프로그램 만들기, 사용자에게 금액을 입력받고 부를 수 있는 곡수와 잔돈 출력하기
		// 한 곡의 가격은 400원 입니다.
		
		
		// 1번 로직구성
		// 두 정수형 변수 선언
		// 스캐너 클래스 임포트
		// 출력 메시지 
		// 입력 메소드 -> .next() / .nextInt()
		// 합, 곱 출력
		
		Double num1 = 0.0, num2 = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 실수를 차례대로 입력하세요 : ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		System.out.printf("두 실수의 합 : %f, 두 실수의 곱 : %f", num1 + num2, num1 * num2);
		
		sc.nextLine();
		System.out.println();
		
		// 2번 로직구성
		// 1번 이용하여 연산만 바꾸기
		System.out.printf("두 숫자의 평균 : %.2f", (num1 + num2) / 2);
		
		System.out.println();
		
		// 3번 로직구성
		// 정수형 변수 선언
		// 출력 메시지
		// 입력 메소드 -> .nextInt()
		// 나눗셈, 나머지 연산 기호를 사용하여 각 자릿수 구하기 및 출력
		
		int num = 0;
		System.out.println("두 자리수 정수를 입력하세요 : ");
		num = sc.nextInt();
		System.out.printf("십의 자리는 %d입니다. 일의 자리는 %d입니다.", num / 10, num % 10);
		
		sc.nextLine();
		
		System.out.println();
		
		// 4번 로직구성
		// 정수형 변수 선언
		// 출력 메시지 : 투입할 금액을 입력해주세요
		// 입력 메소드 : .nextInt()
		// 나눗셈 연산 기호, 나머지 연산 기호 사용하여 각 자릿수 구하기 및 출력
		
		
		int money = 0;
		System.out.println("투입할 금액을 입력하세요 : ");
		money = sc.nextInt();
		System.out.printf("부를 수 있는 곡은 %d곡 입니다. 잔돈은 %d원입니다.", money / 400, money % 400);
		
		sc.close();
		
	}
}
