package homework;

public class Chapter6 {
	public static void main(String[] args) {
			// 예제 6-1 -> 배열의 선언과 생성
			int[] arr1 = new int[4]; // stack 메모리 영역에 정수형 배열의 참조변수를 선언하고, new를 이용하여 힙 메모리 영역에 4칸의 정수형 배열을 생성한 후, 참조값을 받아와 참조변수가 가리킬 수 있도록 한다
		
			System.out.println(arr1); // 배열 출력
		
			// 예제 6-2 -> 배열에 값 저장하기
			int[] arr = new int[4]; // stack 메모리 영역에 정수형 배열을 선언하고, new를 이용하여 힙 메모리 영역에 4칸의 정수형 배열을 생성한 후, 참조값을 받아와 참조변수가 가리킬 수 있도록 한다
			
			arr[0] = 1; // 첫번째 칸에 1 저장
			arr[1] = 2; // 두번째 칸에 2 저장
			arr[2] = 3; // 세번째 칸에 3 저장
			arr[3] = 4; // 네번째 칸에 4 저장
			
			System.out.println("arr[0] = " + arr[0]); // 출력
			System.out.println("arr[1] = " + arr[1]);
			System.out.println("arr[2] = " + arr[2]);
			System.out.println("arr[3] = " + arr[3]);
			
			
			// 예제 6-3 -> 배열 선언과 초기값
			int[] intArray = new int[5]; // 5칸짜리 정수형 배열을 선언한다
			String[] strArray = new String[5]; // 5칸짜리 문자열형 배열을 선언한다
			
			int[] varArray = {1, 2, 3, 4, 5}; // 5칸짜리 정수형 배열을 선언하고 12345 값을 저장한다.
			
			System.out.println("intArray[0] = " + intArray[0]); // 초기값 0 출력
			System.out.println("intArray[1] = " + intArray[1]); // 초기값 0 출력
			System.out.println("strArray[0] = " + strArray[0]); // 초기값 null 출력
			System.out.println("strArray[1] = " + strArray[1]); // 초기값 null 출력
			System.out.println("varArray[0] = " + varArray[0]); // 1
			System.out.println("varArray[1] = " + varArray[1]); // 2
			
			// 예제 6-4 -> 배열 값에서 짝수의 합 구하기
			int[] numbers = new int[10]; // 10칸짜리 정수형 배열을 생성
			
			for(int i = 0; i < numbers.length; i++) { // for문 시작 초기값 0, 배열의 크기보다 작을 때까지, 1씩증가
				numbers[i] = (int)(Math.random() * 30) + 1; // Math클래스의 random 메소드를 사용하여 무작위 실수를 생성하고 정수형으로 강제 형 변환 후 +1 하여 배열에 저장한다
			}	
		
			int sum = 0; // 정수형 변수를 선언 및 초기화
			for(int i = 0; i < numbers.length; i++) { // for문 시작 초기값 0, 배열의 크기보다 작을 때까지, 1씩증가
				if(numbers[i] % 2 == 0) { // if문 배열의 값이 2로 나누었을 때 나머지가 0이라면
					sum += numbers[i]; // 합계에 더한다
				} // if문 끝
			}// for문 끝
			for(int i = 0; i < numbers.length; i++) { // for문 시작 초기값 0, 배열의 크기보다 작을 때까지, 1씩증가
				System.out.print(numbers[i] + " "); // 순회하여 출력
				} // for문 끝
		
				System.out.println(); //줄바꿈
				System.out.println("배열의 짝수들의 합 : " + sum); // 합계 출력
			
			
			// 예제 6-5 -> 배열에서 단어만 추출하여 출력하기
				char[] cards = {'1', 'L', 'O', '1', 'V', '2', 'W'}; // 문자형 배열을 선언하고 원하는 값으로 저장한다
				String myWord = ""; // 문자열형 변수 선언 및 초기화
				
				for(int i = 0; i < cards.length; i++) { // for문 시작 초기값 0, 배열의 길이보다 작을 때까지, 1씩증가
					int word = cards[i]; // 정수형 변수를 선언하고 배열의 값을 하나씩 저장한다
					
					if((word > 65 && word <= 90) || (word >= 97 && word <=122)) { // if 문 시작 관계 연산자와 논리 연산자를 사용
						myWord += (char)word; // true 면 유니코드로 저장된 값을 형 변환하여 문자로 바꿔 문자열 변수에 저장한다.
					}
				}
				System.out.println("단어 : " + myWord); // 단어 출력
	
			
			// 예제 6-6 -> 버블 정렬하기
			int[] arr2 = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9}; // 
			
			int temp = 0;
			
			for(int i = arr2.length-1; i >0; i--) {
				for(int j = 0; j < i; j++) {
					if(arr1[j] > arr2[j+1]) {
						temp = arr2[j+1];
						arr2[j+1] = arr2[j];
						arr2[j] = temp;
					}
				}
			}
			
			System.out.println("정렬 후 출력 : ");
			for(int i = 0; i < arr2.length; i++) {
				System.out.print(arr[i] + " ");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
