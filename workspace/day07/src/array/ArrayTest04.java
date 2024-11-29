package array;

public class ArrayTest04 {
	public static void main(String[] args) {
		// 1부터 10까지의 값을 배열에 넣고 출력하기
		// 배열 선언 및 생성 => 값을 알 때
	
	
//		int[] number1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int[] number2 = {1, 2, 3, 4, 5};
		
		//배열명.length : 배열의 길이, 배열의 길이에서 -1이 인덱스 끝 번호
		
		// 배열의 출력
//		for(int i = 0; i < number1.length; i++) {
//			System.out.println(number1[i]);
//		}
//		
//		for(int i = 0; i < number2.length; i++) {
//			System.out.println(number2[i]);
//		}
		
		// 1부터 10까지의 값을 배열에 넣고 출력
		// 1. 배열 선언 및 생성(값을 모를 때)
//		int[] number3 = new int[10]; // 10칸짜리 배열을 생성하면 인덱스번호는 0~9까지
		// 2. for문(초기식 int i = 0 (인덱스 번호는 0부터 시작);
		//			 조건식 i < 배열명.length (배열의 길이보다 작을 동안 반복)
		//				증감식 i++){
		//		값 대입 배열명[i] = i + 1;
		//3)	출력 배열명[i] 
//		System.out.println(number3);
//		System.out.println(number3[1]);
//		
//		for(int i = 0; i < number3.length; i++) {
//			number3[i] = i+1;
//		}
//		
//		for(int i = 0; i < number3.length; i++) {
//			System.out.println(number3[i]);
//		}
//		
		// 5부터 1까지의 값을 배열에 담고 출력하기
		// 1) 칸수를 알 때로 선언한다
		// 2) 값을 대입하는 반복문, 값을 출력하는 반복문을 따로 작성한다.
		
		
		
		
		// number[0] = 5
		// number[1] = 4
		// number[2] = 3
		// number[3] = 2
		// number[4] = 1		
		//대입
		//for문 사용
		//for(초기값 i = 0; 조건 < number.length; i++){}
		//내부 ->
		
		// 로직구성
		// 배열 선언
		// 반복문 for문 사용
		// 	초기식 => int i = 0;
		//	조건식 => i < number.length
		//	증감식 => i++
		
		
		int[] number = new int[5];
//		
//		for(int i = 0; i < number.length; i++) {
//			number[i] = number.length - i;
//			number[4-i] = i + 1;
//		}
//		
//		for(int i = 0; i < number.length; i++) {
//			System.out.println(number[i]);
//		}
		
		for(int i = number.length; i > 0; i-- ) {
//			number[i-1] = 5 - (i-1);
			number[5-i] = i;
		}
		
//		for(int i = 5; i > 5 - number.length ; i--) {
//			System.out.println(number[5-i]);
//		}
		
		// 빠른 for문
		for(int data : number) {
			System.out.println("값 : " + data);
		}
		
		
	}
}
