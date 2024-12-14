package bookExample;
//예쩨 10-5 -> 상속에서 생성자
public class Customer extends Person {
	//필드
	int memberID;

	//생성자 -> 부모가 가지는 생성자의 매개변수를 포함해야함
	public Customer(String name, int age, int memberID) {
		super(name, age);
		this.memberID = memberID; // Customer 필드 채우기
	}
	
	void enter() {
		System.out.println("회원번호 : " + memberID);
	}
	

}
