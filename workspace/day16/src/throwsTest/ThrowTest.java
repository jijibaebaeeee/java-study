package throwsTest;
//6번 : 예외 발생시키기 (내맘대루~~) new 예외명()
public class ThrowTest {
	public static void main(String[] args) {
		
		System.out.println("예외를 발생시킬거다.");
		
		throw new NumberFormatException(); // 아래에 문장이 있어도 프로그램이 종료된다. 위에 출력문도 안나옴. Checked Exception임
//		System.out.println("출력 끝");
		
	}
}
