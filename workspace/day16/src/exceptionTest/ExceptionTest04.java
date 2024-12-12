package exceptionTest;

//4번 : 예외처리
public class ExceptionTest04 {
	public static void main(String[] args) {
		String[] ar = { "a", "b", "100", "a", "-50" };

		for (String i : ar) {
			try {
				System.out.println(Integer.parseInt(i));
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환 불가 : " + e.getMessage());
				e.printStackTrace();
			}

		}
	}

}
