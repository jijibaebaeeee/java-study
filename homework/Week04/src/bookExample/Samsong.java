package bookExample;
//예제 10-8 -> 메서드 오버라이딩
public class Samsong extends Computer { // Computer : 부모, Samsong : 자식

	
	@Override // 오버라이딩을 하였으므로 자식객체에서 해당 메소드를 호출하면 자식 클래스에서 구현한 메서드가 실행된다
	void powerOn() {
		// 예제 10-10 -> super
		super.powerOn(); // 같은 메소드명의 부모메소드도 호출하는 방법! 
		System.out.println("아이 러브 삼송");
	}
	
}
