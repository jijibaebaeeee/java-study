package casting3;

public class CastingTest2 {
	public static void main(String[] args) {
//		Animal animal = new Animal();
//		Animal animal2 = new Dog(); // 업캐스팅
//		
//		System.out.println(animal2 instanceof Dog);
//		System.out.println(animal2 instanceof Animal);
//		
//		// 1. 같은 메소드가 부모에도 있고, 자식에도 있는 경우(오버라이딩 된 경우)
//		// 업캐스팅을 하여도 오버라이딩 된 메소드가 실행된다
//		animal2.crying(); // 부모의 타입으로 참조하지만(?) 오버라이딩 된 자식 메소드가 호출된다.
//		animal.crying();
//		
//		// 2. 메소드가 부모에는 없고 자식에서 추가된 경우
//		// (부모에 존재하지 않는 멤버에 접근하려는 경우)
////		animal2.walk();
//		// 자식 클래스에서 추가한 멤버는 부모타입의 참조변수로는 접근할 수 없다
//		// 이 경우에는 다운 캐스팅을 해야한다
//		((Dog)animal2).walk(); // 소괄호 하나더 필수
//	}
//	
//	//1. 메소드의 매개변수로 여러 타입의 값을 받는 경우
//	// 일반적으로는 각각의 타입을 처리하는 메소드를 별도로 만들어야한다
//	// 매개변수에 업캐스팅을 하게 되면 1개의 타입으로 자식 클래스의 값들을 담아줄 수 있다.
//	
//	// 원래는 아래처럼 2개처럼 따로 선언해야함
////	static void printText(Dog dog) {
////		System.out.println(dog.name + "이가 운다");
////		dog.crying();
////	}
////	static void printText(Cat cat) {
////		System.out.println(cat.name + "이가 운다");
////		cat.crying();
////	}
		
		//생성자 추가 후 객체 생성
		Animal animal = new Animal("동물");
		Dog dog = new Dog("바둑이");
		Cat cat = new Cat("별이");
		
//		printText(animal);
		printText(dog); //업캐스팅 된 객체
		printText(cat); //업캐스팅 된 객체
		
		tryWalk(dog);
		
	}
//
	//2. 같은 부모 클래스가 존재한다면 매개변수를 부모타입으로 받는다
	// 하나의 메소드에서 매개변를 부모타입으로 만들면 여러 자식타입을 받아서 사용이 가능하다(메소드 다형성)
	// 이렇게 부모타입을 하나로 선언하면 자식타입들 모두 다 커버 가능
	   static void printText(Animal ani) {
		      System.out.println(ani.name + "가 운다");
		      ani.crying(); // 업캐스팅된 객체가 들어와도 오버라이딩 된 메소드가 호출된다
		   }
	   
	//3. 만약 부모클래스에 존재하지 않는 멤버에 접근하기 위해서는?
	//down casting을 해줘야한다
	   static void tryWalk(Animal animal) {
		   //매개변수로 받아온 객체의 주소가 Cat타입인지, Dog타입인지를 확인한다.
		   if(animal instanceof Dog) {
			   ((Dog)animal).walk();
		   }else {
			   System.out.println("산책안가!");
		   }

	   }

}
