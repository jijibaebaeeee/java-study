package bookExample;
//예제 11-16 instanceof 연산자와 == 연산자의 차이
class Aniaml{ // Animal 클래스 부모클래스
	
}

class Pig1 extends Animal{ // Animal 클래스를 상속받는 Pig 클래스
	
}

public class EX11_16 { // 메인 클래스
	public static void main(String[] args) {
		Pig1 p1 = new Pig1(); // Pig 클래스의 객체 생성
		Pig1 p2 = new Pig1(); // Pig 클래스의 객체 생성
		Animal a = p1; // Animal 클래스타입의 참조변수에 p1의 참조값을 대입. (업캐스팅)
		
		if(a instanceof Pig1) { // a가 Pig의 인스턴스라면. = a가 Pig클래스의 객체라면
			System.out.println("객체 변수 a는 Pig 타입으로 생성된 객체입니다.");
		}
		
		if(a == p1) { // a가 p1과 같은 객체를 참조한다면
			System.out.println("a와 p1은 같은 객체를 참조하고 있습니다.");
		}
		
		if(a != p2) { // a가 p2와 같은 객체를 참조하지 않는다면
			System.out.println("a와 p2는 같은 객체를 참조하고 있지 않습니다.");
		}
	}
}
