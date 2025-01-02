package threadTest;

public class JoinTest {
	public static void main(String[] args) {
		//자바에서 람다식이다 ? -> 100% 함수형 인터페이스
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("양수입력");
				}
			}
			System.out.println(Thread.currentThread().getName() + "쓰레드 종료");
		};
		
		Thread t1 = new Thread(r1, "t1");
		Thread t2 = new Thread(r1, "t2");
		
		
		t1.start();
		t2.start();
		
		try {
			//t1.join(); // t1 쓰레드가 종료되어야 모두 종료된다. + 현재쓰레드(main)는 대기한다.
			t1.join(1500); // t1 쓰레드 중간에 현재 쓰레드(main)가 실행된다!!!!
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("양수입력");
			}
		}
		System.out.println("main쓰레드 종료");
		
		
	}
}
