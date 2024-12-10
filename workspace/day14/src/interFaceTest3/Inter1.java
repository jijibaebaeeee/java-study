package interFaceTest3;
//인터페이스의 디폴트메소드와 클래스 메소드가 동일한 경우
public interface Inter1 {
	default void printText() {
		System.out.println("Inter1의 printText 메서드 출력");
	}

}
