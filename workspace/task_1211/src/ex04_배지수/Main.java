package ex04_배지수;

import java.util.Scanner;

public class Main {
//	4. 학생 성적 관리 프로그램을 구현하라
//	[요구사항]
//	(1) Person 클래스
//	    - 필드 (private) : String name(학생 이름)
//	    - 생성자 : 이름을 매개변수로 받아 초기화
//	    - 메소드
//	        getName() : name 필드의 값을 반환
//
//
//	(2) Student 클래스
//	    Person 클래스 상속
//	    - 필드 (private) : int javaScore, int dbmsScore, int htmlScore(과목 점수)
//	    - 생성자 : Person의 생성자를 호출하고, 각 점수 초기화
//	    - 메소드	
//	        getTotalScore() : 세 과목 점수를 더한 값(정수)을 반환
//	        getAverageScore() : 평균(정수형)으로 반환
//
//
//	(3) Main 클래스
//	    메인 메소드 구현
//	    Student 객체를 생성하여 이름과 점수를 입력받는다(입력받을 점수는 0~100 범위 내, 입력클래스 사용)
//	    각 학생의 총점과 평균을 출력한다

	// 로직구성
	// (1), (2) 클래스의 조건에 맞게 필드 선언 + 생성자 생성 + 메소드 선언 하기
	// <Main>
	// 스캐너 클래스 임포트
	// 점수의 범위가 벗어나는 경우 계속 받기
	// 이름과 정수 입력받기
	// Studnet 객체 생성 (setter가 없으므로 생성자를 통해서 private 값에 접근가능)
	// 학생의 총점과 평균을 메소드를 호출 후리턴

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		sc.nextLine();
		
		System.out.println("java 점수를 입력하세요 : ");
		int javaScore = sc.nextInt();

		while (javaScore < 0 || javaScore > 100 ) {
			System.out.println("점수를 다시 입력해 주세요 :");
			javaScore = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("dbms 점수를 입력하세요 : ");
		int dbmsScore = sc.nextInt();
		
		while (dbmsScore < 0 || dbmsScore > 100 ) {
			System.out.println("점수를 다시 입력해 주세요 :");
			dbmsScore = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("html 점수를 입력하세요 : ");
		int htmlScore = sc.nextInt();
		
		while (htmlScore < 0 || htmlScore > 100 ) {
			System.out.println("점수를 다시 입력해 주세요 :");
			htmlScore = sc.nextInt();
			sc.nextLine();
		}
		
		
		Student st1 = new Student(name, javaScore, dbmsScore, htmlScore);
		
		System.out.println("총점 : " + st1.getTotalScore() + "점");
		System.out.println("평균 : " + st1.getAverageScore());
		
		sc.close();

	}

}
