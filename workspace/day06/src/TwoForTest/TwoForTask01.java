package TwoForTest;

public class TwoForTask01 {
	public static void main(String[] args) {
		// 1번 : 역삼각형 
		// *****
		// ****
		// ***
		// **
		// *
		
//		for(int i = 0; i < 5; i ++) {
//			for(int j = 5; j > i; j --) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
		
		// 2번 : 피라미드와 유사하지만 좌측 정렬
		// *
		// * * *
		// * * * * *
		// * * * * * * *
		
		// 행 0 2 3
		// 열 1 3 5
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 2*i+1; j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

		
		// i = 1 2 3 4 5
		// j = 1 3 5 7 9
		// 규칙 =  2i-1 번
		
//		for(int i = 1; i <= 4; i++) {
//			for(int j = 1; j <= 2* i -1 ;j++ ) {
//				System.out.printf("* ");
//			}
//			System.out.println();
//		}
	

		// 3번 : 피라미드 (for문이 총 3개 -> 어떻게 사용될지 먼저 생각하기)
		
		//    *   
		//   * *
		//  * * *
		// * * * *
		
		//총 행 4
		//공백 i = 1 123 567
		//공백 i = 2 12   67
		//공백 i = 3 1     7
		//공백 x
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4-i; j++ ) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		// i =      1            2            3            4
		// j = 공백3 별 공백3  공백2 별 공백2  곻백1 별 공백1  공백0 별 공백0
		//     공백(4-i)
		//     별 = j 값
		
		
		
		
		
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");
			}
//			System.out.println();
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
