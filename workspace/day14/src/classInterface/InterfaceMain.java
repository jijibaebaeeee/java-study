package classInterface;
//10번 : 인터페이스 다중 구현

interface InterfaceA{
	void methodA(); // 추상메소드
	void mode(String name); // 추상메소드
}

interface InterfaceB{ // 인터페이스
	void methodB(); // 추상메소드
	void mode(String name); // 추상메소드
}

class ClassC implements InterfaceA, InterfaceB{
	
	

//	@Override
//	public void mode() {
//		// TODO Auto-generated method stub
//		
//	}
	@Override // 오버라이딩 필수야 추상이니까
	public void mode(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override // 오버라이딩 필수야 추상이니까
	public void methodA() {
		System.out.println("InterfaceA의 메소드 구현");
	}

	@Override // 오버라이딩 필수야 추상이니까
	public void methodB() {
		System.out.println("InterfaceB의 메소드 구현");
	}


	
}


public class InterfaceMain {
	public static void main(String[] args) {
		//선언 필요
	}

}
