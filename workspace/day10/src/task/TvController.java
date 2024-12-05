package task;

import java.util.Scanner;

public class TvController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BasicTv tv = new BasicTv(false, 1); // this() 사용해보기 위해서 인수 2개만 전달
		
		int choice = 0; // 사용자로부터 번호를 받기위한 정수형 변수
		
		String msg = "=== TV 컨트롤 메뉴 ===\r\n"
				+ "1. 전원 On/Off\r\n"
				+ "2. 채널 올리기\r\n"
				+ "3. 채널 내리기\r\n"
				+ "4. 종료\r\n"
				+ "메뉴 번호 입력 : \r\n"
				+ "";
		
		System.out.println(msg);
		choice = sc.nextInt();
		sc.nextLine();
		
		while(!(choice == 4)) {
			if(choice < 1 || choice > 4) {
				System.out.println("1~4의 수를 입력해주세요 : ");
				System.out.println(msg);
				choice = sc.nextInt();
				sc.nextLine();
			}else { // 1~4의 수가 입력된 경우
				switch(choice) {
				case 1: // 1이 입력된 경우
					tv.powerOnOff(); // TV를 켜거나 끈다.
					System.out.println(msg);
					choice = sc.nextInt();
					sc.nextLine();
					break;
				case 2: // 2가 입력된 경우
					tv.channelUp();
					System.out.println(msg);
					choice = sc.nextInt();
					sc.nextLine();
					break;
				case 3:
					tv.channelDown();
					System.out.println(msg);
					choice = sc.nextInt();
					sc.nextLine();
					break;
				case 4:
					break;
				} // switch문의 끝
//				break;
			}// if~else문의 끝
			
		}
		System.out.println("프로그램을 종료합니다.");
		
	}
	

}
