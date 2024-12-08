package teamTask;
// Java오 팀 문제 풀이

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class TeamTask01 {
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
		
		// 1번 문제 메인 시작 영역
		Scanner sc = new Scanner(System.in);
		TeamTask01 tt = new TeamTask01();
		int[] ar = new int[10];
		int sum = 0;
		
		tt.insertValue(ar);


		// 출력
		for (int data : ar) {
			sum += data;
		}
		System.out.printf("총 합은 %d 입니다.\n", sum);
		// 1번 문제 메인 끝 영역
		
//		2번 문제
//		사용자에게 행과 열의 수를 입력받아 그에 맞게 한칸당 []를 출력해 행과 열을 표시한다
//		그리고 사용자에게 입력 받은 행과 열의 곱을 제일 맨 마지막 []안에 기입해준다
		// 로직구성
		// 스캐너 클래스 임포트
		// 행과 열의 수를 입력받을 정수형 변수 선언
		// 선언 당시는 정수형 배열 생성 크기는 몰라야함
		// 이중 for문으로 요구에 맞게 배열 값 출력하기
		
		// 2번 문제 메인 시작 영역
		int row = 0, col = 0;
		
		System.out.println("행을 입력하세요: ");
		row = sc.nextInt();
		sc.nextLine();
		
		System.out.println("열을 입력하세요: ");
		col = sc.nextInt();
		sc.nextLine();
		
		int[][] arr = new int[row][col];
		
		// 값 대입
		arr[row - 1][col - 1] = row*col;
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[");
			for(int j = 0; j < arr[i].length; j++) {
				if(i == arr.length - 1 && j == arr[i].length - 1) {
					System.out.print("[" +arr[i][j] + "]" );
				}else {
				System.out.print("[ ]");
				}
			}
			System.out.print("]");
			System.out.println();
		}
		
		
		
		
//		3번 문제 
//		사용자에게 각 국어, 수학, 역사의 점수를 입력받는다
//		입력받은 3개의 과목의 총합점수와 소수점 2번째 자리 까지 평균을 구해라
		// 로직 구성
		// 스캐너 클래스 임포트
		// 국어 수학 역사 점수 받을 변수 합을 구할 변수, 평균을 구할 변수 선언
		// 국어 수학 역사의 점수를 입력받기
		// 점수를 인수로 넘겨주며 총합을 구하기 
		// 총합 구한 것들 바탕으로 평균을 구하는 메서드 만들기
		// OR
		// 총합과 평균을 한번에 print 하는 방법도 있음
		// 3번 문제 메인 시작 영역
		
		int korean = 0, math = 0, history = 0, total = 0;
		double avg = 0.0;
		
		System.out.println("3과목의 점수를 띄어쓰기로 구분해 입력하세요: ");
		korean = sc.nextInt();
		math = sc.nextInt();
		history = sc.nextInt();
		sc.nextLine();
		
		total = tt.findValue(korean, math, history);
		avg = tt.findValue(total, 3); // 메소드 오버로딩 이용
		
		System.out.printf("총합 점수는 %d이고, 평균은 %.2f입니다.", total, avg);
		sc.close();
		// 3번 메인 끝 영역


	}// 메인 메소드 끝 영역

	// 1번문제 메서드
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
	
	// 3번 문제 메서드 시작 영역
	int findValue(int korean, int math, int history) {
		return korean + math + history;
	}
	
	double findValue(int total, int num) {
		return (double)total / 3;
	}
	// 3번 문제 메서드 끝 영역
	
	
	
	

}
