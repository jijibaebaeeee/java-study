package chapter10;
// 예제 10-16 접근제한자 protected
public class Parent { // public 접근제한자 클래스 선언
	protected void accessProtected() { // protected 접근 제한자의 메서드 선언 -> 상속받은 경우가 아니면 다른 클래스에서 사용 불가
		System.out.println("Protected 멤버에 접근하였습니다."); // 출력
	}

}
