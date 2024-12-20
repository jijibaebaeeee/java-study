package study3;

public class Main {
//	3. Payment (인터페이스)
//	public void processPayment(double amount) 포함
//
//	CreditCardPayment와 PaypalPayment (구현 클래스)
//
//	각각 다른 방식으로 결제 처리
//
//	public void handlePayment()
//
//	매개변수로 Payment를 받아 결제 로직을 구현하세요
	public static void main(String[] args) {
		
		CreditCardPayment cc = new CreditCardPayment(); // cc 클래스 타입의 객체 생성
		PaypalPayment pp = new PaypalPayment(); // pp 클래스 타입의 객체 생성
		
		cc.processPayment(1000000); // 인터페이스에서 구현한 메소드 호출
		pp.processPayment(3000000); // 인터페이스에서 구현한 메소드 호출
		
		Main main = new Main(); // handlePayment 호출을 위한 객체 생성
		
		main.handlePayment(cc, 38000); // 참조변수의 다형성 이용해서 메서드 호출
		main.handlePayment(pp, 50000);
	}
	
	public void handlePayment(Payment pay, double amount) {
		if(pay instanceof CreditCardPayment) { // 해당 클래스의 인스턴스면
			((CreditCardPayment)pay).handlePayment(amount); // 다운캐스팅
		}else if(pay instanceof PaypalPayment) { // 해당 클래스의 인스턴스면
			((PaypalPayment)pay).handlePayment(amount); // 다운캐스팅
		}
	}
	

}
