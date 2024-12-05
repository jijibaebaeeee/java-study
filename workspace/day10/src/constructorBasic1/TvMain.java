package constructorBasic1;

public class TvMain{
	public static void main(String[] args) {
		Tv myTv1 = new Tv(false, 10, 20, "red", "LG");
		Tv myTv2 = new Tv(false, 4, 12, "gray", "Sam");
		
//		myTv1.brand = "LG";
//		myTv1.color = "black";
//		myTv1.ch = 10;
//		myTv1.vol = 5;
//		
//		myTv2.brand = "Sam";
//		myTv2.color = "Gray";
//		myTv2.ch = 5;
//		myTv2.vol = 10;
		
		
		System.out.println(myTv1 +" TV를 조작합니다");
		System.out.println(myTv1.power);
		myTv1.powerOnOff();
	}
	
}
