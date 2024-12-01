package homework;

import java.util.Scanner;

public class Chapter4 {
	public static void main(String[] args) {
		
		// 예제 4-1 -> if 문
//		int result = 0; // 정수형 변수 선언
//		
//		if(3 > 2) { // if 문 시작 조건식 -> true
//			result = 3; // result값 3으로 변경
//		} // if 문 끝
//		System.out.println(result); // 3 출력
//		
//		// 예제 4-2 -> if문 2
//		Scanner sc = new Scanner(System.in); // 참조변수 선언하고, new를 이용하여 Scanner를 생성하고 참조값을 가져온다
//		System.out.println("나이를 입력하세요: "); // 출력 메시지
//		
//		int age = sc.nextInt(); // 정수형 변수를 선언하고 동시에 사용자로부터 정수 값을 입력받아 저장한다.
//		if(age > 19) { // if 문 시작 age 값이 19부다 크면
//			System.out.println("성인입니다."); // 성인입니다 출력
//		}
//		System.out.println("프로그램을 종료합니다"); // 출력
		
		// 예제 4-3 -> if-else문 1
		int num = 5; // 정수형 변수 선언 및 초기화
		
		if(num > 4) { // if 문 시작
			System.out.println(num + "은 4보다 큽니다"); // 4보다 큰 경우 출력
		}else { // else 문 시작
			System.out.println(num + "은 4보다 작습니다."); // 4이하인 경우 출력
		} // else 문 끝
		
		// 예제 4-4 -> if-else문 2
		int a = 4; // 정수형 변수 선언 및 초기화
		int b = 10; // 정수형 변수 선언 및 초기화
		
		if(a > b) { // if 문 시작 a가 b보다 크다면
			System.out.println("a가 b보다 큽니다"); // true 인 경우
		}else { // else 문 시작
			System.out.println("a가 b보다 작거나 같습니다"); // false 인 경우
		}
		
		// 예제 4-5 -> if-else문 활용
		int a1 = 4; // 정수형 변수 선언 및 초기화
		int b1 = 10; // 정수형 변수 선언 및 초기화
		int max = 0; // 정수형 변수 선언 및 초기화
		
		if(a > b) { // if문 시작 a가 b보다 큰 경우
			max = a1; // true 인 경우
		}else { // else문 시작
			max = b1; // false 인 경우
		}
		System.out.println(a1 + "와 " + b1 + " 중에 큰 수는 " + max + "입니다"); // 출력
		
		// 예제 4-6 -> if-else문 활용2
//		Scanner sc = new Scanner(System.in); // 참조변수 선언하고 new를 이용하여 Scanner의 참조갑을 가져와 참조변수가 지정할 수 있또록 한다
//		System.out.println("나이를 입력하세요: "); // 출력 메시지
//		
//		int age = sc.nextInt(); // 정수형 변수 선언 및 입력메소드를 이용해 입력값 받고 저장
//		
//		if(age > 19) { // if 문 시작 age가 19보다 크다면
//			System.out.println("성인입니다."); // true 인 경우
//		}else { // else 문 시작
//			System.out.println("미성년자입니다"); // false 인 경우
//		} // else문 끝
		
		// 예제 4-7 -> if-else문 1
		int favorite  = 7; // 정수형 변수 선언 및 초기화
		
		if(favorite < 5) { //if문 시작 favorite 이 5보다 작으면
			System.out.println("좋아하는 숫자가 5보다 작습니다."); // true 인 경우
		}else if(favorite > 5){ // if문 조건 false + else if 문 시작 favoirte 5보다 크면 
			System.out.println("좋아하는 숫자가 5보다 큽니다"); // true 인 경우
		}else { // else if 조건 false인 경우
			System.out.println("좋아하느 숫자가 5입니다."); // 출력
		}
		
		// 예제 4-8 -> if-else문 2
		int favoritee = 7;
		
		if(favoritee > 5) { // if 문 시작 favoritee 가 5보다 크다면
			System.out.println("좋아하는 숫자가 5보다 큽니다."); // true 인 경우
		}else if(favoritee == 7) { // else if 문 시작 favoritee 가 7이면
			System.out.println("좋아하느 ㄴ숫자는 7입니다."); // true 인 경우
		}
		
		// 예제 4-9 -> if-else문 3
//		Scanner sc = new Scanner(System.in); // sc라는 참조변수 선언하고 new를 이용하여 Scanner 생성 후 참조값을 받아서 참조변수가 가리키도록 함
//		System.out.println("나이를 입력하세요: "); // 출력 메시지
//		int age = sc.nextInt(); // 정수형 변수 선언 및 사용자로 부터 정수 값 받고 값 저장
//		if(age > 19) { // if 문 시작 + 관계연산자를 이용해서 19보다 큰 경우
//			System.out.println("성인입니다."); // true 인 경우
//		}else if(age > 13){ // else if 시작 19이하이고 13보다 큰 경우
//			System.out.println("청소년입니다"); // true 인 경우
//		}else if(age > 6) {// else if 시작 13이하이고 6보다 큰 경우
//			System.out.println("어린이이니다"); // true 인 경우
//		}else {// 나머지 경우
//			System.out.println("유아입니다."); // 출력
//		}
		
		// 예제 4-10 switch문
		int numm = 7; // 정수형 변수 선언 및 초기화
		
		switch(numm) { // switch문 시작 
			case 1: // numm == 1인 경우
				System.out.println("num은 1입니다."); // 출력
				break; // switch 문에서 탈출
			case 7: // numm == 7 인 경우
				System.out.println("num은 7입니다"); // 출력
				break; // switch 문에서 탈출
			default : // 나머지의 경우 
				System.out.println("num은 1도 7도 아닙니다"); // 출력
		} // switch문 끝
		
		// 예제 4-11 switch문2 (break제외)
		int numn = 7; // 정수형 변수 선언 및 초기화
		
		switch(numn) { // switch문 시작
		case 1: // numn == 1인 경우
			System.out.println("num은 1입니다"); // 출력
		case 7: // numn == 7인 경우
			System.out.println("num은 7입니다"); // 출력
		default : // 나머지의 경우
			System.out.println("num은 1도 7도 아닙니다"); // 출력
		} //switch문 끝. 위의 switch문은 break가 없어서 default는 항상 출력된다
		
		// 예제 4-12 switch문3 (break사용)
		Scanner sc = new Scanner(System.in); // sc라는 참조변수 선언 후 new를 이용하여 스캐너의 참조값을 받아온다
		System.out.println("원하는 숫자를 입력하세요. (1~5)"); // 출력 메시지
		
		int numl = sc.nextInt(); // 정수형 변수 선언 후 입력 메소드를 활용하여 사용자로부터 정수형 값을 받아온다
		switch(numl) { // switch문 시작 
		case 5: // 5인경우
			System.out.println("5를 입력하였습니다."); //출력
			break; //switch문 탈출
		case 4: // 4인경우
			System.out.println("4를 입력하였습니다."); //출력
			break; //switch문 탈출
		case 3: // 3인경우
			System.out.println("3을 입력하였습니다."); //출력
			break; //switch문 탈출
		case 2: // 2인경우
			System.out.println("2를 입력하였습니다."); //출력
			break; //switch문 탈출
		case 1: // 1인경우
			System.out.println("1을 입력하였습니다"); //출력
			break; //switch문 탈출
		default : // 나머지 경우
			System.out.println("1~5까지의 숫자를 입력하세요"); //출력
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
