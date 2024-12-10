package classInterface;
//11번 : 인터페이스의 단일 상속

interface ParentInter{
	void method1();  // 추상메서드
}
			//자식				//부모
interface ChildInter  extends ParentInter {
	void method2(); // 추상메서드
}
	   //자식				  //부모
class ClassD implements ChildInter{

	@Override // for ParentInter
	public void method1() {
		System.out.println("ParentInter의 메소드 구현");
	}

	@Override // for ChildInter
	public void method2() {
		System.out.println("ChildInter의 메소드 구현");
	}
	
}

public class InterfaceMain2 {
	public static void main(String[] args) {
		ClassD a = new ClassD();
		a.method1(); // ParentInter의 메서드 오버라이딩된것
		a.method2(); // CgildInter의 메서드 오버라이딩된것
		
		ChildInter ci = new ClassD(); // 업 캐스팅!
		ci.method1();
		ci.method2();
		
		ParentInter pi = new ClassD();
		pi.method1(); // 업 캐스팅 !
	}
	
	

}
