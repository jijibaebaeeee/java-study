package teamtask02;

import java.util.Scanner;

public class TeamTask02 {
	public static void main(String[] args) {
		
//		10진수 → 2진수 변환하기(4bit)
		
//		0~15범위 밖의 숫자를 입력받을 시 “잘못된 입력입니다 다시 입력해주세요 : “를 출력하고 제대로 받을 때까지 반복
//
//		0은 0으로 만든 5*5크기의 0으로 만들 것
//
//		1은 1으로 만든 5*5크기의 1로 만들 것 (1은 중간에 있어야함 왼쪽 또는 오른쪽으로 치우치면 안됨)
//
//		10진수를 2진수로 변환하는 “toBinaryString()” 사용금지
//
//		0또는 1을 출력한 뒤 줄바꿈을 할 것
//
//		메소드로 만들어서 사용할 것 : 2진수로 변환하는 코드, 0을 출력하는 코드, 1을 출력하는 코드 (총 3가지)
//
//		(전부 매개변수 자유, 리턴값 자유, static 사용 불가)
		

		
		// 0~15까지의 숫자를 입력받은 뒤 이를 4비트의 이진수로 출력
		TeamTask02 tt = new TeamTask02();
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int[] binaryArray = new int[4];

		// 입력 메시지 출력
		System.out.print("0부터 15까지의 숫자를 입력해주세요 : ");
		num = sc.nextInt();
		sc.nextLine(); // void buffer

		while (num > 15 || num < 0) {
			System.out.print("잘못된 입력입니다 다시 입력해주세요 : ");
			num = sc.nextInt();
			sc.nextLine(); // void buffer
		}
		
		//10to2
		tt.decimalToBinary(binaryArray, num);

		// 출력
		for (int data : binaryArray) {
			if (data == 0) {
				tt.print0();
				System.out.println();
			} else {
				tt.print1();
				System.out.println();
			}
		}
		
		sc.close();

	}
	
	
	// 🌚🌚🌚🌚🌚
	// 🌚     🌚
	// 🌚     🌚
	// 🌚     🌚
	// 🌚🌚🌚🌚🌚
	
	//print 0
	//지난번에 했던 속이 빈 사각형 참고
	//같은 형식으로 0,4번째 행렬 채움
	void print0() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4 || j == 0 || j == 4) {
					System.out.print("0");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	//print 1
	//중간인 2열만 1로 채움
	void print1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					System.out.print("1");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	void decimalToBinary(int[] array, int num) {
		// 이진수로 변환 8421
		// 이진수로 변환시키는 방법 중 10진수를 2로 나누었을 때 나머지들로
		// 계산하는 방법 사용함
		// 뒤의 배열부터 채운 이유는 계산 방법 때문임 (10to2 아래 참고)
		for (int i = array.length - 1; i >= 0; i--) {
			if (num / 2 >= 1) {
				array[i] = num % 2;
				num /= 2;
			} else if (num == 1) {
				array[i] = 1;
				break;
			} else {
				break;
			}
		}
	}
}
