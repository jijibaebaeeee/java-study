package test01;

public class UserVO_review {
//	로직구성
//	필드의 각 이름을 private로 선언한다. -> 같은 클래스 내부에서는 이 필드에 접근이 가능하다. 외부에서 이 값에 접근하기 위해서는 getter를 사용해야함.
//	매개변수를 모두 가지는 생성자를 생성한다. -> this 키워드를 이용해서 필드 초기화
//	toString()을 오버라이딩한다. -> Object 클래스의 메소드라는 것을 잊지말고, Alt + Shift + S + V를 이용해서 오버라이딩하자.
//	  리턴타입 String()	   선언부는 동일해야하기 때문에 String toString() 임을 인지하자...
//	  매개변수 X
//	  구현부 -> " " + this를 이용해서 하나씩 모두 출력하기.
//
//	Object 클래스의 equals()를 오버라이딩한다.
//	  리턴타입 boolean
//	  매개변수 객체?or 객체의 id? ★
//	  구현부 -> if this.id와 객체.id가 같으면 return false;
//		  다르면 true
//
//	equals()를 오버라이딩 했기 때문에 hashCode() 도 오버라이딩해주어야한다.
//	hashCode()의 어느부분을 오버라이딩할 것인가?
//	    return 유저번호..?
	
	//필드 선언
	private int num;
	private String id;
	private String passwd;
	private String name;
	private int age;
	
	
	//생성자 생성
	public UserVO_review(int num, String id, String passwd, String name, int age) {
//		super();
		this.num = num;
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
	}
	
	
	public String getId() {
		return id;
	}
	
	public String getPasswd() {
		return passwd;
	}

	//toString() 오버라이딩
	@Override
	public String toString() {
		return "회원번호 : " + this.num + ", ID : " + this.id + ", 비밀번호 : " + this.passwd + ", 이름 :  " + this.name + ", 나이 : " + this.age;	
	}
	
	
	//equals() 오버라이딩 ★★★ 이해 돼따
	@Override
	public boolean equals(Object obj) {
//		if(this.num == obj.num) {  // 1차적 오류범행. . . . 왜 안되는거임?..
//			return true;
//		}else
//			return false;
		if(this == obj) {
			return true;
		}
		if(obj == null || !(obj instanceof UserVO)) {
			return false;
		}
		UserVO_review userVO = (UserVO_review) obj; // 자신의 클래스 객체 생성해서 다운캐스팅.. 왜냐? Object는 모두의 부모 클래스이고 난 이 클래스에서의 num을 쓰고 싶으니까 ㅁㅊ
		return num == userVO.num;
	}
		
	
//	}
	
	//hashCode() 오버라이딩 -> 언제 쓰이는데 이거
	@Override
	public int hashCode() {
		return this.num;
	}
	

}
