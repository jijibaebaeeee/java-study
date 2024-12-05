package task;

public class BasicTvMain {
	public static void main(String[] args) {
		BasicTv tv = new BasicTv(false, 1);
		tv.powerOnOff();

		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		
	}
	

}
