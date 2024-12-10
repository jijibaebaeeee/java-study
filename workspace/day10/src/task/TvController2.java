package task;

import java.util.Scanner;

public class TvController2 {
	public static void main(String[] args) {

//	 BasicTv 클래스와 함께 동작하는 TvController 프로그램을 작성하세요
//	   프로그램은 사용자로부터 명령을 입력받아 TV를 제어한다
//
//	   BasicTv 객체를 생성하고, 초기값으로 색상 "Black", 크기 32인치, 가격 500000원을 설정
//	   프로그램은 무한 반복(while)하며 사용자에게 다음 메뉴를 출력한다
//
//	=== TV 컨트롤 메뉴 ===
//	1. 전원 On/Off
//	2. 채널 올리기
//	3. 채널 내리기
//	4. 종료
//	메뉴 번호 입력 : 
//
//	사용자가 메뉴 번호를 입력하면, 입력된 번호에 따라 다음 동작을 수행한다
//	1 : powerOnOff() 메서드 호출
//	   전원이 켜지면 "TV 전원이 켜졌습니다." 출력, 꺼지면 "TV 전원이 꺼졌습니다." 출력
//	2 : TV 전원이 켜져 있으면 channelUp() 메서드 호출하고, "현재 채널: [채널 번호]"를 출력
//	   꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//	3 : TV 전원이 켜져 있으면 channelDown() 메서드를 호출하고, "현재 채널: [채널 번호]"를 출력합니다. 꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//	그 외 : 프로그램을 종료하고 "프로그램을 종료합니다." 메시지 출력

		/*
		 * 로직구성 BasicT2v 클래스 필드 메소드 선언 
		 * 초기값을 위해 생성자 생성 
		 * TvController2에서 BasicTv 객체 생성(생성자에 맞게)
		 *  스캐너 클래스 임포트 선택받을 변수 선언 
		 *  while문으로 무한 반복 
		 *  switch 문사용하여 선택에 따른 함수 호출 
		 *  스캐너 할당 해제
		 */

		BasicTv2 tv = new BasicTv2("Black", 32, 500000);
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String msg = "	=== TV 컨트롤 메뉴 ===\r\n"
				+ "	1. 전원 On/Off\r\n"
				+ "	2. 채널 올리기\r\n"
				+ "	3. 채널 내리기\r\n"
				+ "	4. 종료\r\n"
				+ "	메뉴 번호 입력 :";

		
		System.out.println(msg);
		
		while(choice != 4) {
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				tv.powerOnOff();
				break;
			case 2:
				tv.channelUp();
				break;
			case 3:
				tv.channelDown();
				break;
			case 4:
				System.out.println("잘가요~");
				break;
			default:
				System.out.println("1~4의 수를 입력하세요 : ");
			}
			
		}
		
		
	}
}
