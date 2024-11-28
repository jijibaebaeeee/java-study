package TeamQuiz;

import java.util.Scanner;

public class Answer {
	public static void main(String[] args) {
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
		
		Scanner sc = new Scanner(System.in);
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
		
		final int ANSWER = 39;
		int choice = 0, cnt = 1;
		System.out.println("1 ~ 50까지의 정수를 입력하세요 : ");
		choice = sc.nextInt();
		
		while(ANSWER != choice) {
			if(choice < 1 || choice > 50) {
				System.out.println("1 ~ 50까지의 숫자만 입력해 주세요 : ");
			}else if(choice > ANSWER) {
				System.out.println("down");
				System.out.println("값을 다시 입력해 주세요 : ");
			}else {
				System.out.println("up");
				System.out.println("값을 다시 입력해 주세요 : ");
			}
			
		    cnt++;
		    choice = sc.nextInt();
		    sc.nextLine();
		}
		System.out.println("정답입니다 " + cnt + "번 째에 맞혔습니다!");
		
		sc.close();
	}
}
