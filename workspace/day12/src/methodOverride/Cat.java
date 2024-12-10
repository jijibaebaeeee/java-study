package methodOverride;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	void sound() {
		System.out.println(this.name +"가 야옹하고 웁니다.");
	}
	
	

}
