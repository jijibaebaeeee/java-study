package twoArray;

import java.util.Arrays;

public class ArraysTest02 {
	public static void main(String[] args) {
		//1차원 배열
		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		//2차원 배열
		int[][] number2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		System.out.println(Arrays.toString(number)); // 1차원 배열용
		System.out.println(Arrays.toString(number2)); // 각 행의 참조값이 출력된다
		System.out.println(Arrays.deepToString(number2));  // 다차원 배열용
	}
}
