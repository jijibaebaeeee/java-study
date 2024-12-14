package chapter10;

//예제 10-6 상속에서 생성자
public class EX10_06 {
	public static void main(String[] args) {
		Customer c1 = new Customer("박자바", 25, 11111);
		c1.enter();
		
		Customer c2 = new Customer("송코딩", 20, 22222);
		c2.enter();
	}

}
