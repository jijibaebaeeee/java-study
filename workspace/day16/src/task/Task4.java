package task;

import java.util.Scanner;

public class Task4 {
//	4. 사용자로부터 숫자를 입력받아, 입력받은 숫자가 3의 배수인 경우 "Fizz", 
//	5의 배수인 경우 "Buzz", 3과 5의 공배수인 경우 "FizzBuzz", 
//	그 외의 경우에는 입력받은 숫자를 출력하는 프로그램을 작성하세요. 
//	사용자가 문자열을 입력할 경우, "숫자가 아닌 문자열이 입력되었습니다"라는 예외 메시지를 출력하세요.
	
	// 로직구성
	// <Task4> 클래스
	// 메인 메소드
	// 스캐너 클래스 임포트
	// 숫자를 입력받을 정수형 변수 선언
	// 숫자를 입력받기
	// 지금 생각났는데 Task4Method 클래스 객체 생성해야함
	
	//
	// <Task4Method> 클래스 throws TaskException 하기
	// 메소드 -> mapping(int num)    ※※※ 이거 mapping(Scanner sc)로는 할 수 없나? -> 가능
	// 구현하기
	// <(3번 문제에서 만든) TaskException 클래스> 
	// 예외처리할때 사용
	//
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task4Method tm = new Task4Method();
		
		try {
			tm.mapping(sc);
		} catch (TaskException e) {
			e.printStackTrace();
		}
		
//		try {
//			int num = sc.nextInt();
//			tm.mapping(num);
//		} catch (Exception e) {
//			System.out.println("숫자가 아닌 문자열이 입력되었습니다.");
//			e.printStackTrace();
//			System.out.println("");
//		}
		
		
		
		
		
	}
	
}
