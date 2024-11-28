package TeamQuiz;

import java.util.Scanner;

public class GradeAvg_2 {
	public static void main(String[] args) {
		// 평균 성적, 평균 학점 계산 
		// 사용된 주제 : 조건문, 입출력메소드, 상수 선언, 
		
		final int NUM = 3; // 과목 수
	      int score1 = 0, score2 = 0, score3 = 0;
	      double sum = 0.0, avg = 0.0;
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("3과목의 성적을 입력해주세요(띄어쓰기로 구분) : ");
	      score1 = sc.nextInt();
	      score2 = sc.nextInt();
	      score3 = sc.nextInt();
	      sc.nextLine(); // void buffer

	      // score 1
	      if (score1 >= 95) {
	         sum += 4.5;
	      }else if(score1 >=90) {
	         sum += 4.0;
	      }else if(score1 >=85) {
	         sum += 3.5;
	      }else if(score1 >= 80) {
	         sum += 3.0;
	      }else if(score1 >= 75) {
	         sum += 2.5;
	      }
	      
	      // score 2
	      if (score2 >= 95) {
	         sum += 4.5;
	      }else if(score2 >=90) {
	         sum += 4.0;
	      }else if(score2 >=85) {
	         sum += 3.5;
	      }else if(score2 >= 80) {
	         sum += 3.0;
	      }else if(score2 >= 75) {
	         sum += 2.5;
	      }
	      
	      // score 3
	      if (score3 >= 95) {
	         sum += 4.5;
	      }else if(score3 >=90) {
	         sum += 4.0;
	      }else if(score3 >=85) {
	         sum += 3.5;
	      }else if(score3 >= 80) {
	         sum += 3.0;
	      }else if(score3 >= 75) {
	         sum += 2.5;
	      }
	      
	      //평균 출력
	      avg = sum/NUM;
	      System.out.printf("평균 학점 : %.1f\n",avg);
	      
	      //평균 성적
	      if(avg < 2.5) {
	         System.out.println("평균 성적 : F");
	      }else if(avg < 3.0) {
	         System.out.println("평균 성적 : C+");
	      }else if(avg < 3.5) {
	         System.out.println("평균 성적 : B");
	      }else if(avg < 4.0) {
	         System.out.println("평균 성적 : B+");
	      }else if(avg < 4.5) {
	         System.out.println("평균 성적 : A");
	      }else {
	         System.out.println("평균 성적 : A+");
	      }
  }

}
