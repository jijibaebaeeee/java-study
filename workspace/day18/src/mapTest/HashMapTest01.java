package mapTest;
//1번 : hashMap

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest01 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println(map);
		System.out.println(map.toString());
		
		map.put("A", 1);
		System.out.println(map);
		
		HashMap<Map,Map> m = new HashMap<>();
		m.put(m, m);
		System.out.println(m);
		
		HashMap<Object, Object> mm = new HashMap<>();
		mm.put(mm,  mm);
//		mm.put(mm,  "Value2"); // 자기 참조 추가 => 무한 재귀 발생
		System.out.println(mm);	// HashMap이 자기 자신을 값이나 키로만 포함시키는 경우,
								// HashCode() : 키와 값의 해시코드를 계산하는 과정에서 자기자신을 다시 호출 -> 무한 재귀
								// toString() : HashMap의 모든 키-값 쌍을 문장려로 변환하는 과정에서 자기 자신을 참조 -> 무한 재귀
								// System.out.println(mm); 무한 재귀 StackOverflowError
		
		ArrayList<List> li = new ArrayList<>();
		
		
	}

}
