package twoArray;

import java.util.Arrays;
import java.util.Scanner;

// 12번 :
public class Task {
	public static void main(String[] args) {
		 //1. 3x3 크기의 2차원 배열을 생성하고 사용자가 입력한 값을 대입
	      //1) 각 행의 합계와 평균 출력
	      //2) 전체 배열의 합계와 평균 출력
		
		// 로직 구성
		// 입력 메소드 임포트 
		// 2차원의 정수형 배열 선언 크기 3x3
		// 이중 for문 사용 -> 초기 0, 조건 < length, 1씩증가
		// 입력메소드 => nextInt()
		// 인덱스에 맞게 값을 넣어준다.
		
		Scanner sc = new Scanner(System.in);
		int[][] num = new int[3][3];
		double avg = 0.0;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.printf("%d행 %d열의 값을 입력하세요: ", i+1, j+1);
				num[i][j] = sc.nextInt();
			}
		}
		
//		sum1 = num[0][0] + num[0][1] + num[0][2];
//		sum2 = num[1][0] + num[1][1] + num[0][2];
//		sum3 = num[2][0] + num[2][1] + num[0][2];
		
		
		
		for(int i = 0; i < num.length; i++) {
			int sum = 0;
			for(int j = 0; j < num[i].length; j++) {
				sum += num[i][j];
			}
			avg = (double)sum / num[i].length;
			System.out.printf("행 : %d ,  합계 : %d, 평균 : %.2f\n", i+1, sum, avg);
		
		}
		
	      
	      //2. 2x2 크기의 2차원 배열을 생성하고 초기값을 아래와 같이 설정한다
	      //1   2
	      //3 4
	      //1) 얕은 복사로 복사하고 1행1열의 값을 40으로 변경한 뒤 원본배열과 변경된 배열 출력하기
	      //2) 깊은 복사로 복사하고 0행 1열의 값을 20으로 변경한 뒤 원본 배열과 변경된 배열 출력하기
		
		// 로직구성
		// 정수형 배열 2x2 선언
		// 얕은 복사하기
		// 깊은 복사하기
		// 출력시 deepToString 사용
		
		int[][] arr = {{1, 2}, {3, 4}};
		int[][] shallowCopy = arr;
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(shallowCopy));
		
		
		
		shallowCopy[1][1] = 40;
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(shallowCopy));
		
		//깊은 복사
		int[][] deepCopy = new int[arr.length][];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				deepCopy[i][j] = arr[i][j];
			}
		}
		
		// or
		
		for(int i = 0; i < arr.length; i++) {
			deepCopy[i] = Arrays.copyOf(arr[i], arr[i].length); // 깊은 복사할배열, 복사할배열의 길이
		}
		
		// or
		
		for(int i = 0; i < arr.length; i++) {
			deepCopy[i] = new int [arr[i].length];
			for(int j = 0;  j < arr[i].length; j++) {
				deepCopy[i][j] = arr[i][j];
			}
		}
		
		
		
		deepCopy[0][1] = 20;
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(deepCopy));
		
		System.out.println();
		
		//열의 수가 달라질 수 있음 -> 1 , 2, 3
//	      int[][] arr = {{1}, {2, 3}, {4, 5, 6}};
//	      System.out.println(arr);
//	      System.out.println(arr.length);
//	      System.out.println(arr[0].length);
//	      System.out.println(arr[1].length);
//	      System.out.println(arr[2].length);
//	      for(int[] ar : arr) {
//	         for(int ar1 : ar) {
//	            System.out.print("* ");
//	         }
//	         System.out.println();
//	      }

		
		
		
		
		
		
		
	}
}
