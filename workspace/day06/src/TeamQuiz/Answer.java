package TeamQuiz;

import java.util.Scanner;

public class Answer {
	public static void main(String[] args) {
		
// ---------------------------------0100(공백)팀--------------------------------------------------------
	//   문제 1. 사용자가 입력한 숫자까지 구구단을 출력하는 프로그램
//      구구단은 1단부터 9단까지다.
//      사용자가 4를 입력할 경우 1단부터 4단까지 아래와 같은 형식으로 출력한다. 단은 \t로 구분한다.
//      (이중 for 문 사용, if 사용 X)
//
//   [입출력예시]
//   구구단을 어디까지 출력할까요? : 4
//   1 * 1 = 1   2 * 1 = 2   3 * 1 = 3   4 * 1 = 4   
//   1 * 2 = 2   2 * 2 = 4   3 * 2 = 6   4 * 2 = 8   
//   1 * 3 = 3   2 * 3 = 6   3 * 3 = 9   4 * 3 = 12   
//   1 * 4 = 4   2 * 4 = 8   3 * 4 = 12   4 * 4 = 16   
//   1 * 5 = 5   2 * 5 = 10   3 * 5 = 15   4 * 5 = 20   
//   1 * 6 = 6   2 * 6 = 12   3 * 6 = 18   4 * 6 = 24   
//   1 * 7 = 7   2 * 7 = 14   3 * 7 = 21   4 * 7 = 28   
//   1 * 8 = 8   2 * 8 = 16   3 * 8 = 24   4 * 8 = 32   
//   1 * 9 = 9   2 * 9 = 18   3 * 9 = 27   4 * 9 = 36
//

      // 1) 스캐너 입력 클래스 import
      // 2) 변수 num으로 저장
      // 2-1) 출력메세지"구구단을 어디까지 출력할까요?"
      // 3) nextint 입력받은수 num에 저장
      // 4) 외부 for(int i=1; i<=9; i++){} --> 구구단 9단까지 확실
      // 4-1) 내부 for(int j=1; j<=num; j++){} --> 입력받은 단까지. (변화)
      // 4-2) 내부 for문 안에서 : printf("%d * %d = %d\t", j, i, num*i);
      // 4-3) 외부 for문 안에서 : 줄바꿈 println();
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		System.out.println("구구단을 어디까지 출력할까요? :");
//		num = sc.nextInt();
//		sc.nextLine();
//		
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j <= num; j++) {
//				System.out.printf("%d * %d = %d\t", j, i, num*i);
//			}
//			System.out.println();
//		}
		

//   문제 2. UP&DOWN 게임
//      게임의 정답은 정해놓는다.
//      사용자에게 1 ~ 50까지의 정수를 입력 받고, 입력 받은 값이 정답보다 크면 "DOWN!"을 출력한다
//      정답보다 작으면 "UP"을 출력한다.
//      정답이 아닐 경우 "값을 다시 입력해 주세요 : " 를 출력한 후, 값을 다시 입력 받는다.
//      정답을 맞히면 "정답입니다 *번 째에 맞혔습니다!"를 출력하고 프로그램을 종료한다.
      
//      단, 1 ~ 50까지의 정수 범위를 벗어나면 "1 ~ 50까지의 숫자만 입력해주세요 : " 를 출력한다.

      // 1) 상수로 정답 정하기 ANSWER, 입력받을 정수형 변수 만들기 choice, 시도 횟수 저장할 변수 만들기 (정수형) cnt=1
      // 2) 출력메시지 "숫자 입력 : "
      // 3) choice에 입력받기
      // 4) while(ANSWER != choice){}
//   while 문 내부  
//   if(choice<1 || choice > 50 ) {
//      syso("1 ~ 50까지의 숫자만 입력해주세요 :");

//   }   
//   else if(choice > ANSWER){
//      syso("down");;
//      syso("값을 다시 입력해 주세요 : ");
//      }else{
//      syso("up")
//      syso("값을 다시 입력해 주세요 : ");
//   }
//      cnt++;
//      choice에 입력받기
//      버퍼비우기
      
//   while문 외부
//      syso("정답입니다" + cnt + "번 째에 맞혔습니다!"); 
//		
//		final int ANSWER = 39;
//		int choice = 0, cnt = 1;
//		System.out.println("1 ~ 50까지의 정수를 입력하세요 : ");
//		choice = sc.nextInt();
//		
//		while(ANSWER != choice) {
//			if(choice < 1 || choice > 50) {
//				System.out.println("1 ~ 50까지의 숫자만 입력해 주세요 : ");
//			}else if(choice > ANSWER) {
//				System.out.println("down");
//				System.out.println("값을 다시 입력해 주세요 : ");
//			}else {
//				System.out.println("up");
//				System.out.println("값을 다시 입력해 주세요 : ");
//			}
//			
//		    cnt++;
//		    choice = sc.nextInt();
//		    sc.nextLine();
//		}
//		System.out.println("정답입니다 " + cnt + "번 째에 맞혔습니다!");
//		
//		sc.close();

//		--------------------JAVA요팀------------------------
		
//		문제 1 : 점심 선택 및 가격 확인
//		   사용자로부터 점심 메뉴를 입력받아 해당 메뉴와 가격을 출력하기
//		   - 점심 메뉴 4가지에서만 가능하다
//		      짜장 (5000원), 돈까스 (8000원), 피자 (25000원), 햄버거 (6000원)
//		   - 올바른 메뉴를 입력할 때까지 반복합니다.
//		   - 잘못된 메뉴를 입력하면 다시 입력받습니다.
		
		// 로직 구성
		// 입력 클래스 import
		// 메뉴 입력받을 문자열형 변수 선언
		// 출력 메시지 : msg 변수로 선언해서 출력
		// 입력 메소드 : next();
		// do{
		//		메뉴 입력하세요		
		// }while(!(짜장, 돈까스, 피자, 햄버거);
	    // if문으로 메뉴에 따른 출력문 작성
		
//		Scanner sc = new Scanner(System.in);
//		String choice = "";
//		String msg = "점심 메뉴 선택 (한글로 메뉴 이름 작성)\n "
//				+ "짜장 (5000원), "
//				+ "돈까스 (8000원), "
//				+ "피자 (25000원), "
//				+ "햄버거 (6000원)";
//		
//		
//		do {
//			System.out.println(msg);
//			choice = sc.next();
//			sc.nextLine();
//			
//		}
//		while(!("짜장".equals(choice) || "돈까스".equals(choice) || "피자".equals(choice) || "햄버거".equals(choice)));
//		
//		if("짜장".equals(choice)) {
//			System.out.println("짜장은 5000원입니다.");
//		}else if("돈까스".equals(choice)) {
//			System.out.println("돈까스는 8000원입니다");
//		}else if("피자".equals(choice)) {
//			System.out.println("피자는 25000원입니다");
//		}else if("햄버거".equals(choice)) {
//			System.out.println("햄버거는 6000원입니다.");
//		}
		
//		문제 2 : 문자의 아스키코드 값 확인
//		   사용자로부터 문자를 입력받아 아스키코드 값을 확인하고 입력받은 문자를 아스키코드 값으로 변환한다
//		   사용자가 입력한 문자와 그 아스키코드를 출력하는데 반복문을 사용하여 여러번 입력받도록 한다
//		   'A'를 입력하면 종료하고 종료 메시지를 출력한다
		
		// 로직구성
		// 입력 클래스 import(생략)
		// 상수 'A' 선언, 문자를 입력받을 char 변수 선언
		// 출력 메시지 -> 문자를 입력하세요 :
		// 입력 메소드 -> .next().charAt(0) // 1번째 문자 따오기
		// while(!A){}
		// while문 내부 -> 입력한 문자에 대한 아스키코드 값 출력 (형변환)
		
//		final char END = 'A';
//		char choice = ' ';
//		
//		System.out.println("문자를 입력하세요(종료시 A입력) : ");
//		choice= sc.next().charAt(0);
//		sc.nextLine();
//		
//		while(choice != END) {
//			System.out.printf("%c 의 아스키코드 값은 %d입니다.\n", choice, (int)choice);
//			System.out.println("문자를 입력하세요(종료시 A입력) : ");
//			choice = sc.next().charAt(0);
//			sc.nextLine();
//		}
//		System.out.println("프로그램이 종료되었습니다.");
//		sc.close();
		
// -----------------------I팀-------------------------
//		1. 업다운문제
//		   초기 숫자 상수로 정하고 숫자 3회 입력
//		     > (상수 > 입력) : up 출력
//		     > (상수 < 입력) : down 출력
		
		// 로직구성
		// 입력 클래스 import
		// 정수형 상수 선언, 입력 받을 정수형 변수 선언, 횟수를 세는 cnt 선언
		// 출력 메시지 -> 숫자를 입력하세요 :
		// 입력 메소드 -> nextInt()
		// while(4회 초과시){}
		// while 내부 -> 비교연산에 따른 출력문
		
//		Scanner sc = new Scanner(System.in);
//		final int NUM = 23;
//		int choice = 0, cnt = 1;
//		
//		System.out.println("숫자를 입력하세요 : ");
//		choice = sc.nextInt();
//		sc.nextLine();
//		
//		while(cnt < 3) {
//			if(choice == NUM) {
//				System.out.println("정답입니다.");
//				break;
//			}else if(choice > NUM){
//				System.out.println("down");
//			}else {
//				System.out.println("up");
//			}
//			cnt++;
//		System.out.println("숫자를 입력하세요 : ");
//		
//		choice = sc.nextInt();
//		sc.nextLine();
//			
//		}
//		System.out.println("횟수 초과로 프로그램이 종료되었습니다.");
		
//		2. OX 퀴즈 (2문제만 존재함) 
//		   1번 못 맞추면 프로그램 종료
//		         1번 맞추면 2번 문제로 넘어가기
//
//		1번문제) 아기화장품은 순해서 어른들이 사용해도 괜찮다? 정답 : X
//		2번문제) 독사가 자기 혀를 깨물면 죽는다? 정답 : O
//
//		(모든 문제를 맞춘 경우)
//		1번문제를 맞힐경우 정답입니다 2번문제로 넘어갑니다 출력
//		2번문제도 맞힐경우 정답입니다 모든 문제를 맞췄습니다. O/X 퀴즈가 종료됩니다. 출력 후 프로그램 종료
//
//		(1번문제를 틀린인 경우)
//		1번문제를 틀린경우 틀렸습니다. 출력 후 프로그램 종료(다음문제로 넘어가지 않음)
		
		// 로직구성
		// 정답을 받을 문자형 변수(생략)
		// 입력 클래스 import
		// 출력 메시지 -> 문제에 따름
		// 입력 메소드 -> .next().charAt(0)
		// 버퍼비우기
		// 
		
//		char answer = ' ';
//		String msg1 = "1번문제) 아기화장품은 순해서 어른들이 사용해도 괜찮다? 정답 : O/X";
//		String msg2 = "2번문제) 독사가 자기 혀를 깨물면 죽는다? 정답 : O/X";
//		
//		System.out.println(msg1);
//		answer = sc.next().charAt(0);
//		sc.nextLine();
//		
//		if(answer == 'X') {
//			System.out.println("정답입니다 2번문제로 넘어갑니다");
//			System.out.println(msg2);
//			answer = sc.next().charAt(0);
//			sc.nextLine();
//			
//			if(answer == 'O') {
//				System.out.println("모든 문제를 맞췄습니다. O/X 퀴즈가 종료됩니다.");
//			}else if(answer == 'X') {
//				System.out.println("틀렸습니다. 프로그램을 종료합니다.");
//			}
//		}else if(answer == 'O') {
//			System.out.println("틀렸습니다. 프로그램을 종료합니다.");
//		}
//		
//		sc.close();
		
//		----------------------JAV탕팀-----------------------
		//문제1) 입력한 갯수만큼 늘어나는 반칸 다이아 만들기
		
		// 로직구성
		// 입력 클래스 import
		// 사용자 입력 받을 정수형 변수 선언
		// 출력 메시지 -> 정수를 입력하세요 :
		// 입력 메소드 -> nextInt()
		// 버퍼 비우기
		// 11.28 별찍기 3번째와 유사한 알고리즘
		// for()
		//   for( 공백담당 )    <= 윗부분 최대 삼각형까지 담당
		//   for( 별찍기담당 )
		// for()
		//	 for( 공백담당 )    <= 아래부분 한 줄 작은 삼각형까지 담당
		//   for( 별찍기담당 )
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		System.out.println("정수를 입력하세요: ");
//		num = sc.nextInt();
//		sc.nextLine();
//		
//		for(int i = 1; i <= num; i++) {
//			for(int j = 5; j >= i; j--) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j < i+1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 1; i < num; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.printf(" ");
//			}
//			for(int j = 5; j >= i; j--) {
//				System.out.printf("* ");
//			}
//			System.out.println();
//		}

		
//		문제2) 금액을 넣어주세요 : 입력값
//		   메뉴 출력 1~4번까지
//		      1 콜라 : 2500
//		      2 사이다 : 2000
//		      3 커피 : 4000
//		      4 잔액반환
//		   거스름돈과 잔액부족 표시 출력하고
//		   음료수가 나왔습니다 메시지 출력
//		   음료수 갯수 n 개 표현 (?)
//		   음료수 나오거나 잔액부족하면 종료시키기
		
		// 로직 구성
		// 입력 메소드 import(생략)
		// 메뉴 입력 받을, 입금 금액 저장할, 잔액을 저장할 정수형 변수 선언
		// 출력 메시지 -> 문제 참고
		// 입력 메소드 -> .nextInt()
		// 버퍼비우기
		// while(4가 아닐때){}
		// while내부 -> switch문 사용
		
//		int choice = 0, balance = 0;
//		String msg = "-------메뉴-------\n"
//				+ "1. 콜라 : 2500\n"
//				+ "2. 사이다 : 2000\n"
//				+ "3. 커피 : 4000\n"
//				+ "4. 잔액반환\n";
//		
//		System.out.println("투입 금액을 입력하세요: ");
//		balance = sc.nextInt();
//		sc.nextLine();
//		
//		while(choice !=4) {
//			System.out.println(msg);
//			System.out.printf("잔액 : %d\n", balance);
//			System.out.println("원하는 메뉴를 선택하세요: ");
//			choice = sc.nextInt();
//			sc.nextLine();
//			switch(choice) {
//			case 1:
//				if((balance - 2500) < 0 ) {
//					System.out.println("잔액이 적어 구입할 수 없습니다.");
//					   choice = 4;
//					   break;
//				   }else {
//					   balance -= 2500;
//					   System.out.printf("구입에 성공했습니다. 총 잔액은 %d입니다.\n", balance);
//					   break;
//				   }
//			case 2:
//				if((balance - 2000) < 0 ) {
//					System.out.println("잔액이 적어 구입할 수 없습니다.");
//					   choice = 4;
//					   break;
//				   }else {
//					   balance -= 2000;
//					   System.out.printf("구입에 성공했습니다. 총 잔액은 %d입니다.\n", balance);
//					   break;
//				   }
//			case 3:
//				if((balance - 4000) < 0 ) {
//					System.out.println("잔액이 적어 구입할 수 없습니다.");
//					   choice = 4;
//					   break;
//				   }else {
//					   balance -= 4000;
//					   System.out.printf("구입에 성공했습니다. 총 잔액은 %d입니다.\n", balance);
//					   break;
//				   }
//			case 4:
//				System.out.println("안녕히 가세요");
//				choice = 4;
//				break;
//				
//		    default:
//				System.out.println("메뉴에 없는 번호입니다. 다시 시도해 주세요");
//				
//			}
//		}
//		sc.close();
	}
}
