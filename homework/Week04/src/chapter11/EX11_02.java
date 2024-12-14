package chapter11;
//예제 11-2 클래스의 자동 타입 변환

import chapter10.Car;

class Car1{ // Car 클래스 선언
	
}

class Bus1 extends Car{ // Car 클래스를 상속받는 Bus 클래스
	
}

class SchoolBus1 extends Bus1{ // Bus 클래스를 상속받는 SchoolBus 클래스

}

class OpenCar extends Car{ // Car 클래스를 상속받는 OpenCar 클래스
	
}

class SportsCar extends OpenCar{ // OpenCar 클래스를 상속받는 SportsCar 클래스
	
}

public class EX11_02 { // 메인클래스
	public static void main(String[] args) {
		Car c1 = new SchoolBus1(); // Car타입의 참조변수에 SchoolBus 객체를 업캐스팅하여 저장
		
		Bus1 b1 = new Bus1(); //Bus 클래스 객체 생성
		Bus1 b2 = new SchoolBus1(); //Bus타입의 참조변수에 SchoolBus 객체를 업캐스팅하여 저장
		
		Car c2 = new OpenCar(); // Car타입의 참조변수에 OpenCar 객체를 업캐스팅하여 저장
		OpenCar oc = new SportsCar(); // OpenCar 참조변수에 SportsCar 객체를 업캐스팅하여 저장
//		Bus b3 = new OpenCar(); //오류
//		Bus b4 = new SportsCar(); //오류
		
		
		
	}

}
