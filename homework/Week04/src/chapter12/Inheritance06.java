package bookExample;
//예제 11-18 오버로딩과 오버라이딩

class Parent10{ // 디폴트 접근제한자이므로 같은 패키지에서만 객체 생성 가능
	public void display() { // public 접근제한자이지만 클래스가 디폴트라서 같은 패키지에서만 호출 가능
		System.out.println("부모 클래스의 display() 메서드입니다.");
	}
}

class Child extends Parent10{

	//오버라이딩된 display() 메서드
	@Override
	public void display() {
		System.out.println("자식 클래스의 display() 메서드입니다.");
	}
	//오버로딩된 display() 메서드 -> 매개변수의 개수 타입 순서가 다름
	public void display(String str) {
		System.out.println(str);
	}
	
}

public class Inheritance06 { //메인클래스
	public static void main(String[] args) {
		Child ch = new Child(); // Child 클래스 객체 생성
		ch.display(); // Child 클래스의 오버라이딩된 메서드 호출
		ch.display("오버로딩된 display() 메서드입니다."); // Child 클래스의 오버로딩된 메소드 호출
	}
}
