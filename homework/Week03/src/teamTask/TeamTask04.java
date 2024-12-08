package teamTask;
// I팀 문제
import java.util.Scanner;

public class TeamTask04 {
	public static void main(String[] args) {
//		문제 01. 좀비 바이러스 발생
//		처음 좀비의 수가 2마리 라고 가정했을 때 1시간 후에는 4마리 > 2시간 후에는 8마리 > 3시간 후에는 16마리> ... 가 됩니다.
//		6시간 뒤에 좀비가 몇 마리가 될지 계산하는 메소드를 만드세요.
//			[조건]
//			1. 리턴값 o, 매개변수 o
//			2. 초기 좀비의 수는 입력메소드로 입력 받아야합니다
//			3. 초기 좀비의 수가 1로 입력 받았을 경우 ‘초기 진압 되었습니다.’ 출력
//		출력 결과) 6시간 후의 좀비의 수는  N 입니다.**
		
		//로직 구성
		// 스캐너 클래스 임포트
		// 클래스 객체 선언
		// 정수형 변수 선언 하고 입력받기
		// 버퍼비우기
		// 1인경우 초기 진압
		// 6을 곱해서 리턴
		
		// 1번 메인 시작 영역
		Scanner sc = new Scanner(System.in);
		TeamTask04 tt = new TeamTask04();
		
		int input = 0, num = 0;
		
		System.out.println("초기 좀비의 수를 입력하세요: ");
		
		input = sc.nextInt();
		sc.nextLine();
		
		num = tt.countZombie(input);
		
		if(input == 1) {
			System.out.println("초기 진압 되었습니다.");
		}
		
		System.out.println("6시간 후의 좀비의 수는 " + num + "입니다.");
		
		
		// 1번 메인 끝 영역
		
		
//		문제 03. 오늘의 운세 확인
//		이름과 날짜를 입력하고 오늘의 운세를 확인해보세요
//		이름의 각 자리를 정수로 바꾼 후 입력받은 날짜까지 다 더해서 5로 나누고 나온 나머지의 결과값에 따라 오늘의 운세 문구를 출력하세요 
//			[ 조건 ] 
//			1. 매개변수 o(2개), 리턴값 o
//			2. 메소드명 : tellFortune
//			[운세 문구]
//			0 : 오늘은 행운의 날입니다!
//			1 : 약간의 어려움이 있을 수 있어요.
//			2 : 평온한 하루가 예상됩니다.
//			3 : 모험심을 발휘해보세요!
//			4 : 좋은 일이 찾아올 거예요.
//		출력 결과 )
//		이름을 입력하면 오늘의 운세를 확인 할 수 있습니다. :  홍길동
//		운세 : 평온한 하루가 예상됩니다.
		
		//로직구성
		// 스캐너 클래스 임포트
		// 이름과 날짜를 받을 문자열형 변수 선언
		// 이름의 각 자리를 바꾸고 -> 강제형변환
	    // String -> int
		// 5로 나누어서 리턴
		// switch문 사용
		
		// 3번 메인 시작 영역
		String name = "", date = "";
		int number = 0;
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.println("날짜를 입력하세요 : (예) 1207");
		date = sc.next();
		
		number = tt.tellFortune(name, date);
		
		switch(number) {
		case 0:
			System.out.println("오늘은 행운의 날입니다!");
			break;
		case 1:
			System.out.println("약간의 어려움이 있을 수 있어요.");
			break;
		case 2:
			System.out.println("평온한 하루가 예상됩니다.");
			break;
		case 3:
			System.out.println("모험심을 발휘해보세요!");
			break;
		case 4:
			System.out.println("좋은 일이 찾아올 거예요.");
			break;
		}
		
	}
	
	// 1번 메소드 시작 영역
	int countZombie(int num) {
		return num * 6;
	}
	// 1번 메소드 끝 영역
	
	// 3번 메소드 시작 영역
	int tellFortune(String name, String date) {
		int sum = 0;
		for(int i = 0; i < name.length(); i++) {
			sum += (int)name.charAt(i);
		}
		
		for(int i = 0; i < date.length(); i++) {
			sum += (int)date.charAt(i);
		}
		
		sum %= 5;
		return sum;
	}

}
