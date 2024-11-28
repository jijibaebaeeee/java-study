package doWhileTest;

public class BreakTest {
	public static void main(String[] args) {
		// 1~10까지 중 5까지만 출력하기
		for(int i = 0; i < 10; i++ ) {
			System.out.println(i + 1);
			if(i == 4) {
				break;
			}
			
		}
		System.out.println("출력 끝");
		
		//1~10까지 중 7까지만 출력(While문)
		
		int num = 0;
		
		while(num < 10) {
			if(num > 6) {
				break;
			}
			System.out.println(num + 1);
			num++;
		}
		
	}
}
