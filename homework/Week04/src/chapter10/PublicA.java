package bookExample;
//예제 10-11 -> 접근 제한자 public
public class PublicA {
	//필드
	public int a;

	//생성자 
	// 예제 10-19 접근제한자 private
	private PublicA(int a) {
//		super();
		this.a = a;
	}
	
	public void printA() { // 접근 제한자 public -> 모든 패키지의 모든 클래스에서 참조 가능!
		System.out.println("PublicA 클래스의 printA() 메서드입니다.");
	}
	
	
	//예제 10-14 접근 제한자 default
	DefaultC dc = new DefaultC(); // default 클래스이므로 같은 패키지는 객체 생성 가능! 클래스는 public과 default 제한자만 가능!
	
	void methodA() { // 메소드 생성
		dc.variableC = 20; // 해당 객체에 대해 DefaultC 클래스의 variableC 값 수정
	}
	
	

}
