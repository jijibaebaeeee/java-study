package InheritanceConstructor;
//9번 : 상속관계-생성자 확인
// 부모클래스(슈퍼클래스)
public class Parents {
	//필드
	int number; // 필드 선언

	//생성자
	public Parents() { // 기본 생성자 생성
		System.out.println("Parents 생성자 호출");	//출력문
	}
	
	//메소드
	void printStr(String str) { // 메소드 선언 : 디폴트이므로 같은 패키지는 사용가능
 		System.out.println(str); 
	}
	
	

}
