package homework;

import java.util.Scanner;
public class Chapter2 {
	public static void main(String[] args) {
		// Chapter1. Hello JAVA!! 문장 출력하기
		System.out.println("Hello JAVA!!!"); // System 클래스의 out.println 메소드를 이용하여 콘솔창에 "Hello JAVA!!!"를 출력하고 줄바꿈
		
		// Chapter2. 예제 2-1
		System.out.print("Welcome. "); // System 클래스의 out.println 메소드를 이용하여 콘솔창에 "Welcome."을 출력하고 줄바꾸지 않음
		System.out.print("JAVA World"); // System 클래스의 out.println 메소드를 이용하여 콘솔창에 "JAVA World."을 출력하고 줄바꾸지 않음
		
		// 예제 2-2
		System.out.println("Welcome. "); // 위의 예제에서 줄바꿈을 추가
		System.out.println("JAVA World"); // 동일
		
		// 예제 2-3 -> 서식문자를 이용해 출력하기
		System.out.printf("저는 대학교 %d학년에 재학중입니다!", 3); // 서식문자 %d를 이용하여 정수를 출력
		
		// 예제 2-4 
		System.out.printf("%d는 첫 번째, %f은 두 번째, %s는 세 번째", 1, 2.0, "셋"); // 서식문자 %d %f %s를 이용하여 정수형 실수형 문자열형 출력
		
		// 예제 2-5 -> 오른쪽 정렬하여 출력하기
		System.out.printf("%5d", 1); // %nd를 사용하여 n칸 만큼 확보한 후 오른쪽으로 정렬하여 출력, %-nd는 왼쪽으로 정렬하여 출력
		System.out.println(); // 줄바꿈
		System.out.printf("%5d", 12);
		System.out.println();
		System.out.printf("%5d", 123);
		System.out.println();
		System.out.printf("%5d", 1234);
		System.out.println();
		System.out.printf("%5d", 12345);
		
		// 예제 2-6 -> 소수점 출력하기
		System.out.printf("%.1f", 1.1234567); // %.nf를 사용하여 소수점 아래 n자리까지 출력 
		System.out.println(); // 줄바꿈
		System.out.printf("%.2f", 1.1234567);
		System.out.println();
		System.out.printf("%.3f", 1.1234567);
		System.out.println();
		System.out.printf("%.4f", 1.1234567);
		System.out.println();
		System.out.printf("%.5f", 1.1234567);
		
		// 예제 2-7 -> 변수에 데이터 입력하기
		int studentAge; // 정수형 변수 선언
		studentAge = 20; // 변수에 20 대입
		
		System.out.println(studentAge); // 정수형 변수 출력 + 줄바꿈
		
		// 예제 2-8 -> 변수 선언 및 초기화
		String myCity = "Seoul"; // 문자열형 변수 선언과 동시에 값 대입하여 초기화
		
		System.out.println("I am from " + myCity); // + 를 사용하여 문자열을 서로 연결하여 출력 + 줄바꿈
		
		// 예제 2-9 -> 변수를 이용해 다른 변수에 복사하기
		int myAge = 20; // 정수형 변수 선언 + 초기화 -> 이때 myAge는 저장공간으로 쓰임
		int yourAge = myAge; // 정수형 변수 선언하고 앞에서 선언한 myAge가 값으로 쓰이면서 yourAge에 대입된다.
		
		System.out.println(myAge); // 출력
		System.out.println(yourAge); // 출력
		
		// 예제 2-10 -> 2개의 변수에 저장된 데이터 바꾸기
		int myAge1 = 20; // 정수형 변수 선언 + 초기화
		int yourAge1 = 30; // 정수형 변수 선언 + 초기화
		int tempAge; // 정수형 변수만 선언 초기화 하지 않음
		
		tempAge = myAge1; // 임시 정수형 변수에 값1 대입
		myAge1 = yourAge1; // 값1에 값2 대입
		yourAge1 = tempAge; // 값2에 임시 정수형 변수에 저장된 값을 대입하여 두 변수간 값을 교체
		
		System.out.println(myAge); // 출력
		System.out.println(yourAge); // 출력
		
		// 예제 2-11 -> 정수형 1
		byte num1 = 20; // byte형 변수를 선언하고 20을 대입 
//		byte num5 = 128; -127~127만 저장가능하여 오류발생
		short num2 = 30; // short형 변수를 선언하고 30을 대입
		int num3 = 40; // int형 변수를 선언하고 40을 대입 (기본자료형)
		long num4 = 50; // long형 변수를 선언하고 50을 대입
		long num6 = 2147483648L; // int형 허용범위를 초과하는 큰 수의 경우 끝에 L을 붙여서 컴파일러에게 long형 임을 알려줘야한다
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		// 예제 2-12 -> 정수형 2
		byte num11 = 0110; // 2진수로 값 대입 6
		short num22 = 0107; // 8진수로 값 대입
		int num33 = 0x46; // 16진수로 값 대입
		long num44 = 69L; // Long형임을 알림
		
		System.out.println(num11);
		System.out.println(num22);
		System.out.println(num33);
		System.out.println(num44);
		
		// 예제 2-13 -> 실수형1
		double marathon = 42.195; // 실수형 변수 선언 (기본 자료형)
//		float halfMarathon = 21.0975; 오류발생
		float halfMarathon = 21.0975f; // long형과 마찬가지로 f를 붙여서 float임을 알려야한다
		
		System.out.println("마라톤은 " + marathon + "km를 달립니다");
		System.out.println("하프 마라톤은 " + halfMarathon + "km를 달립니다");
		
		// 예제 2-14 -> 실수형2
		double pieDouble = 3.141592653589793; // double형 사용하여 변수 선언 및 초기화
		float pieFloat = 3.141592653589793f; // float형 사용하여 변수 선언 및 초기화
		
		System.out.println("double : " + pieDouble); // 출력
		System.out.println("float : " + pieFloat); // float은 소수점아래 6~7자리까지 출력
		
		// 예제 2-16 -> 문자형1,2
		char ga = '가'; // 문자형 변수 선언 가 -> 유니코드 44032
		char na = '나'; // 문자형 변수 선언 나 -> 유니코드 45208
		char alphabetA = 'A'; // A -> 유니코드 65로 변환되어 저장된다
		char alphabetB = 'B'; // B -> 유니코드 66으로 변환되어 저장된다 
		
		System.out.println(ga);
		System.out.println(na);
		System.out.println(alphabetA + ", " + alphabetB);
		
		// 예제 2-17 -> 문자형3
		int alphabetA_ = 'A'; // A -> 65가 저장된다
		int alphabetB_ = 'B'; // B -> 66이 저장된다
		System.out.println(alphabetA_);
		System.out.println(alphabetB_);
		
		char alphabetC_ = 67; // 문자형 변수에 유니코드 67을 저장했고 이는 C를 의미한다.
		System.out.println(alphabetC_);
		
		// 예제 2-18 -> 논리형1
		boolean isStudent = true; // 논리형 변수에 true 로 초기화
		System.out.println(isStudent); // true 출력
		
		// 예제 2-19 -> 논리형2
		boolean isStudent1 = true; // 논리형 변수에 true 로 초기화
		
		if(isStudent1) { // if 문을 사용하여 결과에 따라 다르게 출력
			System.out.println("저는 학생입니다."); // true 일 경우
		}else {
			System.out.println("저는 학생이 아닙니다."); // false 일 경우
		}
		
		// 예제 2-20 -> 참조 자료형
		String hi = "안녕하세요,"; // 문자열형 변수에 문자열 저장
		String niceToMeetYou = "만나서 반갑습니다."; // 문자열형 변수에 문자열 저장
		
		System.out.println(hi);
		System.out.println(niceToMeetYou);
		
		// 예제 2-21 -> 형 변환하기
		int num12 = 11; // 정수형 변수 선언
		double num23 = 3.14; // 실수형 변수 선언
		double num12Change = (double)num12; // 실수형 변수를 선언하고 정수형 변수의 값을 실수형으로 형 변환하여 저장
		
		System.out.println("num12 : " + num12); // 문자열 + 정수의 조합으로 정수형 변수가 문자열형으로 형 변환되어 저장된다
		System.out.println("num12Change : " + num12Change); // 문자열 + 실수의 조합으로 실수형 변수가 문자열형으로 형 변환되어 저장된다
		System.out.println(num12Change + num23); // 실수형 + 실수형
		System.out.println((int)1.23); // 실수형값을 정수형으로 형 변환한다 이 과정에서 소수점을 없어지므로 데이터의 손실이 발생한다.
		
		// 예제 2-22 -> 정수형 <-> 정수형 형 변환하기
		int i1 = 10; // 정수형 변수를 선언하고 10으로 초기화
		byte b1 = (byte)i1; // 정수형 변수를 선언하고 i1의 값을 byte형으로 형 변환
		System.out.println(b1); // b1출력
		
		int i2 = 128; // 정수형 변수 선언하고 128로 초기화
		byte b2 = (byte)i2; // byte형 변수를 선언하고 i2로 초기화
		System.out.println(b2); // 출력시 -127~127 범위를 벗어나므로 오버플로우 발생
		
		// 예제 2-23 -> 실수형 <-> 실수형 형 변환하기
		double d1 = 1.0e100; // 실수형 변수를 선언하고 값 저장 ( 1.0 x 10의 100승)
		float f1 = (float)d1; // double형 변수를 float형 변수로 형 변환
		System.out.println(f1); // float의 저장 범위를 넘어서는 값을 대입하면 무한대가 되거나 0이 된다.

		double d2 = 1.0e-100; // 실수형 변수를 선언하고 값 저장
		float f2 = (float)d2; // double형 변수를 float형 변수로 형 변환
		System.out.println(f2); // float의 저장 범위를 넘어서는 값을 대입하면 무한대가 되거나 0이 된다.
		
		// 예제 2-24 -> 실수형 <-> 정수형 형 변환하기
		double pie = 3.14; // 실수형 변수 선언 및 초기화
		int pieInt = (int)pie; // 정수형 변수 선언하고 실수형 값을 정수형으로 형 변환하여 저장
		System.out.println(pieInt); // 데이터가 유실된다
		
		int num = 100; // 정수형 변수 선언 및 초기화
		double numD = (double) num; // 실수형 변수 선언하고 정수형 값을 실수형으로 형 변환하여 저장
		float numF = (float) 100; // 실수형 변수 선언하고 정수 100을 실수형으로 형 변환하여 저장
		System.out.println(numD); // 100.0 출력 
		System.out.println(numF); // 100.0 출력
		
		int i = 99999999; // 정수형 변수에 정수의 범위를 초과하는 값을 저장
		float f = (float) i; // 실수형 변수를 선언하고 범위를 초과했던 정수의 값을 실수로 형 변환하여 저장
		System.out.println(f); // 10의 8승 출력
		
		// 예제 2-25 자동 형 변환1
		int num111 = 14; // 정수형 변수 선언 및 초기화
		double num222 = 3.14; // 실수형 변수 선언 및 초기화
		//double num4 = num1; // num1을 double형으로 자동 형 변환 해줌
		//int num3 = (double) num2; // 자동 형 변환을 할 수 없는 역방향! 컴파일 에러 발생!
		
		int num444 = (int) num222; // 실수형 값을 정수형으로 형 변환하여 정수형 변수에 대입
		
		System.out.println(num444); // 소수점 버려지며 출력
		
		// 예제 2-26 자동 형 변환2
		int ii = 100; // 정수형 변수 선언 및 초기화
		char c = 'a'; // 문자형 변수 선언 및 a의 아스키 코드 값으로 저장
		int j = c; // 정수형 변수 선언 및 c의 아스키 코드 값으로 저장
		double d = ii;
		
		System.out.println("int형 변수 j의 값 : " + j);
		System.out.println("dobule형 변수 d의 값 : "  + d);
		
		// 예제 2-27 강제 형 변환1
		
		int iii = 10; // 정수형 변수 선언 및 초기화
		byte bb = (byte) iii; //int형 변수의 값을 byte 형으로 강제 형 변환하여 저장
		System.out.println("[int -> byte] i의 값 :" + iii + " b의 값 :" + bb);
		
		int jj = 1000; // 정수형 변수를 선언 및 초기화
		byte cc = (byte) jj; // int형 변수의 값을 byte 형으로 강제 형 변환하여 저장 (오버플로우 발생)
		System.out.println("[int -> byte] j이 값 :" + jj + " c의 값 :" + cc);
		
		// 예제 2-28 강제 형 변환2
		
		double d3 = 1.1234; // double형 변수 선언 후 초기화
		float f3 = (float) d3; // double형 변수를 float형으로 강제 형 변환 후 저장
		System.out.println("[double -> float] d3의 값 :" + d3 + ", f3의 값 :" + f3);
		
		double d4 = 1.0e-50; // double형 변수 선언 후 초기화
		float f4 = (float) d4; // float형 변수를 float형으로 강제 형 변환 후 저장 -> 0
		System.out.println("[double -> float] d4의 값 :" + d4 + "m, f4의 값:" + f4);
		
		double d5 = 1.0e100; // double형 변수 선언 후 초기화
		float f5 = (float) d5; // double형 변수를 float형으로 강제 형 변환 후 저장 -> 무한대
		System.out.println("[double -> float] d5의 값 :" + d5 + "m, f5의 값:" + f5);
		
		double d6 = 9.123456789; // double형 변수 선언 후 초기화
		float f6 = (float) d6; // double형 변수를 float형으로 강제 형 변환 후 저장 -> 정밀도 차이에 의한 데이터 손실 발생
		System.out.println("[double -> float] d6의 값 :" + d6 + "m, f6의 값:" + f6);
		
		// 예제 2-29 강제 형 변환3
		float f11 = 12345.67f;
		int i11 = (int) f11;
		System.out.println("[float -> int] f11의 값:" + f11 + ", i11의 값:" + i11);
		
		double d11 = 12345.678;
		int i12 = (int) d11;
		System.out.println("[double -> int] d11의 값:" + d11 + ", i12의 값:" + i12);
		
		// 예제 2-30 데이터 입력받기
		
//		Scanner sc = new Scanner(System.in); // Scanner형의 참조변수를 선언하고 스택메모리에 저장한다. new를 이용하여 참조값을 가지고 와 참조변수가 가리킬 수 있도록 한다. (힙메모리에 저장)
		
		System.out.println("나이를 입력해 주세요: "); // 출력 메시지
// 		int age = sc.nextInt(); // 입력 메소드 .nextInt() 사용
// 		System.out.printf("내 나이는 %d세 입니다", age); // 출력 메시지
		
 		
 		// 예제 2-31 데이터 입력받기
 		
 		Scanner sc = new Scanner(System.in); // Scanner형의 참조변수를 선언하고 스택메모리에 저장한다. new를 이용하여 참조값을 가지고 와 참조변수가 가리킬 수 있도록 한다. (힙메모리에 저장)
 		String name, address; // 문자열형 변수 선언
 		int age1; // 정수형 변수 선언
 		double weight; // 실수형 변수 선언
 		
 		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요"); // 출력메시지
 		name = sc.next(); // 문자열형으로 데이터를 입력 받기위해 next 사용
 		address = sc.next(); // 문자열형으로 데이터를 입력 받기위해 next 사용
 		age1 = sc.nextInt(); // int형으로 데이터를 입력 받기위해 nextInt 사용
 		weight = sc.nextDouble(); // double형으로 데이터를 입력 받기위해 nextDouble 사용
 		
 		System.out.printf("당신의 이름은 %s입니다\n", name); //형식 지정자를 사용하여 출력
 		System.out.printf("당신의 주소는 %s입니다\n", address);
 		System.out.printf("당신의 나이는 %d입니다\n", age1);
 		System.out.printf("당신의 체중은 %.1f입니다\n", weight);

 		sc.close(); // 자원할당해제
	}
}
