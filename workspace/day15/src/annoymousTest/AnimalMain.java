package annoymousTest;

public class AnimalMain {
	public static void main(String[] args) {
		Animal cat = new Animal() {

			@Override
			public void speak() {
				System.out.println("야옹~~");
			}
			
		}; // 쓰인 개념 상속, 익명클래스(일회성으로 객체를 생성하기위해.., 종류 3개), 업캐스팅(다형성->3개 다형성), 오버라이딩
		
		Animal dog = new Animal() {

			@Override
			public void speak() {
				System.out.println("멍멍!!!");
			}
			
		};
		
		System.out.println(cat);
		System.out.println(dog);
		
	}
	
}
