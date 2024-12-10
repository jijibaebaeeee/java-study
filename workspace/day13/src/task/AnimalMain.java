package task;

public class AnimalMain {
//  Animal 클래스
//  부모클래스
//  필드: 없음
//  메소드: cry() (소리를 출력)
//  
//  Cat 클래스
//  부모클래스를 상속받는 자식클래스
//  필드: 없음
//  메소드: cry() 오버라이딩 (고양이 소리를 출력)
//     play() 스크래치 놀이를 합니다 출력
//     
//  Dog 클래스
//  부모클래스를 상속받는 자식클래스
//  필드: 없음
//  메소드: cry() 오버라이딩 (개 소리를 출력)
//     walk() 산책을 갑니다 출력
//  
//  Mouse 클래스
//  부모클래스를 상속받는 자식클래스
//  필드: 없음
//  메소드: cry() 오버라이딩 (쥐 소리를 출력)
//     sleep() 고양이를 피해 잠을 잡니다 출력
//     
//  AnimalMain 클래스
//  Animal 클래스의 객체 생성
//  각 클래스의 객체 생성
//  메소드 : main메소드
//  printCrying(Animal animal)메소드   
//     (조건문으로 instanceof 사용해서 해당 하는 것에 맞는 객체의 메소드가 사용되도록 진행-다운캐스팅 이용)
//  
//  (각 객체를 넣었을 때 결과 출력-어떤과정이 진행되었는지 주석달아 작성)
	
	public static void main(String[] args) {
//		Animal ani = new Animal(); // Animal 클래스 타입의 객체 생성
//		Cat cat = new Cat();  // Cat 클래스 타입의 객체 생성
//		Dog dog = new Dog();  // Dog 클래스 타입의 객체 생성
//		Mouse mouse = new Mouse(); // Mouse 클래스 타입의 객체 생성
		
		
		Animal[] ani = {new Cat(), new Dog(), new Mouse()};
	
		check(ani);
//		// 강사님의 간결한 풀이 
//		Animal[] ani = {new Cat(), new Dog(), new Mouse()};
//		
////		cat.cry(); // Cat 클래스에서 오버라이딩 된 cry 메소드 출력
////		dog.cry(); // Dog 클래스에서 오버라이딩 된 cry 메소드 출력
////		mouse.cry(); // Mouse 클래스에서 오버라이딩 된 cry 메소드 출력
//		
////		printCrying(cat); // 메소드 호출
////		printCrying(dog); // 메소드 호출
////		printCrying(mouse); // 메소드 호출
//		
//
//		for(Animal animal : ani) {
//			printCrying(animal);
//		}
//		
//		
//		
	}
	static void check(Animal[] animal) {
		for(Animal ani : animal) {
			ani.cry();
			if(ani instanceof Cat) {
				((Cat)ani).play();
			}else if(ani instanceof Dog) {
				((Dog)ani).walk();
			}else if(ani instanceof Mouse) {
				((Mouse)ani).sleep();
			}
		}
	}
	
	
//	
//	static void printCrying(Animal animal){
//		animal.cry();
//		if(animal instanceof Dog) {
//			((Dog)animal).walk();
//		}else if(animal instanceof Cat) {
//			((Cat)animal).play();
//		}else if(animal instanceof Mouse){
//			((Mouse)animal).cry();
//		}
//		
//	}

}
