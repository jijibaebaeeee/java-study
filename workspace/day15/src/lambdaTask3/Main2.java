package lambdaTask3;

import java.util.Scanner;

public class Main2 {
//	3번문제
//	두 문자열을 입력받아 첫 번째 문자열을 두 번째 문자열의 길이만큼 잘라내는 프로그램을 만든다.
//	ex)
//	첫 번째 : abcde
//	두 번째 : 가나다
//	결과 : de
//
//	(1) SubInter.java(인터페이스)에 두 문자열을 매개변수로 받고 문자열을 반환하는 추상 메소드를 만든다.
//	(2) Main2.java(클래스)에 다음과 같은 static 메소드를 선언한다.
//	    - 매개변수로 문자열을 전달받는다.
//	    - 전달받은 문자열이 "F"면 앞에서 자르고 "B"면 뒤에서 자르는 람다식을 만든다.
//	    작성된 람다식을 SubInter 타입의 변수에 저장하여 반환하는 메소드를 만든다.
	
	// 로직구성
	// <서브 인터페이스> 
	// 추상메소드 만들기
	// <Main2> 클래스
	// 입력클래스 임포트
	// 두개의 문자열을 받아줄 변수 선언 + 입력받기
	// 메소드 선언
	// 리턴값 받을 객체를 생성하여 받아주기
	// 값이므로 출력문을 통하여 출력하기 <- fin
	// <static 메소드>
	// SubInter형 객체를 만들고, 익명클래스를 만들어서 오버라이딩하여 구현하기
	// 구현완료하면 주석처리하고, SubInter 객체 생성하여 람다식으로 저장하기
	// return을 SubInter 객체명으로 한다 
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line1 = "", line2 ="";
		
		System.out.println("첫 번째 문자 입력 : ");
		line1 = sc.nextLine();
		System.out.println("두 번째 문자 입력 : ");
		line2 = sc.nextLine();
	
		SubInter si = cut(line1, line2); // si는 람다식
		
		System.out.println(si.cutting(line1, line2));
	}
	
	static SubInter cut(String line1, String line2) {
		
//		SubInter si = new SubInter() {
//			@Override
//			public String cutting(String st1, String st2) {
//				String result = "";
//				for(int i = 0; i < st1.length() - st2.length(); i++) {
//					result += line1.charAt(i+st2.length());
//				}
//				return result;
//			} // 익명클래스에서 오버라이딩 하기
//		};
			//람다식으로 바꾸기
			SubInter si1 = (st1, st2) -> {String result = "";for(int i = 0; i < st1.length() - st2.length(); i++) {result += line1.charAt(i+st2.length());}return result;};
			
			return si1;
	
	}
}
