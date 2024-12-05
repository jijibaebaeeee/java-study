package constructorBasic1;

public class Tv {
		//필드
		boolean power;
		int ch;
		int vol;
		String color;
		String brand;
		
		// 기본 생성자 => 개발자가 만들지 않으면 컴파일러가 자동으로 생성한다.
		public Tv() {
			
		}
		
		// 매개변수 2개 있는 생성자
		public Tv(boolean power, int ch) {
			this.power = power;
			this.ch = ch;
		}

		// 매개변수 5개 있는 생성자
		public Tv(boolean power, int ch, int vol, String color, String brand) {
			this.power = power;
			this.ch = ch;
			this.vol = vol;
			this.color = color;
			this.brand = brand;
		}
		

		// 메소드
		// 전원 키고 끌 수 있는 메소드
		// 메소드명 : powerOnOff
		// 리턴값 x, 매개변수 x
		// 로직구성
		// 메인에서 출력만 되면 상태가 바뀌면된다.
		// Off인 경우 -> On 시킨다
		// On인 경우 -> Off 로 바꾼다
		
//		void powerOnOff() {
//			if(power == true) { // 전원이 켜져 있으면
//				power = false; // 전원을 끈다 
//				System.out.println("Tv를 끕니다.");
//			}else { // 전원이 꺼져 있으면
//				power = true; // 전원을 켠다
//				System.out.println("Tv를 켭니다 ");
//			}
//		}
		



		void powerOnOff() {
			power = !power;
			System.out.println("전원 상태 : " + (power ? "켜짐" : "꺼짐"));
		}
		
		
		// 볼륨 올리고 내릴 수 있는 메소드
		// 메소드명 : increaseVolume(), decreaseVolume()
		// 리턴값 x, 매개변수 x
		// 로직구성
		// 메인에서 출력만되면 기존의 볼륨에서 1씩 볼륨을 올리거나 내린다
		



		void increaseVolume() {
			if(!power) {
				System.out.println("전원이 꺼져있습니다.");
			}else {
			System.out.println("현재 볼륨 : " + vol);
			if(vol <= 99) {
				vol++;
				System.out.println("올린 볼륨의 크기는" + vol + "입니다.");
		    }else {
		    	System.out.println("더 이상 올릴 수 없습니다.");
		    }
		  }
		}
		
		void decreaseVolume() {
			if(!power) {
				System.out.println("전원이 꺼져있습니다.");
			}else {
				System.out.println("현재 볼륨 : " + vol);
				if(vol > 0) {
					vol--;
					System.out.println("내린 볼륨의 크기는" + vol + "입니다.");
				}else {
					System.out.println("더 이상 내릴 수 없습니다.");
				}
		    }  
		}
		
		
		// 채널 올리고 내릴 수 있는 메소드
		// 메소드명 : nextChannel(), previousChannel()
		// 리턴값 x, 매개변수 x
		// 로직구성
		// 메인에서 출력되면 기존의 채널에서 1씩 채널을 올리거나 내린다
		
		void nextChannel() {
			if(!power) {
				System.out.println("전원이 꺼져있습니다.");
			}else {
				if(ch == 20) {
					ch = 1;
					System.out.println("다음 채널은 " + ch + "입니다.");
			    }else {
			    	ch++;
			    	System.out.println("다음 채널은 " + ch + "입니다");
			    }
			}
		}
		
		void previousChannel() {
			if(!power) {
				System.out.println("전원이 꺼져있습니다.");
			}else {
				if(ch == 1) {
					ch = 20;
					System.out.println("다음 채널은 " + ch + "입니다.");
			    }else {
			    	ch--;
			    	System.out.println("다음 채널은 " + ch + "입니다.");
			    }
		}
	}

}


