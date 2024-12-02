package methodTest;

// 13번 : 메소드 정의
public class MethodTest01 {
	
	 // 10을 더해주는 메소드 정의
	// 1) 기능 -> 값에 +10을 하는 기능
	// 2) 리턴타입 -> 뭔지 모르겠으면 void
	// 3) 메소드명 -> 
	// 4) 매개변수를 생각한다
	// 5) 실행할 문장을 생각한다
	// 6) 반환 값을 생각한다
	
	int addTen(int num) { // static 키워드가 없으면 main 메소드에서 호출 시 어디있는지 몰라서 호출이 불가능함. but, 다른 방법이 있음
		int result = num + 10;
		return result;
	
	}
	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner();
		MethodTest01 mt = new MethodTest01();
		
		
		//메소드 호출
		System.out.println(mt.addTen(10));
		
		
	}

	
	
	
}
