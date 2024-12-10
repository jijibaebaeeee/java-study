package review;

public class CastingTask {
	public static void main(String[] args) {
//		Music[] music = {new Music(), new Ballad(), new HipHop(), new Rock()}; 객체 생성
//		System.out.println();
//		Ballad ballad = new Ballad();
//		ballad = null; // 참조제거하는 법
	
		
//		for(Music mu : music) {
//			check(music);	
//		}
		
		check(new Music());  // 객체 생성이다, 참조변수는 없지만 
		check(new Ballad());
		check(new HipHop());
		check(new Rock());
		
	}
	
	static void check(Music music) {
		music.mode();
		if(music instanceof Ballad) {
			((Ballad)music).onlyBallad();
		}else if(music instanceof HipHop) {
			((HipHop)music).onlyHipHop();
		}else if(music instanceof Rock) {
			((Rock)music).onlyRock();
		}
	}

}
