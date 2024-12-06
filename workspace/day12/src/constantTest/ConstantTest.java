package constantTest;

public class ConstantTest {
	//클래스 내부에서 상수 선언
	//상수는 정적변수로 사용하는 것이 빈번하다.
	
	static final int MAX_LENGTH = 100;	//클래스 상수
	//method, 클래스 로드시 초기화, 모든 객체가 공유
	final double PI = 3.14159265359;	//인스턴스 상수
	//heap, 객체 생성시 초기화, 객체마다 독립적(값이 같아도 독립적)
	
	public static void main(String[] args) {
		System.out.println(ConstantTest.MAX_LENGTH);
		ConstantTest ct = new ConstantTest();
		System.out.println(new ConstantTest().PI); // 가능은 하나 권장은 X
		System.out.println(ct.PI);
		
		
	}

}
