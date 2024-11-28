package TeamQuiz;
// 

import java.util.Scanner;

public class GradeAvg {
	public static void main(String[] args) {
		//
		//100만점인 4과목의 점수를 입력 -> 평균 학점과 각과목의 성적(A+)을 출력
		//95-100 = A+(4.5) 
		//90-94 = A(4.0)
	    //85-89 = (b+)
		//80-84 = (b)
	    //75-79 = (c+)
		
		double sub1 = 0, sub2 = 0, sub3 = 0, sub4 = 0;
	      int score = 0;
	      double avg = 0.0;

	      String sub1g = "";
	      String sub2g = "";
	      String sub3g = "";
	      String sub4g = "";
	      
	      Scanner sc = new Scanner(System.in);

	      System.out.print("과목1 점수 입력 : ");
	      score = sc.nextInt();
	      sc.nextLine();

	      if (95 <= score && score <= 100) {
	         sub1g = "A+";
	         sub1 = 4.5;
	      } else if (90 <= score && score <= 95) {
	         sub1g = "A";
	         sub1 = 4.0;
	      } else if (85 <= score && score <= 90) {
	         sub1g = "B+";
	         sub1 = 3.5;
	      } else if (80 <= score && score <= 85) {
	         sub1g = "B";
	         sub1 = 3.0;
	      } else if (75 <= score && score <= 80) {
	         sub1g = "C+";
	         sub1 = 2.5;
	      } else {
	         sub1g = "F";
	         sub1 = 0;
	      }

	      System.out.print("과목2 점수 입력 : ");
	      score = sc.nextInt();
	      sc.nextLine();

	      if (95 <= score && score <= 100) {
	         sub2g = "A+";
	         sub2 = 4.5;
	      } else if (90 <= score && score <= 95) {
	         sub2g = "A";
	         sub2 = 4.0;
	      } else if (85 <= score && score <= 90) {
	         sub2g = "B+";
	         sub2 = 3.5;
	      } else if (80 <= score && score <= 85) {
	         sub2g = "B";
	         sub2 = 3.0;
	      } else if (75 <= score && score <= 80) {
	         sub2g = "C+";
	         sub2 = 2.5;
	      } else {
	         sub2g = "F";
	         sub2 = 0;
	      }
//	         
	      System.out.print("과목3 점수 입력 : ");
	      score = sc.nextInt();
	      sc.nextLine();

	      if (95 <= score && score <= 100) {
	         sub3g = "A+";
	         sub3 = 4.5;
	      } else if (90 <= score && score <= 95) {
	         sub3g = "A";
	         sub3 = 4.0;
	      } else if (85 <= score && score <= 90) {
	         sub3g = "B+";
	         sub3 = 3.5;
	      } else if (80 <= score && score <= 85) {
	         sub3g = "B";
	         sub3 = 3.0;
	      } else if (75 <= score && score <= 80) {
	         sub3g = "C+";
	         sub3 = 2.5;
	      } else {
	         sub3g = "F";
	         sub3 = 0;
	      }

//	         
	      System.out.print("과목4 점수 입력 : ");
	      score = sc.nextInt();
	      sc.nextLine();

	      if (95 <= score && score <= 100) {
	         sub4g = "A+";
	         sub4 = 4.5;
	      } else if (90 <= score && score <= 95) {
	         sub4g = "A";
	         sub4 = 4.0;
	      } else if (85 <= score && score <= 90) {
	         sub4g = "B+";
	         sub4 = 3.5;
	      } else if (80 <= score && score <= 85) {
	         sub4g = "B";
	         sub4 = 3.0;
	      } else if (75 <= score && score <= 80) {
	         sub4g = "C+";
	         sub4 = 2.5;
	      } else {
	         sub4g = "F";
	         sub4 = 0;
	      }

	      avg = (sub1 + sub2 + sub3 + sub4) / 4;

	      System.out.printf("과목 1의 학점 : %s \n", sub1g);
	      System.out.printf("과목 2의 학점 : %s \n", sub2g);
	      System.out.printf("과목 3의 학점 : %s \n", sub3g);
	      System.out.printf("과목 4의 학점 : %s \n", sub4g);
	      System.out.printf("평균 학점 : %.1f", avg);
		
		}
}
