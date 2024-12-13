package objectTest;

public class UserMain {
	public static void main(String[] args) {
		User user1 = new User(1, "짱구");
		User user2 = new User(1, "짱구");

//      System.out.println(user1);
//      System.out.println(user2.toString());
//      System.out.println(user1.hashCode());
//      System.out.println(user2.hashCode());
//      
//      System.out.println(user1 == user2);
//      System.out.println(user1.equals(user2));
//      System.out.println(Integer.toHexString(1221555852));

//      //자기자신과 비교하는 경우 return true
		System.out.println(user1.equals(user1));
//      //객체와 null 비교하는경우
		System.out.println(user1.equals(null));
//      User user3 = null;

		//사실 String 클래스의 str1 객체를 생성했고 -> "hello" 라는 참조값..?이 들어간 것.
		String str1 = "hello";
		System.out.println(str1);
		System.out.println(str1.toString());

		int[] ar = { 1, 2, 3 };
		System.out.println(ar);
		System.out.println(ar.toString());

	}

}
