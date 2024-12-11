package teamtask02;
// JAV탕문제
import java.util.Scanner;

public class TeamTask03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TeamTask03 tt = new TeamTask03();
		
		// 10 x 10 인 2차원 배열 선언 및 정수형, 실수형 변수 선언
		int[][] ar = new int[10][10];
		int num1 = 0, num2 = 0, cnt = 0, total = 0;
		double avg = 0.0;
		
		// 배열에 값 저장
		tt.insertValue(ar);
		
		System.out.println("두 수를 띄어쓰기로 구분해서 입력하세요 : ");
		
		// 사용자로부터 두 수를 받기
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.nextLine();
		
		// 입력값이 1~100인지 확인
		while(tt.checkValue(num1, num2)) {
			System.out.println("1부터 100사이의 값을 입력하세요");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			sc.nextLine();
		}
		
		// 배수들의 개수
		cnt = tt.findMultiple(ar, num1, num2); 
		
		// 배수들의 합
		total = tt.findValue(ar, num1, num2);
		
		// 배수들의 평균
		avg = tt.findValue(total, cnt);
		
		// 출력
		tt.findValue(num1, num2, cnt, total, avg);
		
		sc.close();
		
	}
	
	// 2차원 배열에 값을 저장해주는 메소드
	void insertValue(int[][] ar) {
		int value = 1;
		
		// 1 ~ 100 값 저장
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = value++;
			}
		}
	}
	
	// 1~100 사이의 값인지 확인하는 메소드
	boolean checkValue(int num1, int num2) {
		boolean check = (num1 < 1 || num1 > 100) || (num2 < 1 || num2 > 100);
		return check;
	}
	
	
	// 배수의 개수를 구하는 메소드
	int findMultiple(int[][] ar, int num1, int num2) {
		int cnt = 0;
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				if(ar[i][j] % num1 == 0 || ar[i][j] % num2 == 0) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
    // 배수들의 합계를 구하는 메소드
	int findValue(int[][] ar, int num1, int num2) {
		int total = 0;
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				if(ar[i][j] % num1 == 0 || ar[i][j] % num2 == 0) {
					total += ar[i][j];
				}
			}
		}
		return total;
	}
	// 배수들의 평균을 구하는 메소드
	double findValue(int total, int cnt) {
		return (double)total / cnt ;
	}
	
	// 결과를 출력하는 메소드
	void findValue(int num1, int num2, int cnt, int total, double avg) {
		System.out.printf("%d와 %d의 배수는 총 %d개 이고, 합은 %d, 평균은 %.2f 입니다.", num1, num2, cnt, total, avg);
	}
}
