package bookExample;

public class Person1 {
	Phone1 p;
	
	
	//생성자
	public Person1(Phone1 p) {
		this.p = p;
	}




	void buyNewPhone(Phone1 p) {
		this.p = p;
		System.out.println("==================");
		System.out.println("새 폰을 샀습니다.");
	}
	
	void turnOnPhone() {
		p.powerOn();
	}
	
	void turnOffPhone() {
		p.powerOff();
	}
	
	void watchUtube() {
		if(p.isOn()) {
			p.watchUtube();
		}else {
			System.out.println("폰이 꺼져있기 떄문에 U 튜브를 볼 수 없습니다.");
		}
	}
	
	void chargePhone() {
		p.charge();
	}
}
