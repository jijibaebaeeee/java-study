package study4;

public class UserDTO {
//	UserDTO 클래스
//	 필드 private 아이디, 비밀번호, 이름, 나이
//	 생성자를 통해서만 초기화 – 단 회원의 리스트만 초기화한다
//	 toString() 재정의하여 모든 필드의 값을 확인할 수 있도록 한다
//	 모든 필드의 getter 메소드를 만든다
	
	//필드
	private String id;
	private String passwd;
	private String name;
	private int age;
	
	//생성자
	public UserDTO(String id, String passwd, String name, int age) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
	}
	
	//재정의
	@Override
	public String toString() {
		return "아이디 : " + this.id + ", 패스워드 : " + this.passwd + ", 이름 : " + this.name + ", 나이 : " + this.age;
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj)
//		return true;
//	}

	//getter
	public String getId() {
		return this.id;
	}
	
	public String getPasswd() {
		return this.passwd;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	

}
