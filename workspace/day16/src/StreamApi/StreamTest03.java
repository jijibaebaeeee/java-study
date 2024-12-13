package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest03 {
	public static void main(String[] args) {

		String[] names = { "Abc", "Def", "GhIj", "kLm" };

		// 스트림을 사용하여 대문자로 변환

		String[] upperName = Arrays.stream(names).map(String::toUpperCase).toArray(String[]::new);
//							  배열을 스트림으로 바꾸고      문자를 대문자로 바꾸고           배열에 저장
		
		System.out.println(upperName);
		
		Arrays.stream(upperName).forEach(System.out::println); // 스트림 출력은 이렇게 함, 최종연산이기에 뒤로 중간연산 불가
		
		//스트림을 사용하여 리스트로 전환
		List<String> upper2 = Arrays.stream(names).map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(upper2);
		
//		// for문 사용
//		for (int i = 0; i < names.length; i++) {
//			names[i] = names[i].toUpperCase();
//		}
//		System.out.println(Arrays.toString(names));
	}
}