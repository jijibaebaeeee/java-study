package InheritanceConstructor;
//9번 : 상속관계-생성자 확인
//자식클래스(서브클래스)
public class Child extends Parents{
	//필드
	int num; 
	
	//생성자
	public Child() { //기본 생성자
		super(); // 부모의 생성자를 호출하는 것임
		System.out.println("Child 생성자 호출");
	}
	
	//메소드
	void printInt(int num) { // child의 num을 사용하여 메소드 호출
		System.out.println(this.num);
	}
}
