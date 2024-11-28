package TwoForTest;

import java.util.Scanner;

public class TwoForTest03 {
	public static void main(String[] args) {
		
		// 로직 구성
		// 정수형 변수 선언
		// 입력 메소드 import
		// 출력 메시지 -> 행 수를 입력하세요
		// 입력 메소드 -> nextInt() + 버퍼비우기
		// for문 출력
		
		int k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("행 수를 입력하세요: ");
		k = sc.nextInt();
		sc.nextLine();
		
		
		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
