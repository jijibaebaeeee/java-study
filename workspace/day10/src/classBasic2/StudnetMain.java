package classBasic2;
// 3번 : 클래스의 특징1

public class StudnetMain {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "짱구";
		st1.age = 5;
		st1.gpa = 4.5;
		
		System.out.println("이름 : " + st1.name);
		System.out.println("나이 : " + st1.age);
		System.out.println("학점 : " + st1.gpa);
		
	}
}
