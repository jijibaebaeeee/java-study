package abstractTest2;
//5번 : 추상클래스와 강제성
public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = new Cat(); // 업캐스팅
		Animal animal2 = new Dog(); // 업캐스팅
		System.out.println(animal);
		System.out.println(animal2);
		
		animal.crying(); // 오버라이딩 된 메소드 호출
		animal2.crying(); // 오버라이딩 된 메소드 호출
	}

}
