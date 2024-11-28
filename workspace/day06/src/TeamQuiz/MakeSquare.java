package TeamQuiz;

import java.util.Scanner;

public class MakeSquare {
	   public static void main(String[] args) {
		      //문자 추출 사각형 생성 -> 사용된 주제 : 반복문, 입출력메소드, 형변환 
		      Scanner sc = new Scanner(System.in);
		      String msg = "";
		      char point = ' ';
		      
		      //문자열 받아오기
		      System.out.print("문자열을 입력해 주세요 : ");
		      msg = sc.next(); //문자 입력 받아오기
		      sc.nextLine(); //void buffer
		      
		      //문자열 중 3번째 문자를 가져오기
		      point = msg.charAt(2);
		      
		      //해당 문자로 사각형 만들기
		      for(int i=0; i<5; i++) {
		         for(int j=0; j<5; j++) {
		            System.out.print(point);
		         }
		         System.out.println();
		      }   
		      
		      
		      //해당 문자로 속이 빈 사각형 만들기
		      for(int i=0; i<5; i++) {
		         for(int j=0; j<5; j++) {
		            if(i==0 || i==4) {
		               System.out.print(point);
		            }else if(j==0 || j==4) {
		               System.out.print(point);
		            }else {
		               System.out.print(" ");
		            }
		         }
		         System.out.println();
		      }

		      
		      
	   }
}
