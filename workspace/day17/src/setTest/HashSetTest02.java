package setTest;

import java.util.HashSet;

public class HashSetTest02 {
	public static void main(String[] args) {
		//HashSet 객체 생성
		HashSet<Student> set = new HashSet<>();
		
		System.out.println(set);
		System.out.println(set.toString()); // <- 여기에 toString 정의되어있음
		
		//Student 객체 생성
		Student st1 = new Student(1, "홍길동");
		
		set.add(st1);
		System.out.println(set);
	}

}
