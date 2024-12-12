package task;

import java.util.Scanner;

public class Task2 extends Exception{
//	2. 문자열을 입력받아, 입력받은 문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요. 
//	만약 입력받은 문자열이 숫자가 아닐 경우, NumberFormatException 예외가 발생하게 되며, 
//	"숫자가 아닌 문자열이 입력되었습니다"라는 메시지를 출력하세요.
	
	// 사용된 주제 -> 예외처리, Exception 상속받은 클래스의 메인메소드에서 처리가 가능함
	// 로직구성
	// 스캐너 클래스 임포트
	// 문자열을 받을 String형 변수 선언
	// 문자열 입력받기
	// 문자열 받은 것은 Integer.ParseInt() 사용 <---- 이 부분이 예외발생 가능
	// try-catch를 사용하여 예외 처리하기
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수로 변환하고 싶은 문자열을 입력하세요 : ");
		// 입력받은 것을 바로 정수로 바꿔줄 수 있을 것 같다. String형이 아닌 int형으로 변수를 선언해보자
		int num = 0;
		
		
		try {
			num = Integer.parseInt(sc.next()); // <----예외 발생 가능 영역
		} catch (NumberFormatException e) { // <-- 아니 어떻게 바로 이 에러일 것을 알지?
			System.out.println("숫자가 아닌 문자열이 입력되었습니다.");
			e.printStackTrace();
		}
		
		System.out.println("변경성공된 값 :(int) " + num);
		
		
		
		
		
		
	}
}
