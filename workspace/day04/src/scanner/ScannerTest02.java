package scanner;

import java.util.Scanner;

// 2번 로직 구성

public class ScannerTest02 {
	public static void main(String[] args) {
//		// 1. 입력 클래스 변수 만들기
//		Scanner sc = new Scanner(System.in);
//		// 2. 출력 메시지(입력받을 것이 무엇인지)
//		System.out.println("지금 배우고있는 프로그래밍 언어는?");
//		// 3. String 변수명 = 입력메소드
//		String subject = sc.next();
//		// 4. 변수 출력
//		System.out.println(subject);
		
		// 실습
		// 이름을 입력하세요 : 000
		// 000님 안녕하세요
		// printf 사용하기
		
		// 1. 입력 클래스 변수 만들기 import : ctrl + shift + o
		// 2. 출력 메시지(입력받을 것이 무엇인지)
		// 3. String 변수명 = 입력메소드(.next())
		// 4. 변수 출력 (printf)
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.printf("%s님 안녕하세요", name);
	}
}
