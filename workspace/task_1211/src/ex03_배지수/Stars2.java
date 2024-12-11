package ex03_배지수;

import java.util.Scanner;

public class Stars2 {
//	(2) 사용자로부터 행을 입력받아 입력받은 숫자만큼 행으로 직각삼각형 출력
//
//	- 클래스명 : Stars2
//	 
//
//	[입출력결과]
//
//	출력하고 싶은 행 입력 : 4
//	*
//	**
//	***
//	****
	
	// 로직구성
	// 스캐너 클래스 임포트
	// 숫자 받을 정수형 변수 선언
	// 행이 늘어날수록 1씩 비례해서 증가 
 	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력하고 싶은 행 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
