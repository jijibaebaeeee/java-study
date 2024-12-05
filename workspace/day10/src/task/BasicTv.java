package task;

public class BasicTv {
//	2. BasicTv 클래스를 작성하세요
//	필드 :
//	boolean power : TV 전원 상태 (기본값: false)
//	int channel : TV 채널 (기본값: 1)
//	String color : TV의 색상
//	int size : TV의 크기
//	int price : TV의 가격
//
//	메서드:
//	void powerOnOff() : TV 전원을 켜거나 끄는 메서드
//	      전원이 켜져 있으면 끄고, 꺼져 있으면 켜야 다른 동작이 가능하다
//	void channelUp() : 채널을 1씩 증가시키는 메서드
//	      채널 최대값 999
//	void channelDown() : 채널을 1씩 감소시키는 메서드
//	      채널 최소값 1
	
	boolean power;
	int channel;
	String color;
	int size;
	int price;
	
	//power = false 이고 channel의 기본값은 1
	public BasicTv(boolean power, int channel) {
		this(power, channel, "Black", 32, 500000); // this() 사용해보기
		this.power = power;
		this.channel = channel;
	}
	
	//3번문제와 같이 하기 위해 모든 매개변수를 선언하는 생성자 추가
	public BasicTv(boolean power, int channel, String color, int size, int price) {
		this.power = power;
		this.channel = channel;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	
	
	
	
	void powerOnOff() {
		if(!power) {
			System.out.println("TV 전원이 켜졌습니다.");
			power = !power; // 켠다
		}else {
			System.out.println("TV 전원이 꺼졌습니다.");
			power = !power;
		}
	}

	


	void channelUp() {
		if(!power) { // TV가 꺼져있으면
			System.out.println("TV 전원을 먼저 켜주세요.");
		}else {
			if(channel == 999) { // 채널이 마지막 번호이면
				System.out.println("마지막 채널입니다 초기 채널로 갑니다.");
				channel = 1; // 처음으로 다시 돌아간다
				System.out.println("현재 채널 : [" + channel + "] 입니다.");
			}else { // 채널이 마지막이 아니라면
				channel++; // 채널의 수를 1 올린다.
				System.out.println("현재 채널 [" + channel + "] 입니다.");
			}
		}
	}
	
	void channelDown() {
		if(!power) { // TV가 꺼져있으면
			System.out.println("TV 전원을 먼저 켜주세요.");
		}else {
			if(channel == 1) { // 채널이 마지막 번호이면
				System.out.println("초기 채널입니다. 마지막 채널로 갑니다.");
				channel = 999; // 처음으로 다시 돌아간다
				System.out.println("현재 채널 : [" + channel + "] 입니다.");
			}else { // 채널이 처음이 아니라면
				channel--; // 채널의 수를 1 내린다
				System.out.println("현재 채널 [" + channel + "] 입니다.");
			}
		}
	}
	
	
}
