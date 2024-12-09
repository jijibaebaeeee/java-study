package ex01;

public class Main_t {
	public static void main(String[] args) {
		Student st1 = new Student("짱구", 80, 90);
	    Student st2 = new Student("철수", 99, 75);

	    System.out.println(st1);
	    System.out.println(st2);

	    System.out.println(st1.totalScore);
	    System.out.println(st2.totalScore);
	    System.out.println(st1.isPass((st1.javaScore + st1.dbmsScore) / 2) ? "Pass" : "Fail"); // 메소드와 삼항연산자

	}

}
