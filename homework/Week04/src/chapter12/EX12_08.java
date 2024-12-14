package chapter12;
// 예제 12-8 -> 추상 메서드 오버라이딩 및 재정의
public class EX12_08 {
	public static void main(String[] args) {
		PineapplePhone pp = new PineapplePhone(); // 클래스의 객체 생성
		pp.powerOn(); // powerOn에서 openingLogo() 출력시 자식 클래스에서 오버라이딩된 메소드 출력
		pp.powerOff();// powerOff에서 openingLogo() 출력시 자식 클래스에서 오버라이딩된 메소드 출력
		
		System.out.println();
		
		Phone tp = new ThreeStarPhone(); // 업캐스팅은 추상클래스 참조변수로 선언 가능
		tp.powerOn(); // powerOn에서 openingLogo() 출력시 자식 클래스에서 오버라이딩된 메소드 출력
		tp.powerOff(); // powerOn에서 openingLogo() 출력시 자식 클래스에서 오버라이딩된 메소드 출력
	}
}
