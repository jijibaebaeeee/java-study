package casting;

public class CastingTest {
	public static void main(String[] args) {
		// 각각 클래스 객체
		Tv tv = new Tv();
		System.out.println(tv);
		tv.chUp(); // 부모 객체의 값은 자식 클래스에 있는 멤버사용 불가능
		
		SmartTv smartTv = new SmartTv();
		System.out.println(smartTv);
		smartTv.chUp();
		smartTv.netflix(); // 자식 객체의 값은 자식 클래스에 있는 멤버 사용가능
		
		// Up Casting
		// 방법 1. 
		// SmartTv() 는 Tv 클래스의 
		
		SmartTv sTv1 = new SmartTv();
//		자료형    변수명 = 값
		Tv tv1 = new SmartTv(); // 부모타입의 객체에 자식의 참조값을 대입
		System.out.println(tv1);
//		tv1.netflix(); //어 안되네
		
		// 방법 2
		Tv tv2 = smartTv;
//		Tv tv2 = (Tv)smartv;
//		큰 타입  =   작은 타입
		//tv2는 SmartTv 객체를 참조하지만 업캐스팅으로 인해 Tv 타입으로 취급된다
		//따라서 Tv 클래스의 필드와 메소드에만 접근할 수 있다.
		
		
		// 방법 3
		Tv tv3 = new SmartTv();
		//부모클래스 타입의 참조 변수로 자식 클래스 타입의 객체를 참조한다.
		//부모클래스 타입의 참조변수에 자식 클래스 타입의 객체의 주소값을 저장한다.
		
		tv3.power = true;
		tv3.ch = 4;
		tv3.vol = 50;
//		tv3.netflex(); 사용불가
		
		//Down casting
		SmartTv stv2 = (SmartTv) tv3;
		stv2.netflix();
		
		//잘못된 down casting
//		SmarTv stv3 = (SmartTv)new Tv(); // 오류
//		System.out.println(stv3);
		
//		Down casting은 반드시 Up casting이 된 값으로 해야된다
//		즉, up casting 된 값을 다시 원래 자식 타입으로 되돌리는 것이 Down Casting이다
		
	}
}
