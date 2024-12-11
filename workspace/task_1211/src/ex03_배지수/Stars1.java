package ex03_배지수;

public class Stars1 {
//	3. 아래 내용과 동일하게 출력하라(로직구성 필요없음)
//
//	(1) 피라미드 출력
//
//	- 클래스명 : Stars1
//	 
//
//	[입출력결과]
//	   *
//	  * *
//	 * * *
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
