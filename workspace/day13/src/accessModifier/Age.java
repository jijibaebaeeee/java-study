package accessModifier;

public class Age {
	private int age;
	
	void setAge(int num) {
		if(num < 0) {
			System.out.println("나이를 잘못 입력했습니다.");
			return;
		}else {
			this.age = num;
		}
	}
	
	int getAge() {
		return this.age;
	}

}
