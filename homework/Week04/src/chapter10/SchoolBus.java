package bookExample;
//예제 10-23 -> N차 상속
public class SchoolBus extends Bus{
	//생성자 -> 부모가 가지므로 자식도 가져야함
	public SchoolBus(int peopleNum) {
		super(peopleNum);
	}

	@Override
	void takePerson() { // 메서드 오버라이딩 -> 자식객체에서 takePerson 호출시 자식의 것으로 호출된다.
		super.takePerson(); // 부모의 takePerson() 호출하고
		System.out.println("학생들이 자리에 모두 착석하고 출발합니다."); // 마무리 멘트까지 추가
	}

	
	@Override
	void ride() { // Car 클래스의 ride() 오버라이딩
		System.out.println("시속 50km/h로 천천히 달립니다.");
	}
	
	
	
	
}
