package oper;

import java.util.Scanner;

// 2번 : 삼항 연산자

public class OperTest01 {
	public static void main(String[] args) {
		// 다음 중 음식이 아닌것은?
		// 1. 피자
		// 2. 케이크
		// 3. 불고기
		// 4. Java
		// 삼항 연산자를 사용하여 입력 받은 값과 정답 비교하고 정답입니다 or 오답입니다 출력하기
		
		String quizMsg = "다음 중 음식이 아닌 것은 ? \n"
				+ "1. 피자\n"
				+ "2. 케이크\n"
				+ "3. 불고기\n"
				+ "4. java\n"
				+ "번호를 입력하세요 : ";
		
		System.out.println(quizMsg);
		
		// 로직구성
		// 정수형 1개, 문자열형 변수 1개 선언
		// 입력 클래스 임포트 
		// 입력 메소드 : nextInt()
		// 출력 메시지 -> 삼항연산자
		
		int num = 0 ;
		String result = "";
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		result = num == 4 ? "정답입니다." : (num < 1 || num >= 5) ? "없는 보기입니다." : "오답입니다.";
		System.out.println(result);
		
		// 문자열 비교
		String choice2 = "";
		final String answer2 = "java";
		choice2 = sc.next();
		System.out.println(answer2.equals(choice2) ? "정답" : "오답");
		//.equals() : 문자열 비교에서 사용하는 메소드
		// Object 클래스 . equals()메소드 배울 예정
		
		System.out.println("abc" == "a");
		
	}
}
