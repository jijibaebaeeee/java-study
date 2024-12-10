package casting4;

public class Main {
   public static void main(String[] args) {
      
	  //업캐스팅
      Hero ironMan = new IronMan("아이언맨"); //아이언맨 객체생성
      Hero hulk = new Hulk("헐크"); // 헐크 객체생성
   
      System.out.println(ironMan); // 아이언맨 객체의 참조값 출력
      System.out.println(hulk); // 헐크 객체의 참조값 출력
      System.out.println(ironMan.getName()); // 아이언맨 이름 출력
      
      // 다운캐스팅
      IronMan ironMan2 = (IronMan) ironMan;
      
   }
}