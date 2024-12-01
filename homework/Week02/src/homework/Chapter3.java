package homework;


public class Chapter3 {
	public static void main(String[] args) {
		// 예제 3-1 부호 연산자
		
		int x = 100; // 정수형 변수 선언 및 초기화
		int resultPlus = +x; // 정수형 변수에 양수 저장
		int resultMinus = -x; // 정수형 변수에 음수 저장
		
		System.out.println(resultPlus);
		System.out.println(resultPlus);
		
		// 예제 3-2 부호 연산자(실수)
		double d = 1.11;  //double형 정수 선언 및 초기화
		double result = -d; // result에 -1.11 저장
		
		System.out.println(-d); // 출력
		System.out.println(result); // 출력
		
		// 예제 3-3 증감 연산자1
		int num = 10; // 정수형 변수 선언 및 초기화
		System.out.println(num); // 출력
		num++; // num += 1
		System.out.println(num); // 출력
		
		// 예제 3-4 증감 연산자2
		int num1 = 10; //정수형 변수 선언
		System.out.println(num1++); //  num을 출력하고나서 +1 한다
		System.out.println(num1); // num + 1의 결과 출력
		
		// 예제 3-5 증감 연산자3
		int num2 = 30; // 정수형 변수 선언 및 초기화
		System.out.println(++num2); // num +1을 하고난 결과를 출력
		System.out.println(num2); // 위와 값 동일
		
		System.out.println(num2++); // 위와 값 동일하고 출력 후에 +1진행
		System.out.println(num2); // 위의 값에 +1된 결과 출력
		
		// 예제 3-6 -> 증감 연산자 위치에 따른 결과
		int x1 = 1; // 정수형 변수 선언 및 초기화
		
		System.out.println(x1++); // 1
		System.out.println(x1); // 2
		System.out.println(++x1); // 3
	
		// 예제 3-7 -> 증감 연산자 (문자형)
		char alphabetX = 'X'; // 유니코드 값으로 88이 저장되어 X와 매핑
		System.out.println(alphabetX++); // X를 출력하고 88 + 1 진행
		System.out.println(alphabetX); // 유니코드 값이 89인 Y 출력
		
		// 예제 3-8 -> 논리 부정 연산자
	    boolean isHuman = false; // 논리형 변수 선언 및 초기화
	    System.out.println(!isHuman); // !false -> true 출력
	    System.out.println(isHuman); // false 출력
	    
	    // 예제 3-9 -> 산술 연산자1
	    int x2 = 100; // 정수형 변수 선언 및 초기화
	    int y2 = 200; // 정수형 변수 선언 및 초기화
	    
	    System.out.println(x2 + y2); // 더하기
	    System.out.println(x2 - y2); // 빼기
	    System.out.println(x2 * y2); // 곱하기
	    System.out.println(x2 / y2); // 나누기
	    System.out.println(x2 % y2); // 나머지 구하기
	    
	    // 예제 3-10 -> 산술 연산자2(형 변환)
	    double num11 = 1.2345; // 실수형 변수 선언 및 초기화
	    int num22 = 6; // 정수형 변수 선언 및 초기화
	    System.out.println(num11 + num22); // 실수형으로 자동 형 변환되어 출력
	    
	    // 예제 3-11 -> 표현 범위
	    int result1 = 1000000 * 100000; // 정수형변수 선언 및 초기화
	    System.out.println(result1); // 오버플로우 발생
	    
	    // 예제 3-12 0 -> 복합 대입 연산자
	    int x3 = 10; //정수형 변수 선언 및 초기화
	    int y3 = 1; // 정수형 변수 선언 및 초기화
	    
	    y3 += x3; // y3 = y3 + x3
	    System.out.println(y3);
	    
	    y3 *= x3; // y3 = y3 * x3
	    System.out.println(y3);
	    
	    y3 %= x3; // y3 = y3 % x3
	    System.out.println(y3);
	    
	    // 예제 3-13 -> 관계 연산자
	    int a = 10; // 정수형 변수 선언 및 초기화
	    int b = 20; // 정수형 변수 선언 및 초기화
	     
	    System.out.println(a > b); // boolean 타입으로 결과 출력
	    System.out.println(a <= b);
	    System.out.println(a == b);
	    System.out.println(a != b); // a와 b가 다르면 True, 같으면 True
	    
	    // 예제 3-14 -> 관계 연산자2
	    int a1 = 10; // 정수형 변수 선언 및 초기화
	    int b1 = 11; // 정수형 변수 선언 및 초기화
	    
	    System.out.println(a <= b); // boolean 타입으로 결과 출력
	    System.out.println(a1 == b1); // a1이 b1과 같으면 true
	    System.out.println(a1 != --b1); // a1이 (b1-1)과 다르면 true
	    
	    // 예제 3-15 -> 논리 연산자
	    boolean t1 = true;
	    boolean t2 = false;
	    boolean t3 = true;
	    boolean t4 = false;
	    
	    System.out.println("###논리곱###");
	    System.out.println(t1 && t2); //둘다 true 면 true
	    System.out.println(t1 && t3);
	    System.out.println(t2 && t4);
	    System.out.println();
	    
	    System.out.println("###논리합###");
	    System.out.println(t1 || t2); //둘 중 하나만 true 면 true
	    System.out.println(t1 || t3);
	    System.out.println(t2 || t4);
	    System.out.println();
	    
	    System.out.println("###배타적 논리합###");
	    System.out.println(t1 ^ t2); //둘이 서로 다르면 true
	    System.out.println(t1 ^ t3);
	    
	    // 예제 3-16 -> 삼항 연산자
	    int num3 = (7 > 1) ? 1 : 2; // 조건식 ? true일때 : false 일때
	    System.out.println(num3); // 조건식이 true 이므로 1이 출력된다
	    
	    // 예제 3-17 -> 삼항 연산자
	    int num4 = 0; // 정수형 변수 선언 및 초기화
	    
	    if(7 > 1) { // if문 시작 조건식은 true
	    	num4 = 1; // true일 때
	    }else { // if문 끝, else시작
	    	num4 = 2; // false 일 때
	    }// else 끝
	    System.out.println(num4); // true 이므로 값은 1 출력
	    
	}

}
