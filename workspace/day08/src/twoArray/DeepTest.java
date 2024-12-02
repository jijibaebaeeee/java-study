package twoArray;

import java.util.Arrays;

public class DeepTest {
	public static void main(String[] args) {
		int[] original = {1, 2, 3};
		
		int[] deepCopy = new int[original.length];
		for(int i = 0; i < original.length; i++) {
			deepCopy[i] = original[i];
		}
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(deepCopy));
		
		deepCopy[0] = 999;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(deepCopy));
	}
}
