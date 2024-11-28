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
		
		System.out.println();
		
		double height = 0.0, weight = 0.0, BMI = 0.0;
		
		System.out.println("키(m)와 몸무게(kg)를 입력하세요: ");
		height = sc.nextDouble();
		weight = sc.nextDouble();
		sc.nextLine();
		BMI = weight / (height * height);
		System.out.printf("당신의 BMI = %.1f 입니다", BMI);
		
		
		// 3. 밑변과 높이를 입력받아 삼각형의 넓이 계산하기
		// 공식 : 1/2 * 밑변 * 높이
		// 로직구성
		// 밑변과 높이, 넓이 저장할 변수 선언
		// 출력 메시지 -> 밑변과 높이를 입력하세요 :
		// 입력 메소드 -> .nextInt()
		// result = double(0.5 * 밑변 * 높이)
		// 출력 메시지 -> printf 넓이는 %.2f입니다,result
		
		System.out.println();
		
		double a = 0.0; // 밑변
		double h = 0.0; // 높이
		double result = 0.0; // 넓이
		System.out.println("밑변과 높이를 입력하세요 : ");
		a = sc.nextDouble();
		h = sc.nextDouble();
		result = 0.5 * a * h;
		System.out.printf("넓이는 %.2f입니다.", result);
		
		
		// 4. 두 정수를 입력받아 0보다 큰지 출력하기(True or False로 출력할 것)
		// 로직구성
		// 두 정수형 변수 선언
		// 출력 메시지 -> 두 정수를 차례대로 입력하세요 :
		// 입력 메소드 -> .nextInt()
		// 출력 메시지 -> 정수 %d는 0보다 ~합니다
		
		System.out.println();
		
		int num1 = 0, num2 = 0;
		System.out.println("두 정수를 차례대로 입력하세요: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("첫 번째 정수는 0보다 큰가요? : " + (num1 > 0));
		System.out.println("두 번째 정수는 0보다 큰가요? : " + (num2 > 0));
		
		
		// 5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원
		// 로직구성
		// 정수형 변수 2개 선언
		// 출력 메시지 -> 물건의 개수와 가격을 입력하세요 :
		// 입력 메소드 -> .nextInt()
		// 출력 메시지 -> printf 총액은 %d원입니다.
		
		System.out.println();
		
		int count = 0, price = 0;
		System.out.println("물건의 개수와 가격을 입력하세요 : ");
		count = sc.nextInt();
		price = sc.nextInt();
		System.out.printf("총액은 %d원입니다.", count * price);
		
		
		// 6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하여 출력하기 (각 자리수의 합)
		// 로직구성
		// 정수를 받을 정수형 변수 선언
		// 출력메시지 -> 두 자리수 정수를 입력하세요 :
		// 입력메소드 -> .nextInt()
		// 출력메시지 -> printf 각 자리의 수의 합은 %d입니다.
		
		System.out.println();
		
		int num3 = 0;
		System.out.println("두 자리수 정수를 입력하세요 : ");
		num3 = sc.nextInt();
		System.out.printf("각 자리 수의 합은 %d입니다.", (num3 / 10) + (num3 % 10));
		
		
		// 7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		// true of false
		// 로직구성
		// 정수형 변수 선언
		// 출력 메시지 -> 정수를 입력하세요 :
		// 입력 메소드 -> .nextInt()
		// 출력 메시지 -> true or false
		
		System.out.println();
		
		int num4 = 0;
		System.out.println("정수를 입력하세요 : ");
		num4 = sc.nextInt();
		System.out.println("입력한 수가 양수이면서 짝수인가요? : " + (num4 > 0 && num4 % 2 == 0) );
		
	
		// 8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		// true of false
		// 로직구성
		// 2개의 정수형 변수 선언
		// 출력 메시지 -> 두 정수를 입력하세요 :
		// 입력 메소드 -> .nextInt()
		// 출력 메시지 -> true or false
		
		System.out.println();
		
		int num5 = 0, num6 = 0;
		System.out.println("두 정수를 입력하세요 : ");
		num5 = sc.nextInt();
		num6 = sc.nextInt();
		System.out.println("첫 번째 숫자가 두번째 숫자보다 크거나 같나요? " + (num5 >= num6));
		
		
		// 9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		// true of false
		// 로직 구성
		// 2개의 정수형 변수 선언
		// 출력 메시지 -> 두 정수를 입력하세요 :
		// 입력 메소드 -> .nextInt()
		// 출력 메시지 -> !(둘다 양수 + 둘다 음수 + 둘다 0) + (하나양수 하나 0)
		// 출력 메시지 -> (변수1 > 0 && 변수2 <= 0) || (변수1 <= 0 && 변수2 > 0)
		// 출력 메시지 -> 곱해서 음수인 것
		
		System.out.println();
		
		int num7 = 0, num8 = 0;
		System.out.println("두 정수를 입력하세요 : ");
		num7 = sc.nextInt();
		num8 = sc.nextInt();
		System.out.println("한 숫자만 양수인가요? : " + (!((num7 > 0 && num8 > 0) || (num7 < 0 && num8 < 0) || (num7 == 0 && num8 == 0)) || (num7 > 0 && num8 == 0) || (num7 == 0 && num8 > 0 )));
		
		
		// 10. 연도를 입력받아 윤년인지 아닌지 출력하기(2024년, 2025년도로 확인할 것)
		// true of false = > true이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어 떨어지고 100으로 나누어떨어지지 않거나  400으로 나누어떨어져야한다.
		// 로직 구성
		// 1개의 정수형 변수 선언
		// 출력 메시지 -> 연도를 입력하세요 : 
		// 입력 메소드 -> .nextInt()
		// 출력 메시지 -> (1) 4로 나누어 떨어지고 + 100으로 나누어떨어지지 않음
		//			   (2) 400으로 나누어떨어짐
		// 출력 메시지 -> 삼항연산자
		
		System.out.println();
		
		int year = 0;
		System.out.println("연도를 입력하세요 : ");
		year = sc.nextInt();
		
		
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
		    System.out.printf("%d년은 윤년입니다. ", year);
		}else {
			System.out.printf("%d년은 윤년이 아닙니다. ", year);
		}
		
		
		
		sc.close();
		
		
	}
}
