package task;

import java.util.Scanner;

public class Task01 {
   public static void main(String[] args) {
      
//      1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
//      입력 : 8
//      출력 : 짝수입니다
	   
	   // 로직구성
	   // 정수를 받을 변수 선언
	   // 입력 클래스 import
	   // 출력 메시지 : 정수를 입력하세요: 
	   // 입력 메소드 : .nextInt()
	   // 출력 메시지 : 삼항연산자 이용
	   
//	   int num1 = 0;
	   Scanner sc = new Scanner(System.in);
//	   System.out.println("정수를 입력하세요 : ");
//	   num1 = sc.nextInt();
//	   
//	   System.out.println(num1 % 2 == 0 ? "짝수입니다" : "홀수입니다.");
	   
	   
//
//      2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기
//      입력 : -5
//      출력 : 음수입니다
//
//      입력 : 100
//      출력 : 양수입니다
//
//      입력 : 0
//      출력 : 0입니다
//
//      3. 나이를 입력받아 다음 기준으로 출력하기
//         0~12: 어린이
//         13~19: 청소년
//         20 이상: 성인
//
//      나이입력 : 16
//      청소년입니다
//
//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//         입력 : 5 1 9
//         출력 : 1 5 9
	   // 로직구성
	   // 세 개의 정수를 입력받을 변수 선언
	   // 출력 메시지 -> 세 정수를 띄어쓰기로 구분하여 입력하세요 :
	   // 입력 메소드 -> nextInt()
	   // 출력 메시지 -> 삼항연산자
	   
	   int num4 = 0, num5 = 0, num6 = 0;
	   System.out.println("세 정수를 띄어쓰기로 구분하여 입력하세요 : ");
	   num4 = sc.nextInt();
	   
	   
	  
//      5. 사용자로부터 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기
	   
	   // 로직구성
	   // 문자열 입력받을 변수 선언
	   // 출력메시지 -> 문자열을 입력하세요 : 
	   // 입력 메소드 -> .next()
	   // while(조건식) 사용
	   // 조건식에 .equals() 사용하기

	   
	   String input = "";
	   final String answer = "X";
	   System.out.println("문자열을 입력하세요 : ");
	   input = sc.next();
	   System.out.println(input);
	   
	   while(!answer.equals(input)) {
		   System.out.println("문자열을 입력하세요 : ");
		   input = sc.next();
		   System.out.println(input);
	   }
	   System.out.println("프로그램이 종료되었습니다.");
	   
	   
	   
//      6. 사용자가 입력한 숫자에 해당하는 구구단을 출력하기
//      단을 입력하세요 : 3단
//      출력
//      3 x 1 = 3
//      3 x 2 = 6
//      ...
//      3 x 9 = 27
	   
	   // 로직구성
	   // 출력 메시지 -> 단을 입력하세요:
	   // for문 사용
	   
	   int num = 0;
	   System.out.println("단을 입력하세요 : ");
	   num = sc.nextInt();
	   for(int i = 1; i <=9; i++) {
		   System.out.println(num + " X " + i + " = " + num * i);
	   }
//
//
//      7. ATM 메뉴에서 입금, 출금, 잔액 조회를 구현하세요.
//
//      [조건]
//      초기 잔액은 10000원으로 설정
//      메뉴에서 선택에 따라 작업 수행
//      종료 시 프로그램 종료
//
//      String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
//                  + "1. 잔액 조회"
//                  + "2. 입금"
//                  + "3. 출금"
//                  + "4. 종료"
//                  + "선택 : ");
	   
	   // 로직구성
	   //

   }
}
