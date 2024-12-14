package chapter11;

//예제 11-10 Samsong1 컴퓨터 객체를 만들어줄 클래스
public class Samsong1 extends Computer1{
	
	@Override // 오버라이딩을 하였으므로 업캐스팅 후 해당 메소드를 호출하면 자식 클래스에서 구현한 메서드가 실행된다
	void powerOn() {
		super.powerOn(); //부모메소드도 호출 
		System.out.println("아이 러브 삼송");
	}

}
