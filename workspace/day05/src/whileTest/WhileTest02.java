package whileTest;

import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
		// 사용자가 0을 입력하면 종료되는 프로그램
		
		// 입력 클래스 임포트
		// 변수 선언
		// 출력 메시지 -> 숫자 입력 :
		// 입력 메소드 -> nextInt()
		// while(조건식) => 변수 == 0{
		//		syso(입력한 값 출력)
		// }
		//
		
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("숫자 입력 (0을 입력하면 종료) :");
		choice = sc.nextInt();

		while(choice != 0) {
			System.out.println(choice);
			System.out.println("숫자 입력 (0을 입력하면 종료) :");
			choice = sc.nextInt();
		}
		System.out.println("프로그램 종료");
		
		
	}
}
