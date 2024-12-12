package exceptionTest;
//2번 : Exception Basic
public class ExceptionTest02 {
	public static void main(String[] args) {
		ExceptionTest02 et = new ExceptionTest02();
		et.printLength("Java");
//		et.printLength(0.5);
		
//		java.lang.NullPointerException
		et.printLength(null); // 예외발생
	}
	
	public void printLength(String data) {
		int result = data.length();
		System.out.println("글자 수 " + result);
	}

}
