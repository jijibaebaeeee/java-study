package ex02;

import java.util.Scanner;

public class Main2 {
	// 5명의 학생의 점수를(1과목) 입력받아 아래를 수행하는 프로그램
	// 총합 계산
	// 평균 계산
	// 최고 점수와 해당 인덱스 출력 ****
	// 최저 점수와 해당 인덱스 출력 ****
	
	// 점수는 배열에 저장하여 출력
	// 나중에 학생수를 사용자가 입력할 수 있도록 변경할 예정이다.
	
	/* 로직구성
	 * <Main>
	 * 스캐너 클래스 임포트
	 * 학생수를 받을 정수형 변수 선언
	 * 정수형 배열 선언
	 * 점수를 받을 메소드를 맹들어보자
	 * 
	 * 최고 점수와 해당 인덱스 출력 (+하는 메소드?)
	 * 최저 점수와 해당 인덱스 출력 (+하는 메소드?)
	 * 
	 * <Method>
	 * 배열에 값을 넣는 메소드
	 * 리턴타입 void
	 * 메소드명 insertValue
	 * 매개변수 배열, 스캐너클래스
	 * 
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수 입력 : ");
		int count = sc.nextInt();
		int max = 0, maxIndex = 0;
		int min = 0, minIndex = 0;
		int total = 0;
		double avg = 0.0;
		
		sc.nextLine();
		int[] arr = new int[count];
		
		insertValue(arr, sc);
		
		max = arr[0];
		
		//total
		for(int data : arr) {
			total += data;
		}
		
		avg = (double)total / count;
		
		
		//max
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		
		//min
		for(int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		
		System.out.println("총합 : " + total + ", 평균 : " + avg + ", max 값 : " + max + ", maxIndex : " + maxIndex + ", min" + min + ", minIndex : " + minIndex);
		
		
	}
	
	static void insertValue(int[] arr, Scanner sc) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+1 + "번째 학생의 점수를 입력하세요 : ");
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
	}
	
}
