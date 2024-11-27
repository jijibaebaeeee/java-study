package forTest;

public class ForTest02 {
	public static void main(String[] args) {
		//p130 1부터 10까지의 총합구하기
		// 로직구성
		// 정수형 변수 (총합구할 변수)
		// for 반복문(초기식 변수 1; 조건식 <= 10; 증감식++){
		// 총합구할변수 += 변수
		// }
		// 총합 출력 sum
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("총합 : " + sum);
	}
}
