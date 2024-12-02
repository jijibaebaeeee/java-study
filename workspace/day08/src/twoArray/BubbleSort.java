package twoArray;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] number = {5, 2, 9, 1, 6};
		
		System.out.println("초기 배열 : " + Arrays.toString(number));
		
		for(int i = 0; i < number.length; i++) {
			boolean swapped = false; // 교화 발생 여부
			for(int j = 0; j < number.length - 1 - i; j++) {
				if(number[j] > number[j+1]) {
					// 두 요소 교환(swap)
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
			System.out.println((i+1) + "단계 : " + Arrays.toString(number));
			
			if(!swapped) {
				break;
			}
		}
		
		
		
		System.out.println("정렬완료 : " + Arrays.toString(number));
		
	}
}
