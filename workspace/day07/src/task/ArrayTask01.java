//배지수
package task;

import java.util.Scanner;
import java.lang.Math;

public class ArrayTask01 {
	public static void main(String[] args) {
		// 배열문제 조건 1) 칸수만 알고있다고 가정
		// 		  조건 2) 반드시 length 사용
		//		  조건 3) 값을 대입하는 반복문, 값을 출력하는 반복문 각각 사용
		
		// 1. 100~1까지의 값을 배열에 넣고 출력
		// 일반 for문만 사용
		
		// 로직 구성
		// 정수형 배열을 선언하고 참조변수가 크기 100의 정수형 배열을 참조하도록 한다
		// for문을 사용 <- 값 대입 용
		// 초기값 -> int i = 100
		//	조건식 -> i > 100 - .length
		//   증감식 -> i--
		// for 내부 num[100 - i] = i
		// for 문을 사용 <- 출력용
		// index = 0 ~ 100 까지 순회
		
//		int[] num = new int[100];
//		
//		for(int i = 100; i > 100 - num.length; i--) {
//			num[100 - i] = i;
//		}
//		
//		for(int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		

		// 2. 1~10까지의 값을 배열에 넣고 총 합 구하기
		// 일반 for문만 사용
		
		// 로직구성
		// 정수형 배열을 선언 및 생성 칸 10칸
		// for문 을 이용하여 배열에 값 넣기 i = 0~9
		
		
//		int sum = 0;
//		int[] num1 = new int[10];
//		
//		for(int i = 0; i < num1.length; i++) {
//			num1[i] = i+1;
//		}
//		
//		for(int i = 0; i < num1.length; i++) {
//			sum += num1[i];
//		}
//		
//		System.out.println(sum);
		
		
		// 3. 사용자에게 4개의 숫자를 입력받고 입력받은 값을 배열에 저장한 후 배열의 평균 구하기
		// 일반 for문, for-each문 상관없음
		
		// 로직 구성
		// 입력 클래스 임포트
		// 숫자를 받을 정수형 배열 선언, 배열의 합을 구할 정수형 변수 선언
		// 출력 메시지 -> 4개의 숫자를 입력하세요 :
		// 입력 메소드 -> .nextInt()
		// 버퍼비우기
		// 배열의 인덱스에 맞게 대입
		// for-each 사용하여 sum += 진행
		// printf 이용하여 형식 지정자는 %.2f 사용하며 sum / 4.0 으로 구하기 
		// 자원할당해제
		
//		Scanner sc = new Scanner(System.in);
//		int[] num = new int[4];
//		int sum = 0;
//		
//		System.out.println("4개의 숫자를 차례로 입력하세요");
//		num[0] = sc.nextInt();
//		num[1] = sc.nextInt();
//		num[2] = sc.nextInt();
//		num[3] = sc.nextInt();
//		sc.nextLine();
//		
//		for(int data : num) {
//			sum += data;
//		}
//		
//		System.out.printf("평균은 %.1f 입니다.", sum / 4.0);
//		sc.close();
		
	
		
		// 4. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 값을 배열에 담고 출력
		// 출력시 for-each문 사용
		
		// 로직구성
		// 정수형 배열 선언
		// for문 2개를 나란히 사용
		// 1번째 for -> 0 1 2 3
		// 2번째 for -> 0 1 2 3 값은 그대로지만, 인덱스는 i+5 만큼 차이남
		// 출력은 for-each 사용
		
//		int[] num = new int[10];
//		
//		for(int i = 0; i < num.length / 2; i++) {
//			num[i] = i;
//		}
//		
//		for(int i = 0; i < num.length / 2; i++) {
//			num[i+5] = i;
//		}
//		
//		for(int data : num) {
//			System.out.println(data);
//		}
		
		
		
		// 5. A~F까지를 C만 제외하고 배열에 담아 출력
		// 일반 for문
		// 초기식 int i = 0;
		
		// 로직 구성
		// 정수형 또는 문자형 배열 선언 -> 5칸
		// for문 사용
		//    if문 조건식 -> i = 2일때 continue
		// for문 사용 -> 출력
		
		// <문자형 배열 선언시>
//		char[] cha = new char[5];
//		
//		for(int i = 0; i < cha.length; i++) {
//			if(i == 2) continue;
//			else {
//				cha[i] = (char)(65 + i);
//			}
//		}
//		
//		// <정수형 배열 선언시>
//		int[] num = new int[5];
//		
//		for(int i = 0; i < num.length; i++) {
//			if(i == 2) continue;
//			else {
//				num[i] = 65 + i;
//			}
//		}
//		
//		//출력 <문자열 배열 선언시>
//		for(int i = 0; i < cha.length; i++) {
//			System.out.print(cha[i]);
//		}
//		
//		//출력 <정수형 배열 선언시>
//		for(int i = 0; i < num.length; i++) {
//			System.out.print((char)num[i]);
//		}
		
		// 6. aBcDeFgHiJkLmNoPqRsTuVwXyZ를 순서대로 배열에 담아 출력
		
		// 로직 구성
		// 정수형 배열 선언 -> 26칸
		// A -> 65
		// a -> 97 임을 이용
		// 인덱스 번호가 짝수 -> 소문자
		// 			 홀수 -> 대문자
		// for 문 사용
		//    if문으로 i % 2 == 0 이용
		// 출력 : for문 사용
		// 형변환 해서 출력
		
//		int[] num = new int[26];
//		
//		for(int i = 0; i < num.length; i++) {
//			if(i % 2 ==0) {
//				num[i] = 97 + i;
//			}else {
//				num[i] = 65 + i;
//			}
//		}
//		
//		//출력
//		for(int i = 0; i < num.length; i++) {
//			System.out.print((char)num[i]);
//		}
		
		
		
		// 7. 5개의 정수를 입력한 뒤 배열에 담고 최소값과 최대값 출력하기
		// 일반 for문
		
		// 로직구성
		// 입력 클래스 임포트
		// 정수형 배열 선언, 최소값, 최대값 변수 선언
		// 출력 메시지
		// 입력 메소드 -> nextInt()
		// 버퍼 비우기
		// 최소값 최대값 배열내 첫번째 인덱스로 임의 지정
		// for(전체 순회)
		//   if max, min 비교하여 교체
		// 자원할당해제
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int max = 0, min = (int)Math.pow(2, 31); //최대값으로 min 설정
		
		System.out.println("정수를 5개 입력하세요");
		
//		num[0] = sc.nextInt();
//		num[1] = sc.nextInt();
//		num[2] = sc.nextInt();
//		num[3] = sc.nextInt();
//		num[4] = sc.nextInt();
//		sc.nextLine();
		
		//또는
		
		for(int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 정수를 입력하세요 : ", i + 1);
			num[i] = sc.nextInt();
			sc.nextLine();
		}
		
		max = num[0];
		min = num[0];
		
		//최대 최소 찾기
		for(int i = 0; i < num.length; i++) {
			if(max <= num[i]) {
				max = num[i];
			}
			
			if(min >= num[i]) {
				min = num[i];
			}
		}
		
		
		System.out.printf("최댓값 : %d\t 최솟값 : %d", max, min);
		sc.close();
		
		
		
		
		// 8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
		//	 입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기
		
		
		//9. 학생 1명의 3과목 총점과 평균(소수점 3자리까지)을 구하고 출력하기
	    //   3과목은 배열에 입력받아 저장하며 for-each문만 사용(일반 for문 사용금지!)

		
		
		
		
	}
}
