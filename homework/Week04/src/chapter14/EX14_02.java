package chapter14;
//예제 14-02 NumberFormatException 예외
public class EX14_02 {
	public static void main(String[] args) {
		String str01 = "11";
		String str02 = "11.2";
		
		// 가능한 문장
		int num01 = Integer.parseInt(str01);
		
		System.out.println("String to int :" + num01);
		
		// 정수로 바뀔 수 없는 문자열을 정수로 바꾸려고하니 NumberFormatException 발생
		int num02 = Integer.parseInt(str02);
		
		//호출X
		System.out.println("String to int :" + num02);
	}
}
