package ex02;

import java.util.Scanner;

//배지수
public class Main {
	public static void main(String[] args) {
		// 5명의 학생의 점수를(1과목) 입력받아 아래를 수행하는 프로그램
		// 총합 계산
		// 평균 계산
		// 최고 점수와 해당 인덱스 출력 ****
		// 최저 점수와 해당 인덱스 출력 ****
		
		// 점수는 배열에 저장하여 출력
		// 나중에 학생수를 사용자가 입력할 수 있도록 변경할 예정이다.
		
		/* 로직구성
		 * 정수형 배열 5칸짜리 생성
		 * 정수형 변수 (최고, 최저 2개 생성)
		 * 입력 클래스 임포트
		 * 입력받을 출력 메시지
		 * for문 사용하여 -> ar.length 사용
		 * 입력받기 nextInt()
		 * 
		 * 최고점수, 최저점수 구할 때 for문을 사용하여 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[5];
		double max = 1.0e-100, min = 1.0e100;
		int maxIndex = 0, minIndex = 0;		
		for(int i = 0; i < ar.length; i++) {
			System.out.println(i+1 +"번째의 점수를 입력하세요: ");
			ar[i] = sc.nextInt();
			sc.nextLine();
		}
		
//		for(int data : ar) {
//			max = max < data ? data : max;
//			min = min > data ? data : max;
//		}
		
		for(int i = 0; i < ar.length; i++) {
			if(max < ar[i]) {
				maxIndex = i;
				max = ar[i];
			}
			if(min > ar[i]) {
				minIndex = i;
				min = ar[i];
				
			}
		}
		System.out.println("최고 점수 : " + (int)max + " 인덱스 번호 : " + maxIndex);
		System.out.println("최저 점수 : " + (int)min + " 인덱스 번호 : " + minIndex);
		
		sc.close();
	}
}
