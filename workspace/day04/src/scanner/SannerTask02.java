package scanner;

import java.util.Scanner;  // 입력 클래스 import

public class SannerTask02 {
	public static void main(String[] args) {
		// 1. 사용자로부터 세 개의 숫자를 입력받아 합을 출력하는 프로그램
		// - 세 개의 숫자를 각각 입력받기
		// - 세 숫자의 합을 계산하여 출력
		// - 세 숫자의 합은 00입니다 형식으로 출력하기
		
		// 2. 사용자로부터 일어난 시간 (정수), 아침, 점심, 저녁에 할 일과 잠들 시간을 입력받아 출력하기
		// - 일어날 시간과 아침, 점심, 저녁에 할 일과 잠들 시간을 각각 입력받기
		// - 순서대로 입력받고 출력할 것
		// - 출력 형식
		// 오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다
		// 아침 : 00하기
		// 점심 : 00하기
		// 저녁 : 00하기
		
		// 3. 물건가격이 10000원이다. 사용자로부터 지불금액을 입력받아 거스름돈을 계산하기(뺄셈 - 이용 )
		// 출력형식
		// 물건 가격은 10000원입니다
		// - 지불가격을 입력하세요 : 00
		// 거스름돈은 3000원입니다
		
		
		// 1. 로직구성
		// 세 정수형 변수 선언
		// 스캐너 클래스 import
		// 출력 메시지 : 첫번째 숫자를 입력하세요 x3
		// 입력 메소드 .nextInt x3
		// 출력 메시지 : 세 숫자의 합은 00
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요 : ");
		num2 = sc.nextInt();
		System.out.println("세 번째 숫자를 입력하세요 : ");
		num3 = sc.nextInt();
		System.out.printf("세 숫자의 합은 %d입니다.", num1 + num2 + num3);
		
		sc.nextLine();
		
		// 2. 로직구성
		// 두 정수형 변수 선언(시간), 세 문자열형 변수 선언(할 일)
		// 출력 메시지 : 순서대로 입력 받기
		// 입력 메소드 next, nextInt 조합
		int wtime = 0, stime = 0;
		String mor = "";
		String noon = "";
		String eve = "";
		
		System.out.println();
		System.out.println("일어날 시간을 적어주세요(정수) : ");
		wtime = sc.nextInt();
		System.out.println("아침에 할 일을 적어주세요 : ");
		mor = sc.next();
		System.out.println("점심에 할 일을 적어주세요 : ");
		noon = sc.next();
		System.out.println("저녁에 할 일을 적어주세요 : ");
		eve = sc.next();
		System.out.println("잠들 시간을 적어주세요(정수) : ");
		stime = sc.nextInt();
		System.out.printf("오늘 일어난 시간은 %d시 이고 잠들 시간은 %d시 입니다. \n 아침 : %s하기 \n 점심 : %s하기 \n 저녁 : %s하기", wtime, stime, mor, noon, eve);
		
		sc.nextLine();
		
		// 3. 로직구성
		// 정수형 변수 1개 상수1개 선언
		// 출력 메시지
		// 입력 메소드 nextInt
		final int PRICE = 10000;
		int money = 0;
		
		System.out.println();
		System.out.printf("물건 가격은 %d원입니다. \n 지불 가격을 입력하세요 : ", PRICE);
		money = sc.nextInt();
		System.out.printf("거스름 돈은 %d원입니다.", PRICE-money);
		
		sc.nextLine();
		
		sc.close();
		
	
	}
}
