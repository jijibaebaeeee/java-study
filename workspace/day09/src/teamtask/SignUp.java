package teamtask;

import java.util.Scanner;

public class SignUp {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      SignUp tt = new SignUp();
      String id = "", name = "", pw = "", pwCheck = "";
      int userInput = 0;
      boolean isSignUp = false;

      while (true) {
         // 메인화면출력
         tt.mainPage(isSignUp);

         // 입력받기
         userInput = tt.search();
         if (userInput == 3) {
            break; // 프로그램 종료
         }

         switch (userInput) {
         case 1:
            System.out.print("아이디를 입력해주세요 : ");
            id = sc.next();
            sc.nextLine();// void buffer

            // 아이디 중복 검사
            while (tt.idCheck(id) == false) {
               System.out.print("아이디 중복입니다. 다시 입력해주세요 : ");
               id = sc.next();
               sc.nextLine();// void buffer
            }

            // 닉네임 받기
            System.out.print("닉네임을 입력해주세요 : ");
            name = sc.next();
            sc.nextLine();// void buffer
            // 닉네임 중복검사
            while (tt.nameCheck(name) == false) {
               System.out.print("닉네임 중복입니다. 다시 입력해주세요 : ");
               name = sc.next();
               sc.nextLine();// void buffer
            }

            // 비밀번호 받기
            System.out.print("비밀번호를 입력해주세요 : ");
            pw = sc.next();
            sc.nextLine();// void buffer
            System.out.print("비밀번호를 다시 입력해주세요 : ");
            pwCheck = sc.next();
            sc.nextLine();// void buffer
            // 비밀번호 일치 검사
            while (tt.pwCheck(pw, pwCheck).equals("false")) {
               System.out.print("비밀번호가 불일치합니다. 다시 입력해주세요 : ");
               pwCheck = sc.next();
               sc.nextLine();// void buffer
            }
            System.out.println();
            isSignUp = true;
            System.out.println(""
                  + "☁️🌚🌚🌚🌚☁️🌚☁️☁️☁️🌚☁️☁️🌚🌚🌚☁️☁️☁️🌚🌚🌚☁️☁️🌚🌚🌚🌚🌚☁️☁️🌚🌚🌚🌚☁️☁️🌚🌚🌚🌚☁️🌚🌚🌚🌚🌚☁️🌚☁️☁️☁️🌚☁️☁️🌚☁️☁️☁️\n"
                  + "🌚☁️☁️☁️☁️☁️🌚☁️☁️☁️🌚☁️🌚☁️☁️☁️🌚☁️🌚☁️☁️☁️🌚☁️🌚☁️☁️☁️☁️☁️🌚☁️☁️☁️☁️☁️🌚☁️☁️☁️☁️☁️🌚☁️☁️☁️☁️☁️🌚☁️☁️☁️🌚☁️☁️🌚☁️☁️☁️\n"
                  + "☁️🌚🌚🌚🌚☁️🌚☁️☁️☁️🌚☁️🌚☁️☁️☁️☁️☁️🌚☁️☁️☁️☁️☁️🌚🌚🌚🌚🌚☁️☁️🌚🌚🌚🌚☁️☁️🌚🌚🌚🌚☁️🌚🌚🌚🌚🌚☁️🌚☁️☁️☁️🌚☁️☁️🌚☁️☁️☁️\n"
                  + "☁️☁️☁️☁️🌚☁️🌚☁️☁️☁️🌚☁️🌚☁️☁️☁️🌚☁️🌚☁️☁️☁️🌚☁️🌚☁️☁️☁️☁️☁️☁️☁️☁️☁️🌚☁️☁️☁️☁️☁️🌚☁️🌚☁️☁️☁️☁️☁️🌚☁️☁️☁️🌚☁️☁️🌚☁️☁️☁️\n"
                  + "🌚🌚🌚🌚☁️☁️☁️🌚🌚🌚☁️☁️☁️🌚🌚🌚☁️☁️☁️🌚🌚🌚☁️☁️🌚🌚🌚🌚🌚☁️🌚🌚🌚🌚☁️☁️🌚🌚🌚🌚☁️☁️🌚☁️☁️☁️☁️☁️☁️🌚🌚🌚☁️☁️☁️🌚🌚🌚🌚\n"
                  + "");
            System.out.println(
                  name + "님 환영합니다, 아이디는 " + id + ", 비밀번호는 " + "암호화된 {" + tt.pwCheck(pw, pwCheck) + "} 입니다");
            break;
         case 2:
            
            break;
         default:
            break;
         }
      }
   }

   // 메인 페이지 출력 메소드
   void mainPage(boolean isSignUp) {
      String status = isSignUp ? "로그인됨" : "게스트";
      System.out.println(""
            + "==========================================================================================================\n"
            + "                                        ~~ 환영합니다 ~~\n"
            + "==========================================================================================================\n"
            + "1. 회원가입     |      2. 로그인       |      3. 접속 종료      |                         |     현재상태 : "
            + status+"\n"
            + "==========================================================================================================\n");
   }

   // 입력창 메소드
   int search() {
      Scanner sc = new Scanner(System.in);
      System.out.print("입력(정수) --> ");
      int result = sc.nextInt();
      return result;
   }

   // 아이디 중복검사 메소드
   boolean idCheck(String id) {
      String[] basicId = { "admin01", "admin02", "admin03" };
      for (String data : basicId) {
         if (data.equals(id)) {
            System.out.println("아이디가 중복됩니다.");
            return false;
         }
      }
      return true;
   }

   // 닉네임 중복검사 메소드
   boolean nameCheck(String name) {
      String[] basicName = { "name01", "name02", "name03" }; // 기존 닉네임
      for (String data : basicName) {
         if (data.equals(name)) {
            System.out.println("닉네임이 중복됩니다");
            return false; // 닉네임 중복
         }
      }
      return true;
   }

   // 비밀번호 재확인 메소드
   String pwCheck(String pw, String pwCheck) {
//           비밀번호 길이
      if (pw.length() != pwCheck.length()) {
         return "false";
      }

//           //문자 단위 체크
      for (int i = 0; i < pw.length(); i++) {
         if (pw.charAt(i) != pwCheck.charAt(i)) {
            return "false";
         }
      }

//           //암호화(아스키코드)
      String encryptionPw = "";
      for (int i = 0; i < pw.length(); i++) {
         encryptionPw += ((int) pw.charAt(i)) + ""; // 자동형변환
      }
      return encryptionPw;
   }
}
