package throwsTest;

public class ThrowsTest {
	
	static void method() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500); // 500 -> 0.5초, 1000 -> 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //
		}
	}
	
	public static void main(String[] args) {
		method();
	}

}
