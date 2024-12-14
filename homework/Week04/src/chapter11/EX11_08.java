package chapter11;

//예제 11-9 강제형변환3
public class EX11_08 {
	public static void main(String[] args) {
		Bike b = new FourWheelBike("윤기"); // Bike타입의 참조변수에 FourWheelBike 객체의 참조값이 저장되었다. 업캐스팅
		b.info(); // 자식클래스에서 오버라이딩 된 메소드 출력
		b.ride(); // 부모클래스의 메소드 출력
//		b.addWheel(); // 부모타입으로는 호출 불가
		
		System.out.println();
		
		FourWheelBike fwb = (FourWheelBike) b; // 업캐스팅한 객체를 다시 다운캐스팅한다. 그것은 fwb 참조변수에 저장되도록한다.
		fwb.addWheel(); // 자식클래스의 메소드 호출
		fwb.info(); // 자식클래스에서 오버라이딩 된 메소드 출력
		fwb.ride(); // 부모클래스의 메소드 출력
		
	}

}
