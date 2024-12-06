package ex01;

import java.util.Scanner;

//배지수
public class Main {
	int s1;
	int s2;
	int avg;
	char grade;
	
	
	
	public static void main(String[] args) {
		//성적 평가 프로그램
		//학생의 성적을 2과목 입력받아 학점을 계산하는 프로그램 
		//90점이상 A, 80점이상 90점 미만 B, 70점이상 80점 미만 C, 70점미만 F //2과목 평균계산해서 정수형으로 비교
		
		//반드시 메소드를 만들 것(2개 이상)
		//객체도 2개 만들 것 (학생1, 학생2)
		
		//로직구성있어야함

		//사용자로부터 점수를 입력받고 학점과 합격 여부를 출력하기
		//필드 : 이름, java점수, dbms점수, 총점, 학점
		//생성자 : 상관없음
		//메소드 : calculateGrade(int ) : 점수를 받아 학점 반환하는 메소드(매개변수 1개 정수형)
		// 		isPass(int) : 점수가 70점이상이면 true, 아니면 false반환하는 메소드
		
		/* 로직구성
		 * 
		 * 스캐너 임포트
		 * 객체 2개 선언
		 * 2과목을 입력받기
		 * 평균을 구하기 -> 메소드 이용
		 * 점수를 if문으로 비교
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		Main p1 = new Main();
		Main p2 = new Main();
		
//		int s1 = 0, s2 = 0;
//		int avg = 0;
		
		System.out.println("첫 번째 학생 두 과목의 점수를 띄어쓰기로 입력 : ");
		
		p1.s1 = sc.nextInt();
		p1.s2 = sc.nextInt();
		sc.nextLine();
		
		p1.avg = p1.findavg(p1.s1, p1.s2);
		
		System.out.println("두 번째 학생 두 과목의 점수를 띄어쓰기로 입력 : ");
		
		p2.s1 = sc.nextInt();
		p2.s2 = sc.nextInt();
		sc.nextLine();
		
		p2.avg = p2.findavg(p2.s1, p2.s2);
		
		
		if(p1.avg)
		
	}
	
	int findavg(int s1, int s2) {
		return (int) (s1 + s2) / 2;
	}

}
