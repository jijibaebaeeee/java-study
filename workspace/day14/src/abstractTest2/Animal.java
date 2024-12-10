package abstractTest2;
//5번 : 추상클래스와 강제성
public abstract class Animal {
	// 필드
	String name; 
	int age; 
	
	//메소드
//	void crying() {
//		System.out.println("무조건 자식 클래스에서 오버라이딩 ");
//	}
	
	abstract void crying();
	

}
