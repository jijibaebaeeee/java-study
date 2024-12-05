package homework;

import java.util.Scanner;

public class TeamTask02 {
	public static void main(String[] args) {
		// 1번문제
//		사용자에게 0~9까지의 정수 10개를 입력을 받고
//		이 때 잘못된 정수를 입력하면 다시 입력을 받고
//		사용자가 입력한 10개의 정수의 합을 구하시오

		// 로직구성
		// 스캐너 클래스 임포트
		// 객체 생성
		// 정수형 변수 2개 선언(받을 것, 합계 구할 것), 정수형 배열 10칸 생성
		// for(int i = 0; i < ar.length; i++){
		// syso(i+1 번째 값 입력해주세요: )
		// num = sc.nextInt();
		// sc.nextLine();
		// while(num < 0 || num > 9){
		// syso("0~9의 수를 입력하세요");
		// num = sc.nextInt();
		// sc.nextLine();
		// }
		// ar[i] = num;
		// }
		
		// 모든 문제에 공통되는 클래스 임포트
		Scanner sc = new Scanner(System.in);
		TeamTask02 tt = new TeamTask02();
		
		
		//1번 문제 메인 시작
		int[] ar = new int[10];
		int sum = 0;
		
		tt.insertValue(ar);


		// 출력
		for (int data : ar) {
			sum += data;
		}
		System.out.printf("총 합은 %d 입니다.", sum);
		
		// 1번 문제 메인 끝
		
		
		// 3번 문제 메인 시작
		int[] arr = new int[3];
		int total = 0;
		double avg = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+1 + "번째 값을 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
		
		total = tt.findValue(arr);
		avg = tt.findValue(total, arr.length);
		
		System.out.printf("3개 과목의 총합 점수는 %d이고, 평균은 %.2f 입니다", total, avg);
		

//		2번 문제
//		사용자에게 행과 열의 수를 입력받아 그에 맞게 한칸당 []를 출력해 행과 열을 표시한다
//		그리고 사용자에게 입력 받은 행 과 열의 곱을 제일 맨 마지막 []안에 기입해준다
		
		//로직 구성
		
		

//		3번 문제 
//		사용자에게 각 국어, 수학, 역사의 점수를 입력받는다
//		입력받은 3개의 과목의 총합점수와 소수점 2번째 자리 까지 평균을 구해라
		// 로직 구성
		// 스캐너 임포트
		// 사용자에게 과목 점수 입력받을 배열 생성
		// for문을 사용하여 점수 입력받기
		// 총합점수 구하는 메서드
		// int findValue(배열){
		//	 합 구하는 변수 선언해야함
		//		for-each 사용해서 합 구하기
		//   return
		// 평균을 구하는 메서드
		// double findValue(총합, 배열수)
		// return (double)총합 / 배열수
		

	}// 메인 메소드 끝 영역

	// 1번문제 메서드 시작
	void insertValue(int[] ar) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + 1 + "번째 값 입력해주세요 : ");
			num = sc.nextInt();
			sc.nextLine();
			while (num < 0 | num > 9) {
				System.out.println("0~9의 수를 입력하세요");
				System.out.println(i + 1 + "번째 값 입력해주세요 : ");
				num = sc.nextInt();
				sc.nextLine();
			}
			ar[i] = num;
		}

	} // 1번 문제 메서드 끝나는 영역
	
	// 3번문제 메서드 시작
	int findValue(int[] ar) {
		int total = 0;
		for(int data : ar) {
			total += data;
		}
		return total;
	}
	
	double findValue(int total, int num) {
		return (double)total / num;
	}
	
	
	
	
	
	
	
	
	

}