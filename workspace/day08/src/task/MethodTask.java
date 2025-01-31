package task;

import java.util.Scanner;

public class MethodTask {
	public static void main(String[] args) {
		
		MethodTask mt = new MethodTask();
		
		// 1번
		System.out.println(mt.changeSign(10));
		
		// 2번 -> 배지수배지수배지수배지수인지 확인해야함
		System.out.println(mt.printName("배지수", 7));
		
		// 3번 
		System.out.println(mt.changeNumber(10));
		
		// 4번
		int[] num = {100, 200, 30, -27, 24};
		System.out.println(mt.getAvg(num));
		
		// 5번
		mt.printMinMax(num);
		
		// 6번
		System.out.println(mt.changeCase("BaNanA"));
		
		// 7번
		int passwd = 0;
		String id = "";
		boolean check = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를 입력하세요: ");
		id += sc.next();
		sc.nextLine();
		
		System.out.println("비밀번호를 입력하세요: ");
		passwd = sc.nextInt();
		
		check = mt.login(id, passwd);
		
		if(check) {
			System.out.println("관리자님 환영합니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		
	}
    // 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
    // 매개변수o, 리턴값o
    // 메소드명 : changeSign
	// int changeSign(정수){
	// if문 사용
	// 0이면 0 리턴
	// 0이 아니면 부호 바꿔서 리턴
	
	// 로직구성
	// 리턴타입 -> int
	// 매개변수 -> int형
	// 메소드명
	// 그냥 바로 리턴
	
	int changeSign(int num) {
		return -num;
	}
	
//	int changeSign(int num) {
//		if(num == 0) {
//			return 0;
//		}else{
//			num = -num;
//		}
//		
//		return num;
//	}

    // 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
    // 매개변수 o, 리턴값 o (?)
    // 메소드명 : printName
	// 정수만큼 이름을 가로로 반복해서 추가
	// for문 사용하여 반복
	
	// 리턴타입 -> String
	// 매개변수 -> String, int
	// 메소드명
	// for반복문 사용하여 위에서 아래로
	
	String printName(String name, int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(name);
		}
		return "정수 : " + num + "이름: " + name;
	}
	
	
	
//	String printName(String name, int num) {
//		String myname = "";
//		
//		for(int i = 0; i < num; i++) {
//			myname += name;
//		}
//		return myname;
//	}

    // 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
    // 매개변수o, 리턴값o
    // 메소드명 : changeNumber
	// int changeNumber(정수형)
	// if문 이용
	// 10이하이면 1 리턴
	// 이외는 100리턴
	
	// 리턴타입 -> int
	// 매개변수 -> int
	// 메소드명 
	// 삼항연산자 이용
	
	int changeNumber(int num) {
		return (num <= 10) ? 1 : 100;
	}
	
	
//	int changeNumber(int num) {
//		if(num <= 10) {
//			return 1;
//		}else {
//			return 100;
//		}
//	}

    // 4. 5개의 정수중 평균을 반환하는 메소드
    // 매개변수o(배열), 리턴값o
    // 메소드명 getAvg
	// double getAvg(정수형 배열){
	// 평균 구할 실수형 변수 선언, 합구할 정수형 변수 선언
	// for문으로 누적 합계 구하기
	// 평균 구해서 리턴
	
	// 리턴타입 -> double
	// 매개변수 -> int[]
	// 총합을 구할 변수 선언
	// 배열의 크기로 나누어 리턴
	
	double getAvg(int[] num) {
		int total = 0;
		
		for(int data : num) {
			total += data;
		}
		return (double) total / num.length;
	}
	
	
//	double getAvg(int[] num) {
//		double avg = 0.0;
//		int sum = 0;
//		
//		for(int i = 0; i < num.length; i++) {
//			sum += num[i];
//		}
//		avg = sum / num.length;
//		
//		return avg;
//	}
	

    // 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
    // 매개변수o(배열),리턴값 x
    // 메소드명 printMinMax
	// void printMinMax(정수형 배열){
	// 무한대와 0을 구현하기 위해 double 형 사용
	// 각 배열의 요소가 max 보다 큰 경우
	// 각 배열의 요소가 min 보다 작은 경우 
	// max와 min 값을 갱신한다.
	// 반복이 끝나면 출력이 되게하기
	
	// 로직구성
	// 리턴타입 -> void
	// 매개변수 -> int[]
	// 메소드명 
	// 최댓값, 최솟값 변수 선언
	// 배열의 첫번째 값에 할당
	// 최댓값 구하는 for 1번
	// 최솟값 구하는 for 1번
	
	void printMinMax(int[] num){
		int max = 0, min = 0;
		
		max = num[0];
		min = num[0];
		
		for(int i = 1; i < num.length; i++) {
			max = max < num[i] ? num[i] : max;
			min = min > num[i] ? num[i] : min;
		}
		System.out.println("최댓값 : " + max + " 최솟값 : " + min);
		
	}

	
//	void printMinMax(int[] num) {
//		double max = -1.0e100, min = 1.0e100;
//		
//		for(int i = 0; i < num.length; i++) {
//			if(num[i] > max) {
//				max = num[i];
//			}
//			
//			if(num[i] < min) {
//				min = num[i];
//			}
//		}
//		
//		System.out.printf("최댓값 : %.0f , 최솟값 : %.0f\n", max, min);
//	}
	
	
    // 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
    // BaNanA -> bAnANa
    // 메소드명 : changeCase
    // 매개변수와 리턴값 자유 => 단, 형변환 이용할 것
	// 로직구성
	// void changeCase(문자열){
	// for문을 이용
	// charAt(i)를 이용하여 하나씩 문자 추출
	// if 문을 이용해서 추출한 문자의 유니코드 정수가 97미만인지 확인
	// 미만이면 +32 하여 소문자로 바꿔주고
	// 이상이면 -32 하여 대문자로 바꿔주자
	// A 65, a 97
	
	
	/* 로직구성
	 * 리턴타입 String
	 * 매개변수 String
	 * 출력을 위한 String result 선언
	 * 문자열의 길이만큼 for문을 돌면서 단어 하나씩 뽑아서 유니코드 확인
	 * 
	 * A -> 65 , a -> 97
	 * */
	
	String changeCase(String line) {
		String result = "";
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) >= 97) {
				System.out.println(line.charAt(i));
				result += (char)(line.charAt(i) - 32);
			}else if(line.charAt(i) >= 65) {
				result += (char)(line.charAt(i) + 32);
			}
		}
		return result;
	}
	
	
//	void changeCase(String line) {
//		String result = "";
//		for(int i = 0; i < line.length(); i++) {
//			if(line.charAt(i) < 97) {
//				result += (char)((int)line.charAt(i) + 32);
//			}else {
//				result += (char)((int)line.charAt(i) - 32);
//			}
//		}
//		
//		System.out.println(result);
//	}
	

    // 7. 아이디와 비밀번호를 입력받아 로그인하기
    // 매개변수 o, 리턴값 o(boolean 타입)
    // 메소드명 : login
    // main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
    // 둘 중 하나라도 틀리면 잘못입력했습니다 출력
	
	// 로직 구성
	// boolean login(문자열, 정수){
	// if문과 논리연산 이용해서 id와 비밀번호 비교
	// 모두 일치하는 경우에만 true 출력
	// 불일치시 false 출력
	// main
	
	/* 로직구성
	 * 리턴타입 -> boolean
	 * 매개변수 : String, int
	 * 메소드명 : login
	 * String id = "admin";
	 * num = 1234;
	 * if 문으로 들어오는 것의 값을 비교하기 
	 *
	 * */
	
	boolean login(String id, int passwd) {
		String ID = "admin";
		int num = 1234;
		
		if(ID.equals(id) && num == passwd) {
			return true;
		}else
			return false;
	}
}
	
	
	
	
	
	
//	boolean login(String id, int num) {
//		boolean check = false;
//		
//		if(id.equals("admin") && (num == 1234) ) {
//			return true;
//		}else {
//			return check;
//		}
//	}
//}
