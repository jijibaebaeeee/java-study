package chapter11;
//예제 11-17 메서드 오버라이딩

class Animal2{ // 부모클래스
	//메서드
	void cry() {
		
	}
}

class Pig2 extends Animal2{ // 부모클래스를 상속받음
	//오버라이딩된 메서드 -> 업캐스팅되어도 이 메소드가 호출된다.
	@Override
	void cry() {
		System.out.println("꿀꿀");
	}
	
}

class Cow2 extends Animal2{ // 부모클래스를 상속받음
	//오버라이딩된 메서드 -> 업캐스팅되어도 이 메소드가 호출된다.
	@Override
	void cry() {
		System.out.println("음메");
	}
	
}

class Farm2{ // 클래스 선언
	void sound(Animal2 animal2) { // 참조변수의 다형성 
		animal2.cry(); //오버라이딩 된 메서드들이 호출될 것이다.
	}
}

public class EX11_17 { //메인 클래스
	public static void main(String[] args) {
		Farm2 f = new Farm2(); // Farm 객체 생성
		Pig2 p = new Pig2(); // pig2 객체 생성
		Cow2 c = new Cow2(); // Cow2 객체 생성
		f.sound(p); // 꿀꿀
		f.sound(c); // 음메
	}

}
