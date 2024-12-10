package abstractTest1;
//4번 : 일반클래스와 추상클래스 객체화
public class AbstractTest {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a);
		
//		ClassB b = new ClassB(); // 추상 클래스 ClassB 객체화 불가능-미완성된 클래스
		ClassC c = new ClassC();
		System.out.println(c); // ClassB 추상 클래스를 상속받은 자식클래스
		
		ClassB b = new ClassC(); // 업캐스팅
		System.out.println(b);
		b.method1(); // 오버라이딩 된 메소드 호출
		//다운캐스팅
		((ClassC)b).method1();
		
	}

}
