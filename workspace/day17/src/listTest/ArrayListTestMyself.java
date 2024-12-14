package listTest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTestMyself {
	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<>(); // Generic으로 Integer를 설정하여 정수만 저장가능
//		list.add(1); // int 1 -> (Integer)1로 AutoBoxing 되어서 ArrayList에 저장된다.
//		list.add(5); // Wrapper 클래스 확인
//		System.out.println(list);
////		list.remove(0);
////		list.add(50);
////		list.remove(Integer.valueOf(50));
////		list.remove(50);
//		list.add(5);
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.contains(5));
//		System.out.println(list.contains(40));
//		System.out.println(list.isEmpty());
//		ArrayList<Integer> list2 = new ArrayList<>();
//		System.out.println(list2.isEmpty()); 
////		System.out.println(list.get(1));
//		
////		System.out.println(list.set(1, Integer.valueOf(50)));
////		System.out.println(list.get(1));
////		System.out.println(list.get(1)); // 10
//		
//		System.out.println(list.indexOf(5));
//		list.add(1); // 객체 1을 하나 더 추가
//		System.out.println(list.lastIndexOf(1));
//		list.clear();
//		System.out.println(list);
//		
		
		ArrayList<Double> list = new ArrayList<>();	
		for(int i = 0; i < 10; i++) {
			list.add(i * 0.1);
		}
		
		Iterator<Double> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println("Next==>" + iter.next());
		}
		
		
	}
}
