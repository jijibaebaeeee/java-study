package classBasic2;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		rect1.width = 10;
		rect1.height = 20;
		
		System.out.println("rect1의 넓이 : " + rect1.getArea());
		System.out.println("rect1의 둘레 : " + rect1.getPerimeter());
	}
}
