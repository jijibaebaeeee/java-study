package listTest;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		//ArrayList 객체 생성
		ArrayList al = new ArrayList();
		System.out.println(al); // [] 이므로 어? 객체의 주소값이 아니네? -> 오버라이딩 된것.
		
		al.add(al); // 객체 자기자신을 넣으면 (this Collection)이 나온다
		al.add(1); // wrapper 클래스(Integer)로 자동 박싱되어서 저장
		System.out.println(al);		
		al.add(2);
		al.add(0.5); // wrapper 클래스(Double)로 자동 박싱되어서 저장 Object 클래스로 전달되어야하기때문 !!! + 업캐스팅까지!@#
		System.out.println(al);
		al.add(1);
		System.out.println(al);
		
		//ArrayList의 크기를 반복하면서 요소 출력
		for(int i = 0; i < al.size(); i++) {
			System.out.println(i + " : " + al.get(i));
		}
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			al2.add((10-i) * 10);
		}
		System.out.println(al2);
		
		for(int data : al2) { // al2가 data로 언박싱!
			System.out.println(data);
		}
		
		
		
		
		
	}

}
