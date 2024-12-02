package twoArray;

import java.util.Arrays;

public class ShallowTest {
	public static void main(String[] args) {
		int[] original = {1, 2, 3};
		int[] shallowCopy = original;
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(shallowCopy));
		
		//복사본 수정
		shallowCopy[0] = 100;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(shallowCopy));
	}
}
