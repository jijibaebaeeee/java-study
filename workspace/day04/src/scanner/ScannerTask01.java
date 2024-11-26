package scanner;

import java.util.Scanner;

public class ScannerTask01 {
	public static void main(String[] args) {
		
		// 두 정수를 입력받고 합을 출력하기
		// next 메소드를 사용한다
		// [입출력 결과]
		// 정수1 입력 : 10
		// 정수2 입력 : 20
		// 두 정수의 합은 30입니다.
		
		//int result = Integer.parseInt(data1);
		// 로직 구성
		
		// 1. 스캐너 클래스 import
		// 2. 출력 메시지 1개
		// 3. 입력 메소드 (.next() 사용)
		// 4. String 정수 int 형변환하여 저장
		// 5. 출력 메소드
		// 6. 스캐너 할당해제
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 차례로 입력하세요: ");
		String int1 = sc.next();
		String int2 = sc.next();
		int int11 = Integer.parseInt(int1);
		int int22 = Integer.parseInt(int2);
		System.out.println("[입출력 결과]");
		System.out.printf("정수1 입력 : %d ", int11);
		System.out.printf("정수2 입력 : %d ", int22);
		System.out.printf("두 정수의 합은 %d입니다.", int11 + int22);
		
		sc.close();
		
		// 로직 구성 2번째
		// 1. 변수 2개 선언한다(String)
		// 2. 입력 클래스 import
		// 3. 출력 메시지 (정수1 입력 : )
		// 4. 입력 메소드(.next) 변수1에 대입
		// 5. 출력메시지(정수2 입력 : )
		// 6. 입력메소드(.next) 변수2에 대입
		// 7. 출력
//		
//		String num1 = "", num2 = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 1 입력 : ");
//		num1 = sc.next();
//		System.out.println("정수 2 입력 : ");
//		num2 = sc.next();
//		System.out.println("두 정수의 합은 " + (Integer.parseInt(num1) + Integer.parseInt(num2) + "입니다"));
		
		
	}
}
