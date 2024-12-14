package chapter13;
//예제 13-4 내부 클래스의 접근 제한
public class PermitExample { // 메인 클래스
	private class InClass{ // private 접근제한자로 클래스 선언이 가능? 같은 클래스에서만 접근 가능
		public void print() { // 메소드 선언
			System.out.println("접근을 private로 제한합니다."); // 출력문
		}
	}
	
	public InClass getInClass() { // 리턴타입이 InClass인 getInClass 메소드 선언
		return new InClass(); // 객체의 참조값을 리턴한다.
	}
	
	public static void main(String[] args) {
		PermitExample permit = new PermitExample(); // PermitExample 객체 생성
//		InClass in = permit.getInClass();
		permit.getInClass().print(); // 메소드 체이닝을 여기서. . .
	}
	
}
