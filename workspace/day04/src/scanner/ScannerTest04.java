package scanner;

import java.util.Scanner;

public class ScannerTest04 {
	public static void main(String[] args) {
		
		// 사용자로부터 주소를 입력받아 출력하기
		// 3개의 next 메소드를 사용하여 서울시 강남구 역삼동으로 출력될 수 있도록 할 것
		
		// 1. 입력 클래스 import
		// 2. 출력 메시지 1번
		// 3. 입력 메소드(.next()) 3개
		// 4. 출력 메소드
		
		// 1. 입력 클래스 import
		Scanner sc = new Scanner(System.in);
		// 2. 출력 메시지 1번
		System.out.println("주소를 입력하세요 : ");
		// 3. 입력 메소드(.next()) 3개
		String si = sc.next();	// 입력값을 공백단위로 나누어서 처리한다
		String gu = sc.next();  
		String dong = sc.next();
		// 4. 출력 메소드
		System.out.println("입력한 주소는 " + si + " " + gu + " " + dong + "입니다");
		// 5. Scanner 자원해제
		sc.close();
	}
}
