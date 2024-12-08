package teamTask;
// 0100팀 문제
import java.util.Random;
import java.util.Scanner;

// 공백 팀 문제 풀이
public class TeamTask02 {
	public static void main(String[] args) { // 메인 시작 영역
		
//		** 문제 1. randomGame
//
//		게임에 참여할 두 명의 이름을 사용자에게 입력 받는다.
//		랜덤으로 나온 5개 숫자들의 합이 더 큰 사람이 이기는 게임이다.
//		메소드명 : randomGame
//
//		- randomGame 메서드를 main에서 두 번 호출하여 출력 형식대로 출력하게 만들 것
//		- 매개변수 o 리턴 타입 자유
//
//		출력 형식
//		1등 : 사용자 1, 합계 : 00
//		2등 : 사용자 2, 합계 : 00
//
//		출제 의도
//
//		- 메서드를 외부에서 선언하고 호출하는 것을 연습하자
//		- 랜덤 클래스 생성하여 nextInt 메서드 새롭게 사용해보기
//		- Scanner의 입력 메서드를 변수에 넣어 인수로 사용해보기
		
		// 로직 구성
		// 스캐너 클래스 임포트
		// 사용자 이름 받을 문자열형 변수 2개, 합을 구할 2개의 변수
		// 5개의 랜덤한 수를 받을 정수형 배열을 2개 선언
		// for문을 돌리면서 random 메소드를 이용하여 랜덤한 수를 입력받아 저장
		// for each 문을 이용해서 합을 구한다.
		// 합을 비교해서 누가 이겼는지에 따라 출력 형식을 다르게 한다.

		
		//1번 메인 시작 영역
		Scanner sc = new Scanner(System.in);
		TeamTask02 tt = new TeamTask02();
		String name1 = "", name2 = "";
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int sum1 = 0, sum2 = 0;
		
		System.out.println("Player 1의 이름을 입력하세요: ");
		name1 = sc.next();
		sc.nextLine();
		System.out.println("Player 2의 이름을 입력하세요: ");
		name2 = sc.next();
		sc.nextLine();
		
		System.out.println("게임시작");
		
		tt.randomGame(arr1);
		tt.randomGame(arr2);
		
		// arr1의 총합
		for(int data : arr1) {
			sum1 += data;
		}
		
		// arr2의 총합
		for(int data : arr2) {
			sum2 += data;
		}
		
		//비교
		if(sum1 == sum2) {
			System.out.println("무승부 입니다~");
		}else if(sum1 > sum2) {
			System.out.printf("1등 : %s, 합계 : %d\n", name1, sum1);
			System.out.printf("2등 : %s, 합계 : %d\n", name2, sum2);
		}else {
			System.out.printf("1등 : %s, 합계 : %d\n", name2, sum2);
			System.out.printf("2등 : %s, 합계 : %d\n", name1, sum1);
		}

		//1번 메인 끝 영역
		
		//2번 메인 시작 영역
//		- **문제 2. 입력받은 Type 출력**
//	    
//	    정수, 실수, 문자, 문자열 중 하나를 입력하여 입력받은 Type이 무엇인지 알려주는 프로그램 
//	    
//	    메서드명: CheckType, Type에 따라 값 출력하는 메서드), 매개변수O, 리턴값 자유
//	    
//	    출력 형식
//	    정수, 실수, 문자, 문자열 중 하나를 입력하세요:  3.14
//	    3.14는 실수입니다.
//	    
//	    출제 의도 
//	    
//	    - 오버 로딩 연습
//	    - 여러 형변환들이 어떻게 작동하는지  연습
		
		// 로직 구성
		// 입력 클래스 임포트
		// 사용자로부터 입력받은 것을 함수의 인수로 전달한다 
//		String check = "";
//		System.out.println("정수, 실수, 문자, 문자열 중 하나를 입력하세요: ");
		// 정수 실수 문자 문자열 어떻게 구별하지?
		
		
		
		
		//2번 메인 끝 영역
		
		//3번 메인 시작 영역
//		- **문제 3. 랜덤다이스 만들기**
//	    
//	    주사위를 돌려서 같은 수 두 번이 나올 때 까지 던진다. 몇번째에 성공하는지 횟수를 계산해야 하고, 메서드에 이름을 입력하면 그 사람의 결과가 출력된다
//	    
//	    "연속으로 같은 수 나오기 성공"
//	    "김태현님은 총 몇 번 성공하셨습니다" 출력
//	    
//	    메소드명은 randomDice, 리턴값은 없음, 매개변수는 문자열 변수 사용
//	    
//	    - 출제 의도 -< while문, 증감연산자, if문, 기타제어문>
//	    
//	    - 추가 요소
//	    Random random = new Random();를 사용
//	    random.nextInt(a)+b (:b부터 a까지의 수를 랜덤으로 뽑음)을 사용
		
		
		
	} // 메인 끝 영역
	
	//1번 메소드 시작 영역
	void randomGame(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20) + 1;
		}
			
	}

	
}
