package scanner;

import java.util.Scanner;

// 6번 nextInt()

public class ScannerTest05 {
	public static void main(String[] args) {
		
		//나이(nextInt), 이름(nextLine)을 입력받기
		
		// 1. 변수 선언(int, String)
		// 2. 입력 클래스 import
		// 3. 출력 메시지(나이 입력 : )
		// 4. 변수 = nextInt()
		// 5. 출력 메시지(이름 입력 : )
		// 6. 변수 = nextLine()
		// 7. 출력 (이름은 000이고 나이는 0살 입니다)
		
		int age = 0;
		String name = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		sc.nextLine();  // 나이 입력하고 enter 치면 버퍼에 enter 남으므로 언제 쓸지 모르는 nextline에 대비해 미리 사용하여 제거해준다
		System.out.println("이름 입력 : ");
		name = sc.nextLine();
		System.out.println("이름은 " + name + "이고 나이는 " + age + "살 입니다.");
		sc.close();
	}
	
}
