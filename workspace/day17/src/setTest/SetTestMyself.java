package setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTestMyself {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		//값 add		
		for(int i = 0; i < 10; i++) {
				set.add(i * 10);
		}
		//Iterator 생성 Generic 같게 해야함
		Iterator<Integer> iter1 = set.iterator(); 


		while(iter1.hasNext()) {
				System.out.println("Next==>" + iter1.next()); 
		}

		while(iter1.hasNext()){ // 1.
				System.out.println("Next==>" + iter1.next());
		}
	}

}
