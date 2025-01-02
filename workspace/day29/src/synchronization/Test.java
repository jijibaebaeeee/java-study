package synchronization;

public class Test implements Runnable{
	//필드
	private int number;

	//생성자
	public Test() {
		super();
		this.number = 10;
	}

	@Override
	public /* synchronized */ void run() { // run()메소드에 동기화 처리하면 싱글 쓰레드로 처리한다. -> 1이 모두 실행되고 2가 실행된다. synchronized 지우고 말고의 차이가 있음
		for(int i = 0; i < 5; i++) {
			sub(1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
//	public void sub(int number) {
//		String name = Thread.currentThread().getName();
//		this.number -= number;
//		System.out.println(name + " :- " + number);
//		System.out.println("현재 number : " + this.number);
//	}
	
//	public synchronized void sub(int number) {
//		String name = Thread.currentThread().getName();
//		
//		this.number -= number; // 자원을 공유하는 부분
//		System.out.println(name + " :- " + number);
//		System.out.println("현재 number : " + this.number);
//	}
	
	public synchronized void sub(int number) {
		String name = Thread.currentThread().getName();
		synchronized(this) {
		this.number -= number; // 자원을 공유하는 부분
		}
		System.out.println(name + " :- " + number);
		System.out.println("현재 number : " + this.number);
	}
	
	
	

}
