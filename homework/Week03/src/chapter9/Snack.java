package chapter9;

// 예제 9-1 생성자
public class Snack { // 클래스 선언
	int price; // 필드
	
	// 예쩨 9-3 생성자 추가하고 사용하기
	public Snack(int price) { // 생성자 추가
	this.price = price;  // this. 를 이용해서 표시해주는 것이 좋음
}
	
	void info() { // 인스턴스 메소드 선언
		System.out.println("과자의 가격은 " + price + "원입니다."); // 출력
	}

}
