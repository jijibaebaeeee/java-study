package task;

public class MethodTask {
	public static void main(String[] args) {
		
		MethodTask mt = new MethodTask();
		
		// 1번
		System.out.println(mt.changeSign(10));
		
		// 2번 -> 배지수배지수배지수배지수인지 확인해야함
//		printName("배지수");
		
		// 3번 
		System.out.println(mt.changeNumber(10));
		
		// 4번
		int[] num = {100, 200, 30, -27, 24};
		System.out.println(mt.getAvg(num));
		
		// 5번
		mt.printMinMax(num);
		
		// 6번
		mt.changeCase("BaNanA");
		
	}
    // 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
    // 매개변수o, 리턴값o
    // 메소드명 : changeSign
	// int changeSign(정수){
	// if문 사용
	// 0이면 0 리턴
	// 0이 아니면 부호 바꿔서 리턴
	
	int changeSign(int num) {
		if(num == 0) {
			return 0;
		}else{
			num = -num;
		}
		
		return num;
	}

    // 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
    // 매개변수 o, 리턴값 o (?)
    // 메소드명 : printName
	
	void printName(String name, int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(name);
		}
	}

    // 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
    // 매개변수o, 리턴값o
    // 메소드명 : changeNumber
	// int changeNumber(정수형)
	// if문 이용
	// 10이하이면 1 리턴
	// 이외는 100리턴
	
	int changeNumber(int num) {
		if(num <= 10) {
			return 1;
		}else {
			return 100;
		}
	}

    // 4. 5개의 정수중 평균을 반환하는 메소드
    // 매개변수o(배열), 리턴값o
    // 메소드명 getAvg
	// double getAvg(정수형 배열){
	// 평균 구할 실수형 변수 선언, 합구할 정수형 변수 선언
	// for문으로 누적 합계 구하기
	// 평균 구해서 리턴
	
	double getAvg(int[] num) {
		double avg = 0.0;
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		avg = sum / num.length;
		
		return avg;
	}
	

    // 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
    // 매개변수o(배열),리턴값 x
    // 메소드명 printMinMax
	// void printMinMax(정수형 배열){
	// 
	
	void printMinMax(int[] num) {
		double max = -1.0e100, min = 1.0e100;
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
			
			if(num[i] < min) {
				min = num[i];
			}
		}
		
		System.out.printf("최댓값 : %.0f , 최솟값 : %.0f\n", max, min);
	}
	
	
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
	
	void changeCase(String line) {
		String result = "";
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) < 97) {
				result += (char)((int)line.charAt(i) + 32);
			}else {
				result += (char)((int)line.charAt(i) - 32);
			}
		}
		
		System.out.println(result);
	}
	

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
	boolean login(String id, int num) {
		boolean check = false;
		
		return check;
	}
	

	
	
	
	
	
	
}
