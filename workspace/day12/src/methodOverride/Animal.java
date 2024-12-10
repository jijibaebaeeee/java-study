package methodOverride;

public class Animal {
	//필드
	String name;
	int age;
	
	//메소드
	void sound() {
		System.out.println("동물이 소리를 냅니다");
	}

	
	//생성자
	public Animal(String name) { //부모가 매개변수를 가지는 생성자가 있으니. 자식은 다 가진다
		super();
		this.name = name;
	}
	

}
