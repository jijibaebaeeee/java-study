package marvelTask;

public class MarvelHeroMain {
	public static void main(String[] args) {
		
		// 아이언맨(IronMan)과 헐크(Hulk) 객체를 만들고 정보출력
		MarvelHero mh = new MarvelHero("아이언맨(IronMan)", "강력한 갑옷", 50);
		MarvelHero mh2 = new MarvelHero("헐크(Hulk)", "엄청난 힘!!!!", 45);
		
		mh.printInfo();
		mh2.printInfo();
		
		mh.performAction();
		mh2.performAction();
				
		
		
	}

}
