package bookExample;
//예제 11-1 클래스의 자동 타입 변환-1

class Parent1{ // Parent1 클래스 생성
	
}

class Child1 extends Parent1{ // Parent1로부터 상속받는 Child1 클래스
	
}

public class EX11_01 { // Ex11_01 메인클래스
	public static void main(String[] args) {
		Parent1 p1 = new Parent1(); // Parent1 클래스의 p1 객체 생성
		Child1 c1 = new Child1(); // Child1 클래스의 c1 객체 생성
		
		Parent1 p2 = new Child1(); // 상속관계이므로 업 캐스팅 가능
		Parent1 p3 = c1; // 업 캐스팅
//		Child c2 = p1; 자동 타입 변환 X
		
		if(p3 == c1) {
			System.out.println("p3와 c1은 같은 객체를 참조하고 있습니다.");
		}
		
	}
}
