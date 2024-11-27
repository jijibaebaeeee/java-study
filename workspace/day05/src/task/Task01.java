package task;

import java.util.Scanner;

public class Task01 { // 클래스의 중괄호 영역시작
	public static void main(String[] args) { // 메인메소드의 중괄호 영역시작
      
//      1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
//      입력 : 8
//      출력 : 짝수입니다
	   
	   // 로직구성
	   // 정수를 받을 변수 선언
	   // 입력 클래스 import
	   // 출력 메시지 : 정수를 입력하세요: 
	   // 입력 메소드 : .nextInt()
	   // 출력 메시지 : 삼항연산자 이용
	   
	   int num1 = 0;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("정수를 입력하세요 : ");
	   num1 = sc.nextInt();
	   sc.nextLine(); // 버퍼비우기
	   
	   System.out.println(num1 % 2 == 0 ? "짝수입니다" : "홀수입니다.");
	   
	   
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
	   
	   // 로직 구성
	   // 정수형 변수 선언
	   // 출력 메시지 -> 정수를 입력하세요 :
	   // 입력 메소드 : nextInt()
	   // if~else if~else문 사용
	   
	   int num2 = 0;
	   System.out.println("정수를 입력하세요 : ");
	   num2 = sc.nextInt();
	   sc.nextLine(); // 버퍼비우기
	   
	   if(num2 == 0) {
		   System.out.println("0입니다");
	   }else if(num2 > 0) {
		   System.out.println("양수입니다");
	   }else {
		   System.out.println("음수입니다");
	   }
	   
	   
//      3. 나이를 입력받아 다음 기준으로 출력하기
//         0~12: 어린이
//         13~19: 청소년
//         20 이상: 성인
//
//      나이입력 : 16
//      청소년입니다
	   
	   // 로직구성
	   // 정수형 변수 선언
	   // 출력 메시지 -> 나이를 입력하세요 :
	   // 입력 메소드 :.nextInt()
	   // if~else if~else 문 사용
	   
	   int num3 = 0;
	   System.out.println("나이를 입력하세요 : ");
	   num3 = sc.nextInt();
	   sc.nextLine(); // 버퍼비우기
	   
	   if(num3 > 0 && num3 <= 12) {
		   System.out.println("어린이입니다");
	   }else if(num3 > 12 && num3 <= 19) {
		   System.out.println("청소년입니다");
	   }else if(num3 >= 20) {
		   System.out.println("성인입니다");
	   }else {
		   System.out.println("나이를 잘못 입력했습니다.");
	   }
	   
	   
//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//         입력 : 5 1 9
//         출력 : 1 5 9
	   // 로직구성
	   // 세 개의 정수를 입력받을 변수 선언
	   // 출력 메시지 -> 세 정수를 띄어쓰기로 구분하여 입력하세요 :
	   // 입력 메소드 -> nextInt()
	   // 최댓값 임의로 지정
	   // 출력 메시지 -> 삼항연산자 사용 -> 가장작은것 + 가장 큰것 -> 중간것
	   
	   int num4 = 0, num5 = 0, num6 = 0;
	   System.out.println("세 정수를 띄어쓰기로 구분하여 입력하세요 : ");
	   num4 = sc.nextInt();
	   num5 = sc.nextInt();
	   num6 = sc.nextInt();
	   
//	   System.out.print((num4 < num5 ? num4 : num5) < num6 ? (num4 < num5 ? num4 : num5) : num6); // 제일 작은
//	   System.out.print((num4 > num5 ? num4 : num5) > num6 ? (num4 > num5 ? num4 : num5) : num6); // 제일 큰
	   
	   int low = (num4 < num5 ? num4 : num5) < num6 ? (num4 < num5 ? num4 : num5) : num6; // 제일 작은
	   int high = (num4 > num5 ? num4 : num5) > num6 ? (num4 > num5 ? num4 : num5) : num6; // 제일 큰
	   int center = (num4 != low && num4 != high) ? num4 : ((num5 != low && num5 != high) ? num5 : num6); // 중간
	   
	   System.out.println(low + " " + center + " " + high);
	   
	   sc.nextLine(); //버퍼ㅣ우기
	   
	   
	   
//	   System.out.println((num4 < num5 ? num4 : num5) < num6 ? (num4 < num5 ? num4 : num5) : num6 + "\t" + ((num4 > num5 ? num4 : num5) > num6 ? (num4 > num5 ? num4 : num5) : num6));
	   

	  
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
	   
	   sc.nextLine(); // 버퍼비우기
	   
	   
	   
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

	   sc.nextLine(); // 버퍼비우기

//      7. ATM 메뉴에서 입금, 출금, 잔액 조회를 구현하세요.
//
//      [조건]
//      초기 잔액은 10000원으로 설정
//      메뉴에서 선택에 따라 작업 수행
//      종료 시 프로그램 종료
//
      String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
                  + " 1. 잔액 조회"
                  + " 2. 입금"
                  + " 3. 출금"
                  + " 4. 종료"
                  + "\n선택 : ";
	   
	   // 로직구성
	   // 입력 받을, 잔액을 저장할, 입금 금액, 출금 금액 저장할 정수형 변수 선언
	   // 출력 메시지 -> msg
	   // 입력 메소드 -> .nextInt()
       // while문 사용 -> 조건식은 4가 아닐때 참
       // switch문 사용
	   // 1. 잔액조회 -> 잔액 출력
	   // 2. 입금 -> 입금할 금액 출력 + 잔액 보여주기
	   // 3. 출금 -> 출금할 금액 출력 -> 기존 잔액보다 많이 출금할 경우 방지 + 잔액 보여주기
	   // 4. 종료 -> ByeBye
       // 디폴트 -> 없는 숫자이다
	   
	   int choice = 0, balance = 10000,  deposit = 0, withdraw = 0;
	   
	   while(choice != 4) { // while문의 중괄호 영역시작
		   System.out.println(msg);
		   choice = sc.nextInt();
		   switch(choice) { // switch문의 중괄호 영역시작
		   case 1: 
			   System.out.printf("잔액은 %d원입니다.\n", balance);
			   break;
		   case 2:
			   System.out.println("얼마를 입금하시겠습니까? : ");
			   deposit = sc.nextInt();
			   balance += deposit;
			   System.out.printf("입금에 성공했습니다. 총 잔액은 %d입니다.\n", balance);
			   break;
		   case 3:
			   System.out.println("얼마를 출금하시겠습니까? : ");
			   withdraw = sc.nextInt();
			   if((balance - withdraw) < 0 ) {
				   System.out.println("잔액이 적어 출금할 수 없습니다.");
				   System.out.printf("현재 잔액 : %d \n", balance);
				   break;
			   }else {
				   balance -= withdraw;
				   System.out.printf("출금에 성공했습니다. 총 잔액은 %d입니다.\n", balance);
				   break;
			   }
		   default:
			   System.out.println("메뉴에 없는 번호입니다. 다시 시도해 주세요");
		   } // switch문의 중괄호 영역끝
	   }   // while문의 중괄호 영역끝
	   System.out.println("이용해 주셔서 감사합니다");
	   
	   sc.nextLine(); // 버퍼비우기
	   sc.close(); // 자원해제
	   
   } // 메인 메소드의 중괄호 영역끝
} // 클래스의 중괄호 영역끝
