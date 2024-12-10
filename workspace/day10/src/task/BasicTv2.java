package task;

public class BasicTv2 {
//	2. BasicTv 클래스를 작성하세요
//	필드 :
//	boolean power : TV 전원 상태 (기본값: false)
//	int channel : TV 채널 (기본값: 1)
//	String color : TV의 색상
//	int size : TV의 크기
//	int price : TV의 가격
//
//	사용자가 메뉴 번호를 입력하면, 입력된 번호에 따라 다음 동작을 수행한다
//	1 : powerOnOff() 메서드 호출
//	   전원이 켜지면 "TV 전원이 켜졌습니다." 출력, 꺼지면 "TV 전원이 꺼졌습니다." 출력
//	2 : TV 전원이 켜져 있으면 channelUp() 메서드 호출하고, "현재 채널: [채널 번호]"를 출력
//	   꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//	3 : TV 전원이 켜져 있으면 channelDown() 메서드를 호출하고, "현재 채널: [채널 번호]"를 출력합니다. 꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//	그 외 : 프로그램을 종료하고 "프로그램을 종료합니다." 메시지 출력
	
	//필드
	boolean power;
	int channel;
	String color;
	int size;
	int price;
	
	//생성자
	public BasicTv2(String color, int size, int price) {
		super();
		this.power = false;
		this.channel = 1;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	
	
	void powerOnOff() {
		if(power) {
			System.out.println("TV 전원이 꺼졌습니다.");
			power = !power;
		}else {
			System.out.println("TV 전원이 켜졌습니다.");
			power = !power;
		}
	}
	

	void channelUp() {
		if(power) {
			if(this.channel == 999) {
				System.out.println("최대 채널입니다.");
				this.channel = 1;
				System.out.println("현재 채널 : [" + this.channel + "]");
			}else {
				this.channel++;
			System.out.println("현재 채널 : ["+ this.channel +"]");
		}
		}else {
			System.out.println("TV 전원을 먼저 켜주세요.");
		}
	}
	
	void channelDown() {
		if(power) {
			if(this.channel == 1) {
				System.out.println("최대 채널입니다.");
				this.channel = 999;
				System.out.println("현재 채널 : [" + this.channel + "]");
			}else {
			this.channel -= 1;
			System.out.println("현재 채널 : [" + this.channel + "]");
			}
		}else {
			System.out.println("TV 전원을 먼저 켜주세요.");
		}
	}
	
}
