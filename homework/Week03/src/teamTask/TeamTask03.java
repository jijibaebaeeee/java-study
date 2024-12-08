package teamTask;
// JAV탕 문제
import java.util.Scanner;

public class TeamTask03 {
	public static void main(String[] args) {
//		문제 1.
//		★메소드로 계산기 만들기★
//
//		사칙연산 실행
//		조건
//		1차원 2칸짜리 배열 생성
//		사용자로부터 입력 받고(int형) 배열에 저장(for문으로 저장)
//		메소드4개(더하기, 빼기, 곱하기, 나누기)
//		리턴타입 O, 매개변수 O (매개변수는 배열로 전달)
//		-> 더하기 메소드(for-each문 사용)
//		-> 빼기 메소드(큰값 - 작은값)
//		-> 곱하기 메소드(원하시는 대로)
//		-> 나누기 메소드(실수형으로 형변환. 0번 인덱스/1번 인덱스.
//		0으론 나눌 수 없음.)

		// 1번 문제 로직구성
		// 배열생성
		// 스캐너 클래스 import
		// for 입력받아오기
		// int add(int[] arr){for-each}
		// 사칙연산 메소드 실행 ...

		// if(arr[1]==0){ syso("0으로 나눌 수 없습니다");}
		// else{ 나누기 메소드 실행 }

		// 빼기
		// int subraction(int[] arr){
		// int max = arr[0]>arr[1]?arr[0]:arr[1];
		// int min = arr[0]>arr[1]?arr[1]:arr[0];
		// return max - min;}

		// 곱하기
		// int multiply(int[] arr){ return arr[0]*arr[1];}

		// 나누기
		// double divide(int[] arr){ return (double)arr[0]/arr[1];}

		// 1번 메인 시작영역
		TeamTask03 tt = new TeamTask03();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];

		System.out.println("2개의 정수를 입력해주세요: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sc.nextLine();
		}

		// 더하기
		System.out.printf("%d + %d = %d\n", arr[0], arr[1], tt.add(arr));
		System.out.printf("%d - %d = %d\n", arr[0], arr[1], tt.subtract(arr));
		System.out.printf("%d * %d = %d\n", arr[0], arr[1], tt.multiply(arr));
		if (arr[1] == 0) { // 수정필요함
			System.out.println("0으로는 나눌 수 없습니다.");
		} else {
			System.out.printf("%d / %d = %.2f\n", arr[0], arr[1], tt.devide(arr));
		}
		// 1번 메인 끝영역

		// 2번 문제
//		★메소드를 활용한 연령대별 버스카드 프로그램★
//
//		연령대를 입력받고(입력)
//		연령대를 판별한다(어린이, 청소년, 성인)(메소드1)
//		버스카드에 일정 금액 돈을 충전한다(입력)
//		버스카드를 사용(메소드2){  // int요금과 String연령대가 들어간다(매개변수 2개)
//		   연령대별 요금을 설정한다(final 변수)
//		   잔액 소진할 때까지 버스카드 사용(반복문)
//		   버스카드를 사용하는동안 "버스 탑승 완료." 출력
//		   "버스를 탑니다. 잔액 : " 출력
//		   잔액이 부족해지면 "잔액이 부족합니다." 출력하고 프로그램 종료(탈출)
//		   }
		/*
		 * 로직구성 main method 변수 생성 (int age = 0, money = 0; String ageName ="";)
		 * 
		 * 스캐너 클래스 할당 age = 나이 입력받아오기; money = 돈 입력받아오기; ageName = checkAge(age);
		 * takeBus(money, ageName);
		 * 
		 *
		 * 사용자 지정 method 1. 연령대 판별 String checkAge(int age){ if(age>19){ return "성인";
		 * }else if(age>12){ return "청소년"; }else{ return "어린이"; } }
		 *
		 * 2. 버스카드 사용 메소드 void takeBus(int money, String age){ 상수 생성 (final int CHILD =
		 * 500; ~ STUDENT = 800; ~ ADULT = 1400;) 변수 생성 (int charge = 0;
		 *
		 *
		 * switch(age){ case "어린이": charge = CHILD; break; ... }
		 *
		 * while(true){ if(money - charge > 0 )//돈이 있으면{ syso("버스 탑승 완료."); money -=
		 * charge; syso("잔액 : "+money); }else{ syso("잔액이 부족합니다."); break; }
		 */

//		2번 메인 시작영역
		int age = 0, money = 0;
		String ageName = "";

		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		sc.nextLine();

		ageName = tt.checkAge(age);

		System.out.println("충전할 돈을 입력하세요 : ");
		money = sc.nextInt();
		sc.nextLine();

		tt.takeBus(money, ageName);
		// 2번 메인 끝 영역
		
	//   문제3.
	//   ★메소드 회원가입★(메소드로 코드 분리하기)★
	//
	//   회원가입(입력 : 아이디, 닉네임, 비번, 비번확인)
	//   → 배열로 임의로 아이디와 닉네임 만들기(배열은 1차원 배열, 값은 각 3개)
	//   → 회원가입 시 배열에 있는 아이디를 사용한다고 하면 중복된다고 알려주기
	//   → 닉네임도 겹치면 알려주기
	//   → 비번은 두번 입력 받아 두개의 비번이 동일해야 하며, 아스키코드로 암호화
	//   → 겹치는거 없고, 비번도 다 맞으면 "회원가입 성공" 후 끝
	//   → 최종출력 "userName님 환영합니다, 아이디는 userId, 비밀번호는 암호화된 {아스키코드값} 입니다"
	//   └ 배열, 메소드, for문, if문, 형변환
		
		//로직구성
//      main method
//      scanner class 추가
//      문자열 변수 아이디, 닉네임, 비번, 비번확인
//      

//      사용자 지정 method
//      boolean idCheck(String id){
//      
//      String basicId[3] = {"dlachgus", "answnsgur", "qowltn"}; //기존 아이디   
//      //아이디 중복검사
//      for(String data : basicId) {
//         if(data.equals(id)) {
//            syso("아이디가 중복됩니다.");
//            return false; //id 중복
//         }
//      }
//      return true;
//   }

		// 닉네임 중복검사
//      boolean nameCheck(String name){
//      String basicName[3] = {"adf", "adf", "dasf"}; //기존 닉네임
		// for(String data : basicName) {
		// if(data.equals(name)) {
		// syso("닉네임이 중복됩니다.");
		// return false; //닉네임 중복
		// }
		// }
//         return true; 
//      }

		// 비빌번호 재확인
//      → 비번은 두번 입력 받아 두개의 비번이 동일해야 하며, 아스키코드로 암호화
//      String pwCheck(String pw, String pwCheck){
		// 비밀번호 길이
//         if(pw.length() != pwCheck.length()){return false;}

//         //문자 단위 체크
//         for(int i = 0; i<pw.length; i++){
//            if(pw.charAt(i)!=pwCheck.charAt(i)){
//               return false;
//            }
//         }

//         //암호화(아스키코드)
//         String encryptionPw = "";
//         for(int i=0; i<pw.length; i++){
//            encryptionPw += ((int)pw.charAt(i))+""; //자동형변환
//         }
//         return encryptionPw;
//      }
		
		// 3번 메인 시작 영역
		String id = "", nickName = "", pw = "", pwCheck = "", pwAscii = "";
		
		System.out.println("ID를 입력하세요 : ");
		id = sc.nextLine();

		while (true) {
			// id 중복체크 함수 출력
			if (tt.idCheck(id).equals("false")) { // false = 중복이면
				break;
			}

			// nickname 중복체크 함수 출력
			System.out.println("닉네임을 입력하세요 : ");
			nickName = sc.nextLine();

			if (tt.nameCheck(nickName).equals("false")) {

				break;
			}

			// 비밀번호 입력받고 중복체크 함수 출력
			System.out.println("비밀번호를 입력하세요 : ");
			pw = sc.nextLine();
			System.out.println("비밀번호를 한 번 더 입력하세요 : ");
			pwCheck = sc.nextLine();

			if (tt.pwCheck(pw, pwCheck).equals("false")) {
				System.out.println("비밀번호가 틀렸습니다.");
				break;
			}
			
//			pwAscii = jt.pwCheck(pw, pwCheck);
			
			
		//   → 겹치는거 없고, 비번도 다 맞으면 "회원가입 성공" 후 끝
		//   → 최종출력 "userName님 환영합니다, 아이디는 userId, 비밀번호는 암호화된 {아스키코드값} 입니다"
		//   └ 배열, 메소드, for문, if문, 형변환
			
			System.out.println("회원가입 성공");
			System.out.println(nickName + "님 환영합니다, 아이디는 " + id + ", 비밀번호는 " + "암호화된 {" + tt.pwCheck(pw, pwCheck) + "} 입니다");
			
			System.out.printf("%s님 환영합니다, 아이디는 %s, 비밀번호는 암호화된 { %s } 입니다. ", nickName, id, args,  tt.pwCheck(pw, pwCheck));
			break;
			
		}
		// 3번 메인 끝 영역

	} // 메인 끝 영역

	// 1번 메소드 시작 영역
	// + 메소드
	int add(int[] arr) {
		int sum = 0;
		for (int data : arr) {
			sum += data;
		}
		return sum;
	}

	// - 메소드
	int subtract(int[] arr) {
		if (arr[0] - arr[1] <= 0) {
			return arr[1] - arr[0];
		} else {
			return arr[0] - arr[1];
		}
	}

	// * 메소드
	int multiply(int[] arr) {
		return arr[0] * arr[1];

	}

	// / 메소드
	double devide(int[] arr) {
		return (double) arr[0] / arr[1];
	}
	// 1번 메소드 끝 영역

	// 2번 메소드 시작 영역
	String checkAge(int age) {
		if (age > 19) {
			return "성인";
		} else if (age > 12) {
			return "청소년";
		} else {
			return "어린이";
		}
	}
	
	void takeBus(int money, String age) {
		final int CHILD = 500, STUDENT = 800, ADULT = 1400;
		int charge = 0;
   
		switch(age) {
		case"어린이":
			charge = 500;
			break;
		case"청소년":
			charge = 800;
			break;
		case"성인":
			charge = 1400;
			break;
		}
	   
		while(true) {
			if(money - charge > 0) {
				System.out.println("버스 탑승 완료");
				money -= charge;
				System.out.println("버스를 탑니다. 잔액 : " + money);
			}else if(money - charge <= 0) {
				System.out.println("잔액이 부족합니다.");
				break;
			}
		}
	}
	// 2번 메소드 끝 영역
	
	// 3번 메소드 시작 영역
	String idCheck(String id) {
		String[] basicId = { "dlachgus", "answnsgur", "qowltn" }; // 기존 아이디
		// 아이디 중복검사
		for (String data : basicId) {
			if (data.equals(id)) {
				System.out.println("ID가 중복됩니다.");
				return "false"; // id 중복
			}
		}
		return "true";
	}

	String nameCheck(String id) {
		String[] basicName = { "adf", "asf", "dasf" }; // 기존 닉네임
		// 아이디 중복검사
		for (String data : basicName) {
			if (data.equals(id)) {
				System.out.println("닉네임이 중복됩니다.");
				return "false"; // 닉네임 중복
			}
		}
		return "true";
	}

	String pwCheck(String pw, String pwCheck) {
		// 비밀번호 길이
		if (pw.length() != pwCheck.length()) {
			return "false";
		}

		// 문자 단위 체크
		for (int i = 0; i < pw.length(); i++) {
			if (pw.charAt(i) != pwCheck.charAt(i)) {
				return "false";
			}
		}

		// 암호화(아스키코드)
		String encryptionPw = "";
		for (int i = 0; i < pw.length(); i++) {
			encryptionPw += ((int)pw.charAt(i)) + ""; // 자동형변환
		}
		return encryptionPw;
	}
	// 3번 메소드 끝 영역
	
} //클래스 끝 영역
