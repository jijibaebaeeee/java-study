//배지수
package task;

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
		
		
		int sum = 0;
		int[] num1 = new int[10];
		
		for(int i = 0; i < num1.length; i++) {
			num1[i] = i+1;
		}
		
		for(int i = 0; i < num1.length; i++) {
			sum += num1[i];
		}
		
		System.out.println(sum);
		
		
		// 3. 사용자에게 4개의 숫자를 입력받고 입력받은 값을 배열에 저장한 후 배열의 평균 구하기
		// 일반 for문, for-each문 상관없음
		
		// 로직 구성
		// 입력 클래스 임포트
		// 출력 메시지 -> 
		
		
		
		
		// 4. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 값을 배열에 담고 출력
		// 출력시 for-each문 사용
		
		
		// 5. A~F까지를 C만 제외하고 배열에 담아 출력
		// 일반 for문
		// 초기식 int i = 0;
		
		// 6. aBcDeFgHiJkLmNoPqRsTuVwXyZ를 순서대로 배열에 담아 출력
		
		
		// 7. 5개의 정수를 입력한 뒤 배열에 담고 최소값과 최대값 출력하기
		// 일반 for문
		
		
		
		// 8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
		//	 입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기
		
		
		//9. 학생 1명의 3과목 총점과 평균(소수점 3자리까지)을 구하고 출력하기
	    //   3과목은 배열에 입력받아 저장하며 for-each문만 사용(일반 for문 사용금지!)

		
		
		
		
	}
}
