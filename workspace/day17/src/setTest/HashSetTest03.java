package setTest;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTest03 {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(20);
		li.add(20);
		li.add(30);
		li.add(30);
		li.add(40);
		li.add(40);
		System.out.println(li);
		System.out.println(li.size());
		
		HashSet<Integer> set = new HashSet<>(li); // <- 생성자의 타입이 Collection임. List와 Set은 Collection 인터페이스를 상속받음.
												  //	생성자의 정의를 보면 Collection의 객체면 모두 생성이 바로 되는 것을 아니까 인수로 
												  //	List 전달하여 중복삭제
		System.out.println(set);
		ArrayList<Integer> result = new ArrayList<>(set);
		System.out.println(result);
		
		
		
	}

}
