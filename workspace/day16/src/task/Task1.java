package task;

import java.util.Scanner;

public class Task1 extends Exception {
//	1. 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 출력하는 프로그램을 만드세요. 
//	그리고 숫자가 아닌 값이 입력될 경우 "잘못된 입력입니다"라는 예외 메시지를 출력하고, 
//	프로그램을 종료하세요.
	
	// 사용된 주제 -> Exception을 상속받기 메인에서 try-catch만 쓰기. (throws, throw X)
	// 로직 구성
	// 스캐너 클래스 임포트
	// 숫자를 받을 정수형 변수 선언
	// 합을 출력할 정수형 변수 선언
	// 숫자 받기 < ----이 부분이 예외 발생할 수 있음
	// for문 사용하여 총 누적합구하기

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num = 0, total = 0;
	
	System.out.println("값 입력 : ");
	
	try {
		num = sc.nextInt(); // <-----예외 발생 가능 영역
		sc.nextLine();
	} catch (Exception e) {
		System.out.println("숫자를 입력해주세요");
		e.printStackTrace();
	}
	
	for(int i = 1; i <= num; i++) {
		total += i;
	}

	System.out.println(total);
	
	sc.close();
	}
	
}
