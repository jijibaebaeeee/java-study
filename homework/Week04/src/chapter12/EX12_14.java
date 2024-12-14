package bookExample;

public class EX12_14 {
	public static void main(String[] args) {
		Person1 jisu = new Person1(new PineapplePhone1());
		jisu.turnOnPhone();
		for(int i = 1; i < 6; i++) {
			jisu.watchUtube();
			
			if(i % 3 == 0) {
				jisu.chargePhone();
			}
		}
		
		jisu.buyNewPhone(new ThreeStarPhone1());
		
		
		for(int i = 1; i < 5; i++) {
			jisu.watchUtube();
			
			if(i % 3 ==0) {
				jisu.chargePhone();
			}
		}
	}
}
