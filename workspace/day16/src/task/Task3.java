package task;

import java.util.Scanner;

public class Task3 {
//	3. 사용자로부터 정수를 입력받아, 입력받은 정수가 0에서 100 사이의 값인 경우, 
//	입력받은 정수를 2배한 값을 출력하고, 그 외의 값이 입력될 경우 
//	"잘못된 입력입니다"라는 예외 메시지를 출력하세요.
	
	// 필요한 개념 -> 커스텀 예외처리가 필요!
	//			  내가 원하는 예외를 발생시키기 위해서는 원하는 부분에서 throw new가 필요함.
	
	// 로직구성
	// 예외처리시 throw가 필요하므로 메소드 만들어야함
	// 
	// <Main>
	// 스캐너 클래스 임포트
	// 정수를 입력받을 변수 선언
	// 정수를 입력받기
	// 함수를 호출한다! <-- 이 부분이 예외가 아주 의심스러운 영역
	// 
	// <Method>
	// static int 로 만들기
	// if문 사용해서 0~100이 아니면 
	//		예외를 일부로 발생

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~100사이의 숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		try {
			twiceNum(num);
		} catch (TaskException e) {
			e.printStackTrace();
		}
		
	}
	
	static void twiceNum(int num) throws TaskException {
		if(num < 0 || num > 100) {
			throw new TaskException("잘못된 입력입니다.");
		}else {
			System.out.println("반환값 : " + num * 2);
		}
	}
	

}
