package chapter13;
//예제 13-6 익명 내부 클래스 예제

interface buttonClickListener{ // 인터페이스 선언
	public void click(); // public abstract 는 기본으로 붙는다
}

public class AnonymousExample {
	public class Button{ // 내부 클래스선언
		private buttonClickListener listener; // 필드를 private 접근제한자를 사용하고, 인터페이스 객체의 참조변수형을 선언
		
		public void setButtonListener(buttonClickListener listener) { // buttoenClickListener 객체를 매개변수로 하는 메소드 선언
			this.listener = listener; // 해당 내부 클래스의 필드에 저장
		}
		
		public void click() {
			if(listener != null) { // listener이 존재한다면
				this.listener.click(); // click 메서드 실행
			}
		}
		
	}
	
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample(); // Anony 클래스 객체 생성
//		exam.Button button = new exam.Button(); 이거 웨 안돼?
		AnonymousExample.Button button = exam.new Button(); // 참조 변수 선언할때는 풀네임으로 가야하는데 객체 생성할 때는 위에서 선언한 객체로 접근이 가능하다...?
		
		button.setButtonListener(new buttonClickListener() {

			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");
			}
			
		});
	}
}
