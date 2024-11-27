package oper;
// 3번

public class BitOper {
	public static void main(String[] args) {
		System.out.println(10 & 11); // 1010 & 1011 => 1010
		System.out.println(10 | 11); // 1010 | 1011 => 1011
		System.out.println(10 ^ 11); // 1010 ^ 1011 => 0001
		System.out.println(~10); // 1010 => 0101 => -11
		System.out.println(~1); // 0001 => 0010 => -2
		System.out.println(~4); // -5
		System.out.println(~13);
		
		System.out.println("십진수 : " + 10 + " => 이진수 : " + Integer.toBinaryString(10));
		System.out.println("십진수 : " + 10 + " => 이진수 : " + Integer.toBinaryString(11));
		System.out.println("십진수 : " + 10 + " => 이진수 : " + Integer.toBinaryString(11));
		
		//~ Not 0을 1로, 1을 0으로
		// ~x = -(x + 1)
		System.out.println("~10의 십진수 : " + ~10);
		System.out.println("~10의 이진수 : " + Integer.toBinaryString(~10));
		
		//쉬프트연산자
		// <<, >>
		System.out.println(10 << 3);
		System.out.println("이진수 : " + Integer.toBinaryString(10 << 1));
		System.out.println(10 >> 2);
		System.out.println("이진수 : " + Integer.toBinaryString(10 >> 2));		
		
		
		
		
		
		
		
	}
}
