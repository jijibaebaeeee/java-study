package chapter12;
//예제 12-4 추상 클래스
public class Ex12_04 {
	public static void main(String[] args) {
//		Receipt r = new Receiprt(); //추상클래스는 직접 객체 생성 불가
		
		PastaReceipt pr = new PastaReceipt("최연석"); //일반적인 클래스의 객체 생성
		pr.info(); // 부모클래스의 info 메소드 호출
		pr.makeSource(); // 자식 클래스의 메소드 호출
		System.out.println();
		
		StakeReceipt sr = new StakeReceipt("이현복"); // 클래스의 객체 생성
		sr.info(); // 부모클래스의 info 메소드 호출
		sr.grillStake(); // 자식 클래스의 메소드 호출
	}

}
