package task;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		// 1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
		
		// 로직구성
		// 입력받을 정수형 변수와 결과 저장할 정수형 변수 선언
		// 스캐너 클래스 임포트
		// 출력 메시지 : 금액을 입력하세요 :
		// 입력 메소드 -> .nextInt()
		// 버퍼 삭제 -> .nextLine()
		// printf로 한번에 출력?
		
		int money = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 : ");
		money = sc.nextInt();
		
		sc.nextLine();
		
		System.out.printf("%d원은 \n 5만원 : %d장 \n 1만원 : %d장 \n 5천원 : %d장 \n 1천원 : %d 장 입니다.", money, money / 50000, (money % 50000) / 10000, ((money % 50000) % 10000) / 5000, (((money % 50000) % 10000) % 5000)/ 1000);
		
		// 2. 키와 몸무게를 입력받아 BMI를 계산하기
		// 공식 : 몸무게 / (키 * 키)
		
		// 로직구성
		// 실수형 변수 2개 선언
		// 출력 메시지 -> 키와 몸무게를 입력하세요 :
		// 입력 메소드 -> .nextDouble()
		// 버퍼 삭제 -> .nextLine()
		// 출력 메시지 -> printf 로 한번에? BMI 계산할 변수 선언?
		// 
		
		double height = 0, weight = 0, BMI = 0;
		
		System.out.println("키(m)와 몸무게(kg)를 입력하세요: ");
		height = sc.nextDouble();
		weight = sc.nextDouble();
		sc.nextLine();
		BMI = weight / (height * height);
		System.out.printf("당신의 BMI = %.3f 입니다", BMI);
		
		
		// 3. 밑변과 높이를 입력받아 삼각형의 넓이 계산하기
		// 공식 : 1/2 * 밑변 * 높이
		
		
		
		
		// 4. 두 정수를 입력받아 0보다 큰지 출력하기(True or False로 출력할 것)
		
		// 5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원
		
		// 6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하여 출력하기 (각 자리수의 합)
	
		// 7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		// true of false
		
		// 8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		// true of false
		
		// 9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		// true of false
		
		// 10. 연도를 입력받아 윤년인지 아닌지 출력하기(2024년, 2025년도로 확인할 것)
		// true of false = > true이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어 떨어지고 100으로 나누어떨어지지 않거나 400으로 나누어떨어져야한다.
	}
}
