package chapter13;
//예제 13-2 정적 내부 클ㄹ스 선언하기

class PrintOut{ // default 접근제한자로 클래스 선언
	public static class Out{ // 정적 클래스 선언
		public void println(String str) { // 메소드 선언
			System.out.println(str); // 출력문
		}
	}
}


public class StaticClassExam { // 메인 클래스
	public static void main(String[] args) {
		String str = "정적 내부 클래스 테스트"; // 문자열 변수 선언
		PrintOut.Out out = new PrintOut.Out(); // PrintOut 클래스의 내부 클래스 객체 생성
		out.println(str); // 내부 클래스 객체 안의 메서드 호출
	}

}
