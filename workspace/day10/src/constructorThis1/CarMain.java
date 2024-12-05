package constructorThis1;
//9번 : 가독성 향상
class Car {
	//field
	String model;
	int speed;
	
	
	
//	public Car(String model) {
//		this.model = model;
//	}
//
//
//
//	public Car(int speed) {
//		this.speed += speed;
//	}
	
	void printInfo() {
		System.out.println("모델 : " + this.model);
		System.out.println("속도 : " + this.speed);
	}

}

public class CarMain {
	public static void main(String[] args) {
//		Car car1 = new Car("BMW");
		Car car1 = new Car();
		car1.printInfo();
	}
	 
}
