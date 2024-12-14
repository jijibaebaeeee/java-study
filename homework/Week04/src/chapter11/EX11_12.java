package chapter11;

//예제 11-12 Samsong 컴퓨터 객체를 만들어줄 클래스
public class EX11_12 { // 메인클래스
	public static void main(String[] args) {
		ComputerRoom1 cr = new ComputerRoom1(); //ComputerRoom 클래스의 객체 생성 
//		cr.computer1 = new Samsong(); // 위에서 생성한 객체를 이용해 ComputerRoom1 필드에 선언된 Samsong 참조변수에 객체 생성
//		cr.computer2 = new Samsong(); // 위에서 생성한 객체를 이용해 ComputerRoom1 필드에 선언된 Samsong 참조변수에 객체 생성
		
		//예제 11-13 코드수정
		cr.computer1 = new LZ(); // 위에서 생성한 객체를 이용해 ComputerRoom1 필드에 선언된 LZ 참조변수에 객체 생성
		cr.computer2 = new LZ(); // 위에서 생성한 객체를 이용해 ComputerRoom1 필드에 선언된 LZ 참조변수에 객체 생성
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		System.out.println();
		
		
	}

}
