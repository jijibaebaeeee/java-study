package teamTask2;

import java.util.Scanner;

public class TeamTask {
	public static void main(String[] args) {

//	11x12 2차원 배열 생성하고 컵 모양의 배열 출력 // 디테일 미쳤다
//
//	1부터 100까지 숫자 중 랜덤한 숫자를 출력 후
//
//	사용자 두 명이 번갈아 가며 숫자를 입력하여 
//
//	랜덤 숫자 대비 입력한 숫자의 비율만큼 컵에 물이 차오르도록 설정
//	ex) 랜덤 숫자 47, 입력한 숫자 5일때  = 10.6% (소숫점 첫번째까지 출력)
//	반올림하여 11%가 (*)로 채워진 배열 출력
//
//	배정된 숫자를 넘기면 게임오버.
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][12];
		int random = 0;
		int sum = 0, num = 0, cnt = 0, water;
		double percent = 0;
		random = (int)(Math.random() * 100) + 1; // 1~100의 랜덤한 숫자 출력
		
		System.out.println("이번 게임의 수는 " + random + "입니다.");
		
		//컵 모양 생성 -> 추후 메소드로 구현
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j == 0 || j == arr[i].length-1) {
					System.out.print('ㅣ');
				}else if(i == arr.length - 1) {
					System.out.print('_');
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//			사용자 두 명이 번갈아 가며 숫자를 입력하여 

//			랜덤 숫자 대비 입력한 숫자의 비율만큼 컵에 물이 차오르도록 설정
//			ex) 랜덤 숫자 47, 입력한 숫자 5일때  = 10.6% (소숫점 첫번째까지 출력)
//			반올림하여 11%가 (*)로 채워진 배열 출력
			// 로직 구성
			// sum이 random보다 커지면 반복 종료
			// cnt를 2로 나누었을 때 1이면 Player 1 차례
			// 					0이면 Plaeyr 2 차례
			// 숫자를 입력받으면서 총 합계에 더해준다.
			// 
		
		
		while(sum < random) {
			if(cnt % 2 == 1) {
				System.out.println("Player 1님 차례입니다 : ");
				num = sc.nextInt(); 
				sc.nextLine();
				sum += num;
				percent = (double)((sum / random) * 100); // 추후 메소드 구현 부분
				System.out.printf("넘치기까지 : %.1f", 100.0 - percent);// 소수점 첫째 자리 까지 출력
				water = (int)(percent + 0.5);
				//fillWater(arr, water);
				cnt++; // 다음 차례로
				
			}else {
				System.out.println("Player 2님 차례입니다 : ");
				num = sc.nextInt();
				sc.nextLine();
				sum += num;
				percent = (double)((sum / random) * 100); // 추후 메소드 구현 부분
				System.out.printf("넘치기까지 : %.1f", 100.0 - percent);// 소수점 첫째 자리 까지 출력
				water = (int)(percent + 0.5);
				cnt++;
			}
		}
	}
	
//	static void(int[][] arr, int water) {
//		
//	}
}
