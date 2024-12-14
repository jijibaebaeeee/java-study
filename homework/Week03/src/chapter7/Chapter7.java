package chapter7;

// 예제 7-4 하나의 소스 파일에 하나의 클래스 선언
class Cat{ // 클래스 선언
	
}

public class Chapter7 { // 예제 7-1 클래스 선언
	public static void main(String[] args) {
		Cat c = new Cat(); // Cat 클래스를 이용해서 객체 생성, 클래스 사용 = 객체 생성
		
		// 예제 7-6 필드 사용
		Car car = new Car(); // 7-5에서 만든 Car 클래스 객체 생성
		System.out.println("wheel의 개수는 " + car.wheel + "개 입니다."); // 필드 값 출력
		
		car.wheel = 5; // 필드 값 변경
		System.out.println("wheel의 개수는 " + car.wheel + "개 입니다."); // 필드 값 출력

		// 예제 7-9 -> 메서드 사용하기
		car.ride(); // 메소드 사용		
		car.ride(); // 메소드 사용
		car.ride(); // 메소드 사용
		
		// 예제 7-11 -> 인스턴스 멤버
		Family father = new Family(); // Family 객체 생성
		Family son = new Family(); // Family 객체 생성
		
		father.address = "인천"; // father의 필드 값 변경
		System.out.println(son.address); // son의 필드 값 출력
		System.out.println(father.address); // father의 필드 값 출력
		
	}
	
}
