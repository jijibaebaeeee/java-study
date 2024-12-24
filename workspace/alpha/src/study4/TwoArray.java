package study4;

public class TwoArray {
//	1. 아래와 같은 결과와 동일하게 출력한다.
//	클래스명 : TwoArray
//	[출력결과]
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10
//	*
//	* *
//	* * *
//	* * * *
	// 로직
	// i = 1 j = 1	
	// i = 2 j = 
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 0; j < i ; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}

}
