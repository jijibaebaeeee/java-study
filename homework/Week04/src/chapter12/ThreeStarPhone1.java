package chapter12;

public class ThreeStarPhone1 implements Phone1{
	int batteryCapacity = 35;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCapacity > 30) {
			System.out.println("@@@폰이 켜졌습니다@@@\n");
			isOn = true;
		}else {
			System.out.println("배터리가 부족합니다");
		}
	}

	@Override
	public void powerOff() {
		System.out.println("★★★폰이 꺼졌습니다★★★\n");
		isOn = false;
	}

	@Override
	public boolean isOn() {
		if(isOn) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void watchUtube() {
		if(batteryCapacity > 15) {
			System.out.println("--- watching Utube ---");
			batteryCapacity -= 10;
			System.out.println("battery is ..." + batteryCapacity + "%\n");
		}else {
			System.out.println("Low Battery...");
			powerOff();
		}
	}

	@Override
	public void charge() {
		if(batteryCapacity < Phone1.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("--- charging ---");
			batteryCapacity += 10;
			System.out.println("Charged..." + batteryCapacity + "%\n");
		}else {
			System.out.println("You don't have to charge...");
			System.out.println("It's enough..." + batteryCapacity + "%");
		}
		
	}
	

}
