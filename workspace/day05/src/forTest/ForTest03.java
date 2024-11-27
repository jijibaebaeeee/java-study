package forTest;
// 12번
public class ForTest03 {
	public static void main(String[] args) {
		
		//이름 5번을 출력
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println((i+1) + "번 배지수");
//		}
		
//		for(int i = 5; i > 0; i--) {
//			System.out.println((6-i) + "번 배지수");
//		}
		
		//1부터 100까지의 합
		//1) 총합 저장할 변수
		//2) for문(초기식 int i = 1; 조건식 i < 101; i++){
		//3) 총합 저장할변수 += i; }
		//4) 합 출력
		
//		int sum = 0;
//		
//		int total = 0;
//		
//		for(int i = 1; i < 101; i++) {
//			total += i;
//			System.out.println("i의 값 : " + i + ", 1부터 100까지의 총 합 : " + total);
//		}
		
		//1부터 100까지의 짝수의 합
		// 로직구성
		// 총합 저장할 변수
		// for문
		// 총합 저장핢변수 += i
		
		// 3번방법
		// 총합 구할 변수
		// for(초기시 i = 1; i <= 50; i++){
		//		총합 += i * 2;
		//  }
		
		int total = 0;
		
		for(int i = 2; i < 101; i +=2) {
			total += i;
			System.out.println("i의 값 : " + i + ", 1부터 100까지의 짝수의 합 : " + total);
		}
		
		
		
		
		
		
		
	}
}
