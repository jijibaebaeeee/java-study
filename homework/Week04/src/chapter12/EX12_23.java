package chapter12;
//예제 12-23 -> 인터페이스 상속
public class EX12_23 {
	public static void main(String[] args) {
		System.out.println("---TJmic 객체---");
		TJmic tj = new TJmic(); // TJmic 클래스의 객체 생성
		tj.connect(); // TJmic에서 구현한 메소드호출
		tj.music(); // TJmic에서 구현한 메소드호출
		tj.sing(); // TJmic에서 구현한 메소드호출
		
		System.out.println("---TJmic 객체를 BluetoothMIC로 타입 변환");
		BluetoothMIC1 bm = tj; // 업캐스팅 하였음
		bm.connect(); //업캐스팅되었지만 오버라이딩된 메서드가 호출된다 ★
		bm.music(); //업캐스팅되었지만 오버라이딩된 메서드가 호출된다 ★
		bm.sing(); //업캐스팅되었지만 오버라이딩된 메서드가 호출된다 ★

		
		System.out.println("---TJmic 객체를 Microphone로 타입 변환");
		Microphone1 m = tj; // 업캐스팅 하였음
		m.sing(); // 자신의 인터페이스에 선언했고 오버라이딩된 것이 호출될 것이다
//		m.connect(); 호출 불가능 구현이 Microphone에서 접근이 불가능함
//		m.music(); 호출 불가능
		
		System.out.println("---TJmic 객체를 Speaker1로 타입 변환");
		Speaker1 s = tj;
		//s.connect() //접근 불가능
		s.music(); // 자신의 인터페이스에 선언했고 오버라이딩된 것이 호출될 것이다
//		s.sing(); //접근 불가능
		
		
	}
}
