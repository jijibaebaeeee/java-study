package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LottoList {
	public static void main(String[] args) {
		// ArrayList, HashSet을 사용하여 중복을 허용하지 않은 6개의 랜덤숫자를 저장
		// Random 클래스를 이용하여 1부터 45사이의 랜덤 숫자를 생성하고, 
		// 정렬해서 출력
		
		
		// 로직구성
		// Math 클래스 임포트 .random 메소드 사용을 위해
		// random과 while 반복문을 사용해서 1~45까지 랜덤한 숫자를 set에 저장  add()로 해야할듯
		// while 조건 cnt로 할 것이고 새로운 수가 들어갈 때 이미 있는 것에서 포함이 되어있는지 아닌지(contains())를 확인해서 true false로 반환해야함
		// 중복이 아닌 수가 들어가면 cnt++ 해서 반복수를 정함
		// 오름차순을 위해 ArrayList 선언 + 기존의 HashSet 넘겨주기
		// 정렬 후 출력
		
		
		Set<Integer> lotto = new HashSet<>(); // 중복이 없는 숫자를 받을 HashSet
		
		int cnt = 1; // 초기반복값
		
		while(cnt <= 6) { // 6개가 들어갈 때 까지
			int num = ((int)(Math.random() * 45) + 1); //1~45까지 수 정의
			if(!(lotto.contains(num))) { // 중복이 아니면
				lotto.add(num); // add
				cnt++; // 중복없이 들어가면 1증가
			}else { // 중복이면
				continue; // 다시 뽑기
			}	
		}
		
		ArrayList<Integer> arrayLotto = new ArrayList<>(lotto); // 정렬을 위한 Array 생성 + 생성자에 Collections 타입으로 업캐스킹하여 HashSet 전달
        
        Collections.sort(arrayLotto); // 오름차순으로 정렬
        System.out.println(arrayLotto); // 출력
		
		
		
		
		
	}

}
