package chapter11;
//예제 11-15 instanceof 연산자
class Animal{ // Animal 클래스 = 부모클래스
	
}

class Pig extends Animal{ // Animal 클래스를 상속받는 Pig 클래스
	
}

class Cow extends Animal{ // Animal 클래스를 상속받는 Cow 클래스
	
}

class Farm{
	void sound(Animal animal) { // 매개변수가 업캐스팅을 유도함
		if(animal instanceof Pig) { // 해당 객체가 Pig의 인스턴스라면
			System.out.println("꿀꿀"); // 출력문
		}else { // 아니라면
			System.out.println("음메"); // 음메
		}
	}
}

public class EX11_15 { // 메인클래스
	public static void main(String[] args) {
		Farm f = new Farm(); // Farm 클래스의 객체 생성
		Pig p = new Pig(); // Pig 클래스의 객체 생성
		Cow c = new Cow(); // Cow 클래스의 객체 생성
		f.sound(p); // sound(p)에서 참조변수의 다형성이 사용되었다. 업캐스팅됨
		f.sound(c); // sound(c)에서 참조변수의 다형성이 사용되었다. 업캐스팅됨
	}

}
