package bookExample;
//예제 10-22 -> N차 상속
public class Bus extends Car { // 상속받았다
	int peopleNum;

	public Bus(int peopleNum) {
//		super();
		this.peopleNum = peopleNum; // 객체 생성시 승객수 초기화
	}
	
	void takePerson() {
		System.out.println("승객이 버스에 탔습니다");
		peopleNum++; // 숫자 1 증가
		System.out.println("지금까지 탑승한 승객은 " + peopleNum + "명입니다.");
	}

}
