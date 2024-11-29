//배지수
package task;

public class ForTask01 {
	public static void main(String[] args) {
		//1. 1 ~ 100까지 출력 tab키만큼 간격 띄우고 10마다 줄바꿈
		//  1 	 2	 3	 4	 5	 6	 7	 8	 9	 10
		// 11	12	13	14   . . . 
		// 21	22	23   . . . .
		
		// 로직구성
		// 출력 = 반복횟수이므로 카운트할 정수형 변수 선언
		// 이중 for문 사용
		// 외부 for문 초기식 -> int i = 0
		//			  조건식 ->  i < 10
		//              증감식 -> i++
		// 내부 for문 초기식 -> int j = 0
		// 			  조건식 -> j < 10
		//			    증감식 -> j++
		//	 내부 for문  실행할 문장 -> ++cnt
		//							syso("%d + \t", cnt)
		// 외부 for문 실행할 문장 -> syso
		
		
//		int cnt = 0;
//		
//		for(int i = 0; i < 10 ; i++) {
//			for(int j = 0; j < 10; j++) {
//				cnt++;
//				System.out.printf("%d\t", cnt);
//			}
//			System.out.println();
//		}
 		
		
		
		
		//2. A~F출력
		
		// 로직구성
		// 정수형 변수 a = 'A' 선언
		// for문 사용
		// 		초기값 -> int i = 1
		//			조건식 -> i <= 5
		//				증감식 -> i++
		// for문 실행문장 -> printf("%c", (char)a + i)
		
//		int a = 'A';
//		
//		for(int i = 0; i <= 5; i++) {
//			System.out.printf("%c", (char)a + i);
//		}

		//3.aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
		
		// 로직구성
		// 0 2 4 6 8 . . . -> 소문자 
		// 1 3 5 7 9 . . . -> 대문자 
		// 나머지 연산을 사용하여
		

		
//		for(int i = 0; i < 26; i++ ) {
//			if(i % 2 == 0) {
//				System.out.printf("%c", 97+i);
//			}else {
//				System.out.printf("%c", 65+i);
//			}
//		}
		
		
		
		//4. 1) 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 출력. 한 줄에 5개씩 띄어쓰기로 구분되도록 출력
		// 	 2) 3의 배수 또는 5의 배수 숫자들의 합을 구하기
		
		
		// 로직구성
		// 논리연산자(&& || 사용)
		// 합을 구할, 줄바꿈할 정수형 변수 선언
		// for문사용
		// 내부 for문 -> 초기식 : int i = 1
		//					조건식 : <= 100
		//						증감식 i++
		//  내부 for문에 if문 사용
		//   if 조건문 => i가 3의 배수 || 5의 배수 -> 출력
		//				sum += i
		//		아니면 공백 또는 생략
		//  for문 끝나면 sum 출력
		
		int sum = 0, cnt = -1;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				cnt++;
				if(cnt % 5 == 0) {
					System.out.println();
				}
				System.out.print(i+ "\t");
				sum += i;
			}
		}
		
		System.out.print("\n총 합 :" + sum);
		
		
		
		
		
		
		
	}
}
