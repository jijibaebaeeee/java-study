package chapter7;

// 예제 7-12 -> 정적 멤버
public class Student { // 클래스 선언
	static String schoolName = "코리아 고등학교"; // 정적 멤버 선언
	String studentName;
	
	static void goToSchool() { // 정적 메서드 선언
		System.out.println("학교에 갑니다"); // 호출시 출력
	}
	
	// 예제 7-14 인스턴스
	void hello() { // 인스턴스 메서드 선언
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다"); // 출력문호출
	}

}
