package InheritanceTest;
//7번 : 상속 기초
public class TvMain {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		System.out.println(tv1);
		tv1.powerOnOff();
		tv1.powerOnOff();
		
		Tv2 tv2 = new Tv2();
		System.out.println(tv2);
		
		System.out.println(tv2.ch);
		tv2.netflix();
		
	}
	
}
