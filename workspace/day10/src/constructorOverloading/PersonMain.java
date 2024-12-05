package constructorOverloading;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("배지수");
		System.out.println(p1.age);
		
		Person p4 = new Person("이름", 10, "학생");
		System.out.println(p4.name + "의 나이는 " + p4.age + "살이고,"
				+ "직업은" + p4.job + "입니다.");
		
		
	}
}
