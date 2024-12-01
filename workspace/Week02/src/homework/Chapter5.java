package homework;

import java.util.Scanner;

public class Chapter5 {
	public static void main(String[] args) {
		
		// 예제 5-1 for문 1~10 합
		int sum = 0; // 정수형 변수 선언 및 초기화
		
		for(int i = 1; i <= 10; i++) { // for문 시작 초기값 1, 10이하까지, 1씩증가
			sum += i; // sum = sum + i
		}
		System.out.println("합 : " + sum); //합 출력
		
		// 예제 5-2 for문 1~100 짝수합
		int summ = 0; // 정수형 변수 선언 및 초기화
		
		for (int i = 1; i <= 100; i++) { // for문 시작 초기값 1, 100이하까지, 1씩증가
			if(i % 2 == 0) { // 2로 나누어 떨어지면
				sum += i; // 합에 더한다
			}
		}
		System.out.println("합 : " + summ); // 합 출력
		
		// 예제 5-3 이중 for문 구구단 출력
		for(int i = 2; i <= 9; i++) { // 외부 for문 시작 초기값 2, 9이하까지, 1씩증가
			for(int j = 1; j <= 9; j++) { // 내부 for문 시작 초기값 1, 9이하까지, 1씩증가
				System.out.println(i + "X" + j + "=" + (i * j) + "\t"); // 출력
			}
			System.out.println(); // 단이 바뀌면 줄바꿈
		} // for 문 끝
		
		// 예제 5-4 이등변 삼각형 만들기
		//  줄수 빈칸수 별수 
		//   0  6*2   1
		//   1  5*2   3  -> 별수 = 2 * 줄수 + 1
		//   2  4*2   5  -> 빈칸수 = 6-줄수 ( 관계연산자 < 를 사용하기 위해 1더 크게 설정해야함)
		//   3  3*2   7
		//   4  2*2   9
		//   5  1*2   11
		//   6  0*2   13

		for(int i = 0; i < 7; i++) { // 외부 for 문 시작 초기값 1, 7미만까지, 1씩증가
			for(int j = 0; j < 7 - i; j++) { // 내부 for 문 시작 초기값 0, 7-i미만까지 1씩증가
				System.out.print(" "); // 빈칸 출력
			} // 내부 for문 끝
			for(int j = 0; j < (2 * i) + 1; j++) { // 내부 for문 시작 초기값 0, 2 * i + 1미만까지, 1씩증가
				System.out.print("*"); // 별 출력
			} //내부 for문 끝
			System.out.println(); // 한 줄이 끝나면 줄 바꾸기
		} // 외부 for문 끝
		
		// 예제 5-5 while문 1~10합
		int suml = 0; // 정수형 변수 선언 및 초기화
		int ia = 1; // while문 제어를 위한 변수 설정
		
		while(ia <= 10) { // while문 시작 10보다 작으면 반복
			suml += ia; // sum = sum + i
			ia++; // i를 1 증가시킨다
		}
		System.out.println(suml); // 출력
		
		// 예제 5-6 do while문 (1~10 합)
		int sumn = 0; // 정수형 변수 선언 및 초기화
		int ii = 1; // do~while 문 제어를 위한 정수형 변수 선언
		
		do { //do~while 문 시작
			sumn += ii; // sum = sum + ii
			ii++; // ii 1 증가
		}while(ii <= 10); // ii 가 10이하 일 때 반복
		
		System.out.println(sumn); // 합 출력
		
		// 예제 5-7 -> continue문 1~100 짝수 구하기
		int ssum = 0; // 정수형 변수 선언 및 초기화
		for(int i = 1; i <= 100; i++) { // for문 시작 초기값 1, 100이하까지, 1씩증가 
			if(i % 2 != 0) { // if문 시작 2로 나누었을 때 나머지가 0이 아니라면
				continue; // 다음 반복으로 바로 진행한다
			}
			ssum += i; // 나머지가 0이라면 sum == sum + i
		}
		System.out.println("짝수 합 : " + ssum); // 합 출력
		
		// 예제 5-8 break문 숫자맞추기 게임
		int magicNumber = ((int)Math.random() * 50 ) + 1; // 정수형 변수를 선언하고 Math 클래스의 random 메소드를 이용해 무작위 수를 생성하고 강제 형 변환 하여 정수로 만든 값에 +1을 하여 저장한다
		Scanner sc = new Scanner(System.in); // 입력 메소드를 import하고, 참조변수를 선언하고 new를 이용하여 스캐너의 참조값을 가리키도록 한다
		boolean isMatched = false; // 논리형 변수를 선언하고 초기화한다.
		
		for(int i = 0; i < 10; i++) { // for문 시작 초기값 0, 10미만까지, 1씩증가
			System.out.println("찾는 숫자를 입력 >>"); // 출력메시지
			int guess = sc.nextInt(); // 정수형 변수를 선언하고 사용자가 입력한 정수 값을 저장한다
			
			if(guess == magicNumber) { // if문 시작 무작위 수와 사용자가 입력한 값이 같다면
				System.out.println((i+1) + "번째에 맞췄습니다!"); // 출력
				isMatched = true; // 논리형 변수를 true로 한다
				break;
			}else if(guess > magicNumber) { // else if 문 시작 사용자의 값이 더 크다면
				System.out.println("맞춰야할 숫자가 더 큽니다"); // 출력
			}else if(guess < magicNumber) { // 작다면
				System.out.println("맞춰야할 숫자가 더 큽니다"); // 출력
			}// else if 문 끝
			
			if(!isMatched) { // if문 시작 논리형 변수가 true가 아니면
				System.out.println("정답을 맞추지 못했습니다."); // 출력
			} // if 문 끝
		} // for 문 끝
		
		// 예제 5- 17 향상된 for문
		int[] score = {90, 92, 93};
		
		int sum1 = 0;
		double avg = 0;
		
		for(int val : score) {
			sum1 += val;
		}
		
		System.out.println("총점 : " + sum + ", 평균 : " + avg);
		
	}
}
