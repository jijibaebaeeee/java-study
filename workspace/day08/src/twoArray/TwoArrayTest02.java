package twoArray;

public class TwoArrayTest02 {
	public static void main(String[] args) {
		int[][] ar1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(ar1);
		System.out.println(ar1[0]);
		System.out.println(ar1[0][0]);
		System.out.println(ar1[0][1]);
		System.out.println(ar1[0][2]);
		System.out.println(ar1[1][0]);
		System.out.println(ar1[1][1]);
		System.out.println(ar1[1][2]);
		
		
//		// 2차원 배열에서 length는 행의 수이다.
//		System.out.println("2차원 배열(행) : " + ar1.length);
//		// 2차원 배열에서 열을 구하기 위해 행의 인덱스 번호를 추가한다.
//		System.out.println("2차원 배열(열) : " + ar1[0].length);
		
		
//		for(int i = 0; i < ar1.length; i++) {
//			System.out.println("ar1.length의 값(행) : " + ar1.length);
//			System.out.println("ar1의 각 행" + i + "의 주소값 : " + ar1[i]);
//		}
		
		for(int i = 0; i < ar1.length; i++) {
			for(int j = 0; j < ar1[i].length; j++) {
//				System.out.print(ar1[i][j]);
				System.out.println(i + "행 : " + ar1[i] + ", " + "ar1[i][j] 열 : " + ar1[i][j]);
			}
			System.out.println();
		}
		
		int[][] ar2 = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};
		int[] ar = {1, 2, 3};
		for(int data : ar) {
			System.out.println(data);
		}
		
		for(int[] data : ar2) { // 크게 행을 반복
			for(int data1 : data) { // 행의 열을 반복
				System.out.println(data1);
			}
		}
		
		
	}
}
