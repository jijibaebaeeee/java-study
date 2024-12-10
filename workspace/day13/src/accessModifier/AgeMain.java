package accessModifier;

public class AgeMain {
	public static void main(String[] args) {
		Age age1 = new Age();

		age1.setAge(-40);
		age1.setAge(40);
		
		System.out.println(age1.getAge());
	}

}
