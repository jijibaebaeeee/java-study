package objectTest;
//1번 : Object 클래스
public class User {
	//필드
	int userNumber;
	String userName;
	
	//생성자
	public User() {
		super();
	}

	//생성자 오버로딩
	public User(int userNumber, String userName) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
	}

	// 상속 안 받아도 되는건가용? -> extends 키워드 필요없는가
	//toString 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [userNumber = " + userNumber + ", userName = " + userName + "]";
	}



	//hashCode 오버라이딩
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.userNumber;
	}

	
	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		//자기자신과 비교하는 경우
		if(this == obj) {
			return true;
		}
		//null과 비교하는 경우
		if(this == null) {
			return false;
		}
		
		//유저번호가 일치하는지 비교하는 경우
		if(obj instanceof User) { // Object는 모든 객체가 들어올 수 있음. -> 들어온 객체가 User와 같은경우 
			User user = (User)obj; // 그 해당 객체를 User로 다운캐스팅. 한 것을 -> User 참조값이 가리키도록 한다.
			if(user.userNumber == this.userNumber) {
				//obj의 userNumber == 내가 호출할때 사용한 객체와의 번호가 같으면 ★★★
				return true; // return true!!!!!
			}
		}
		return false;
	}
	
	

}
