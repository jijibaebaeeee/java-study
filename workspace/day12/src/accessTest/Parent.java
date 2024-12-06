package accessTest;

public class Parent {
	//필드
	//접근제한자 타입 변수
	public String publicValue = "public";
	protected String protectedValue = "protected";
	String defaultValue = "default";
	private String privateValue = "private";
	
	//메소드
	//접근제한자 리턴타입 메소드명(매개변수){}
	public void printAccess() {
		System.out.println("===========같은 클래스 내에서 필드 출력==========");
		System.out.println(publicValue);
		System.out.println(protectedValue);
		System.out.println(defaultValue);
		System.out.println(privateValue);
	}
	
	
	public static void main(String[] args) {
		Parent p = new Parent();   // 클래스 배우기 전에 했던 메소드 호출하기 위해서 객체를 생성해야 하는 것임
		p.printAccess();
	}
	
}


class SamePackage{
	public void printAccess() {
		Parent p = new Parent();
		System.out.println(p.publicValue);
		System.out.println(p.protectedValue);
		System.out.println(p.defaultValue);
//		System.out.println(p.privateValue); //다른 클래스에서 private의 필드 접근 불가
	}
}