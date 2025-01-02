package threadTest;

public class ThreadTest2 {
	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2();
		MyThread2 mt2 = new MyThread2();
		
//		mt1.run();
//		mt2.run();
		
		Thread t1 = new Thread(mt1, "A");
		Thread t2 = new Thread(mt2, "B");
		
		t1.start();
		t2.start();
		
		//Runnable 인터페이스는 함수형 인터페이스이다 => 람다식으로 가능
		
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		//r1 하나 넘겨주고 C이름 붙이고 start시키기
		Thread test = new Thread(r1, "C");
		test.start();
		
		// 클래스를 만들지 않고 r1을 그냥 람다식으로 인수로 넣어주기
		Thread t3 = new Thread(() -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + "스레드 종료");
		}, "C");
		t3.start();
	}
}
