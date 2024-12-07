package bookExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

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
			int[] arr2 = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9}; // 배열 생성
			
			int temp = 0; // 정수형 임시 변수 선언
			
			for(int i = arr2.length-1; i > 0; i--) { //for문 시작영역 배열의 마지막 인덱스부터 하나씩 줄여가면서. . .
				for(int j = 0; j < i; j++) { // 내부 for문 배열의 처음부터 i의 직전 인덱스까지 하나씩 증가하면서. . .
					if(arr2[j] > arr2[j+1]) { // j번째가 j+1번째보다 크면
						temp = arr2[j+1]; // 더 작은 값을 임시 변수에 넣음
						arr2[j+1] = arr2[j]; // j+1 인덱스의 값을 큰 값으로 대치함 
						arr2[j] = temp; // 임시 변수에 넣은 작은 값을 j번째에 넣음
					}
				}
			}
			
			System.out.println("정렬 후 출력 : "); // 출력문
			for(int i = 0; i < arr2.length; i++) { // 처음부터 배열의 끝까지 1씩 증가
				System.out.print(arr2[i] + " "); // 정렬된 배열의 요소 출력
			}
			
			// 예제 6-7 -> Arrays.ToString()
			int[] arr3 = {1,6,2,3,10,7,4,5,8,9}; // 배열 생성
			System.out.println(Arrays.toString(arr3)); // Arrays.toString() 을 사용하여 배열을 문자열 형태로 출력 -> [ 값, 값, 값 ....] 형태
													   // 해당 클래스 임포트 필요 import java.utils.Arrays
			
			// 예제 6-8 -> Arrays.sort()를 이용한 배열의 오름차순 (arr3 그대로 이용)
			System.out.println("정렬 전 배열 : " + Arrays.toString(arr3)); // 정렬 전 배열을 출력
			Arrays.sort(arr3); // 배열을 오름차순해서 정렬
			System.out.println("오름차순 정렬 : " + Arrays.toString(arr3)); // 정렬 후 배열을 출력
			
			// 예제 6-9 -> Arrays.sort() 를 이용한 배열의 내림차순
			Integer[] arr4 = {1,6,2,3,10,7,4,5,8,9}; // int = Integer!?
			
			System.out.println("정렬 전 배열 : " + Arrays.toString(arr4)); // 정렬 전 배열을 출력
			Arrays.sort(arr4, Comparator.reverseOrder()); // 배열을 내림차순으로 정렬
			System.out.println("내림차순 정렬 : " + Arrays.toString(arr4)); // 정렬 후 배열을 출력
		
			// 예제 6-10 -> 얕은 복사
			int[] arr01 = {1, 2, 3}; // 배열1 선언
			int[] arr02 = arr01; // 얕은 복사 진행
			
			System.out.println("arr01 배열 : " + Arrays.toString(arr01)); // 배열 1 출력
			
			arr02[1] = 10; // 배열 2의 값 일부 변경
			
			System.out.println("arr02 배열 : " + Arrays.toString(arr02)); // 배열 2 출력
			System.out.println("arr01 배열 : " + Arrays.toString(arr01)); // 배열 1 출력시 참조값을 공유하는 얕은 복사의 특성 때문에 arr01의 값도 바뀌어있다.
			
			
			// 예제 6-11 -> 새로운 배열을 생성하여 복사
			int[] card = {1, 6, 4, 5, 3, 2}; // 배열 생성
			int[] newCard = new int[card.length]; // 복사받기 위한 만큼의 크기를 선언
			
			for(int i = 0; i < card.length; i++) { // card의 배열크기 만큼 반복
				newCard[i] = card[i]; // 새 배열에 값을 복사
			}
			
			System.out.println("card 배열 : " + Arrays.toString(card)); // 출력
			System.out.println("newCard 배열 : " + Arrays.toString(newCard)); // 출력
			
			// 예제 6-12 -> Arrays 클래스를 이용한 깊은 복사
			int[] card1 = {3, 1, 4, 5, 10}; // 배열 생성
			int[] newCard1 = Arrays.copyOf(card, card1.length); // Arrays.copyOf(배열, 복사범위) 
			
			System.out.println("card 배열 : " + Arrays.toString(card1));
			
			card1[1] = 10;
			
			System.out.println("card 배열 : " + Arrays.toString(card1));
			System.out.println("newCard 배열 : " + Arrays.toString(newCard1));
			
			// 예제 6-13 -> System 클래스를 이용한 깊은 복사
			int[] card2 = {1, 6, 4, 5, 3, 2}; // 배열을 생성
			int[] newCard2 = new int[card2.length]; // 배열의 크기만큼 복사
			
			System.arraycopy(card2, 0, newCard2, 0, card2.length); // System.arraycopy(복사 대상 배열, 복사 시작 위치, 카피할 배열, 시작 위치, 복사할 길이)

			
			System.out.println("card 배열 : " + Arrays.toString(card2));  // 배열출력
			System.out.println("newCard 배열 : " + Arrays.toString(newCard2)); // 배열출력
			
			// 예제 6-14 -> 각 행에 대한 열의 크기
			int[][] ar = new int[2][3]; // 2행3열의 2차원 배열을 생성
			
			ar[0][0] = 1; // 인덱스에 하나씩 값을 저장
			ar[0][1] = 2;
			ar[0][2] = 3;
			
			ar[1][0] = 11;
			ar[1][1] = 12;
			ar[1][2] = 13;
			
			System.out.println("2차원 배열 : " + ar);  // 배열의 시작주소(참조값)을 출력
			
			System.out.println("2차원 배열 1행 : " + ar[0]); // 1행 출력
			
			System.out.println("행의 크기 : " + ar.length); // 행의 크기 출력
			
			System.out.println("1 행의 열 크기" + ar[0].length); // 각 행의 열 크기 출력
			System.out.println("2 행의 열 크기" + ar[1].length); // 각 행의 열 크기 출력
			 
			System.out.println("ar[0][0] = " + ar[0][0]); // 1행 1열의 값 출력
			
			// 예제 6-15 2차원 배열을 활용한 예제
			int[][] ar1 = new int[5][5]; // 5행 5열의 2차원 배열 생성
			
			int count = 1; // 값을 넣기 위한 변수 선언
			
			  // 배열에 값 저장 1~25
			for(int i = 0; i < 5; i++) { // 배열의 행 크기만큼 반복
				for(int j = 0; j < 5; j++) { // 배열의 열 크기만큼 반복
					ar1[i][j] = count++; // 값을 넣고 count 값을 1 올린다
				}
			}
			  // 배열을 출력 
			for(int i = 0; i < 5; i++) { // 배열의 행 크기만큼 반복
				for(int j = 0; j < 5; j++) {  // 배열의 열 크기만큼 반복
					System.out.print(ar1[i][j] + " "); // 해당 인덱스의 갑을 출력
				}
				System.out.println(); // 한 행이 끝날 때 마다 줄바꿈
			}
			
			// 예제 6-16 ->2차원 배열을 이용한 로또
			int[][] lotto = {{2, 6, 11, 33, 42, 44},
							{1, 6, 17, 22, 24, 33},
							{7, 16, 24, 33, 42, 44},
							{11, 27, 32, 34, 43, 46},
							{6, 17, 22, 24, 33, 41}};
			
			Scanner sc = new Scanner(System.in); //입력 클래스 객체 생성 및 임포트
			String myNum = ""; // 문자열형 변수 선언
			System.out.println("당첨 숫자 6개를 연속으로 입력해주세요 >>");
			myNum = sc.next(); // 입력 받아서 저장
			sc.nextLine(); // 버퍼 비우기
			
			boolean isWin = false;
			
			for(int i = 0; i < lotto.length; i++) {
				String lottoNumber = ""; // 내부 반복이 끝나면 문자열 초기화
				
				for(int j = 0; j < lotto[i].length; j++) { // 로또의 열의 수만큼 반복
					lottoNumber += lotto[i][j]; // 해당하는 행의 모든 열의 번호를 저장
				}
				if(myNum.equals(lottoNumber)) { // 사용자가 입력한 번호와 로또의 한 줄이 같으면
					isWin = true; // true 로 바꾸고
					break; // 반복문 탈출
				}
			}
			
			if(isWin) {
				System.out.println(myNum + " 번호 당첨!");
			}else {
				System.out.println(myNum + " 번호는 당첨되지 못했습니다.");
			}
			sc.close(); // 스캐너 메모리 해제
			
			// 예제 6-17 향상된 for 문
			
			int[] score = {90, 92, 93}; // 배열 선언
			
			int sum1 = 0; // 총합을 구하는 변수 선언
			double avg = 0.0; // 평균을 구하는 변수 선언
			
			for(int data : score) { // for-each 문 사용
				sum1 += data; // 총합 누적
			}
			avg = (double)sum1 / score.length; // 평균을 구한다
			
			System.out.println("총점 : " + sum1 + ", 평균 : " + avg); // 출력
			
	}
}
