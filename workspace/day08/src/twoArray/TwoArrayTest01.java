package twoArray;
// 1번 : 2차원배열
// 행과 열로 구성된 데이터를 저장하는 배열의 형태

public class TwoArrayTest01 {
	public static void main(String[] args) {
		int[][] ar1;	// 2차원 배열 선언
		ar1 = new int[3][2]; // 3행 2열 크기의 배열 생성
		
		System.out.println(ar1); // 2차원 배열의 전체 참조값 출력 
								 // [[I@65ae6ba4  : (JVM에 의해 제공)
		System.out.println(ar1[0]); // 0행의 참조값 출력
									// [I@7960847b
		System.out.println(ar1[1]);
		System.out.println(ar1[0][0]); // 0행 0열의 값 (초기화된 기본값)
		
	}

}
