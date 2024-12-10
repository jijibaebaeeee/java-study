package teamTask;

public class Home {
	//필드
	String name;   //이름
	String myTurn; //요일
	
	//생성자
	public Home(String name, String myTurn) {
		this.name = name;
		this.myTurn = myTurn;
	}
	
	//메소드
	void dateCheck(String date) {
		if(this.myTurn.equals(date)) {
			System.out.println(this.name + "님은 오늘 집안일 당번입니다!");
		}else {
			System.out.println(this.name + "님은 오늘 집안일 당번이 아닙니다!");
		}
	}
	

}
