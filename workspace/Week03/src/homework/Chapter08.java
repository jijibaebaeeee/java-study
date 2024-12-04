package homework;

public class Chapter08 {
	public static void main(String[] args) { // 메인 메소드의 시작 영역
		printHello(); // 메서드 호출
		
		// 예제 8-3 다른 클래스에 있는 메서드 호출하기 (같은 클래스에 있는 run 호출)
		Chapter08 cp = new Chapter08(); // 객체생성
		cp.run(); // 메서드 호출
		
		// 예제 8-5 2개 이상의 메서드 선언하기
		String name = ""; // 문자열형 변수 선언
		name = "배지수"; // 값 대입
		cp.sayName(name); // 메소드 호출 + 인수전달
		cp.run(); // 호출
		
		// 예제 8-7 매개변수가 있는 메서드 호출
		cp.count(3); // 메소드 호출
		
		// 예제 8-9 매개변수가 2개 이상인 메서드 호출
		cp.sum(5, 3); // 메서드 호출
		cp.sum(10, 7); // 메서드 호출
		
		// 예제 8-11 다른 자료형 2개를 매개변수로 받는 메서드 호출
		cp.introduce("홍길동", 20); // 메서드 호출
		cp.hello(); // 메서드 호출
		
		// 예제 8-13 매개변수를 배열로 받는 메서드 호출
		int nums[] = {100, 200}; // 배열 정의
		cp.sum(nums); // 메서드 호출 + 배열의 시작주소를 인수로 넘긴다.
		
		// 예제 8-15 result를 반환하는 메서드 호출
		int nums1[] = {500, 200}; // 배열 정의
		System.out.println("숫자들의 합은" + cp.sum1(nums1) + "입니다."); // 메서드 호출 + 배열의 시작주소를 인수로 넘긴다 + return으로 받은 값을 바로 출력
		
		// 예제 8-17 리턴한 값을 변수에 저장하는 메서드 호출
		int[] studnetA = {97, 53}; // 정수형 배열 선언
		int[] studentB = {95, 66}; // 정수형 배열 선언
		
		int sumA = cp.score(studnetA); // 정수형 변수를 선언하고 함수를 호출하여 함수의 리턴값을 변수에 저장
		int sumB = cp.score(studentB); // 정수형 변수를 선언하고 함수를 호출하여 함수의 리턴값을 변수에 저장
		
		if(sumA < sumB) { // if문 시작 
			System.out.println("A학생의 중간고사 총점이 더 높습니다");
		}else if(sumA > sumB) { // if문 끝 else if문시작
			System.out.println("B학생의 중간고사 총점이 더 높습니다");
		}else { // else if 문 끝 else문 시작
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}
		
		// 예제 8-19 return으로 메서드 빠져나가기
		int money = 10000; // 정수형 변수 선언 및 초기화
		
		cp.take(money); // 메서드 호출 + 인수 전달
		
		
	} // 메인 메소드의 끝 영역
	
	// 예제 8-1 메서드 선언 및 호출
	static void printHello() { // static 키워드를 사용하여 리턴값이 없는 메서드 정의 < - 선언부
		
		System.out.println("안녕하세요"); // 실행문1 <-구현부
		System.out.println("만나서 반갑습니다."); // 실행문2
	}
	
	// 예제 8-2 다른 클래스에 있는 메서드 호출하기
	void run() { // 리턴값이 없는 메서드 정의
		System.out.println("run run run!"); // 실행문
	}
	
	// 예제 8-4 2개 이상의 메서드 선언하기
	void sayName(String name){ // 리턴값이 없는 메서드 
		System.out.println("제 이름은 " + name + "입니다."); // 실행문
	}
	
	// 예제 8-6 매개변수가 있는 메서드 정의
	void count(int bookNum) { // 리턴값이 없는 메서드 선언 + 매개변수
		System.out.println("책은 " + bookNum + "권 입니다."); // 실행문
	}
	
	// 예제 8-8 매개변수가 2개 이상인 메서드 정의
	void sum(int num1, int num2) { // 리턴값이 없는 메서드 선언 + 매개변수 2개
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다."); // 실행문
	}
	
	// 예제 8-10 다른 자료형 2개를 매개변수로 받는 메서드 정의
	void introduce(String name, int age) { //리턴값이 없는 메서드 선언 + 매개변수 2개
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세입니다.");// 실행문
	}
	
	void hello() { // 리턴값이 없는 메서드 선언
		System.out.println("안녕하세요."); // 실행문
	}
	
	// 예제 8-12 매개변수를 배열로 받는 메서드 정의
	void sum(int[] nums) { // 리턴값이 없는 메서드 선언
		int result = 0; // 정수형 배열 선언
		for(int i = 0; i < nums.length; i++) { // for문을 사용하여 배열의 길이만큼 반복
			result += nums[i]; // 누적합 구하기
		} // for문 끝
		System.out.println("숫자들의 합은 " + result + "입니다."); // 출력
	}
	
	// 예제 8-14 result를 반환하는 메서드 정의
	int sum1(int[] nums) { // 리턴값이 int형인 메서드 선언
		int result = 0; // 정수형 변수 선언
		for(int i = 0; i < nums.length; i++ ) { // for문을 사용하여 배열의 길이만큼 반복
			result += nums[i]; // 누적합 구하기
		} // for문 끝
		return result; // 정수형 변수를 리턴한다
	}
	
	// 예제 8-16 리턴한 값을 변수에 저장하는 메서드 정의
	int score(int[] scores) { // 리턴값이 int형인 메서드 선언
		int result = 0; // 정수형 변수 선언
		for(int i = 0; i < scores.length; i++) { //for문을 사용하여 배열의 길이만큼 반복
			result += scores[i]; // 누적합 구하기
		} // for문 끝
		return result; // 정수형 변수를 리턴한다
	}
	
    // 예제 8-18 return으로 메서드 빠져나가기
	
	void take(int m) { // 리턴값이 없는 메서드 선언
		while(true) { // 무한루프 while문 선언
			if(m < 3000) { // if 문 시작
				System.out.println("교통카드를 충전하러 갑니다."); //출력문
				return; // 함수를 빠져나가기 위해 return 사용
			}// if 문 끝
			System.out.println("버스를 탑니다.");//출력문
			m -= 1250; // 복합대입연산자 사용
		}
	}
	

	
	
}
