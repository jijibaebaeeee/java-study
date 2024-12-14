package forAnotherPac;
//예제 10-27 final 메서드
public class EX10_27 {
	public static void main(String[] args) {
		Comic comicBook = new Comic("주머니 괴물", "미상", true); // 생성자의 형식에 맞게 인수 전달 하여 객체 생성후 초기화
		comicBook.info_title(); // 객체를 통해Comic 클래스의 info_title 호출
		comicBook.info_author(); // 객체를 통해 Comic 클래스의 info_author 호출
		comicBook.info_color(); // 객체를 통해 Comic 클래스의 info_color 호출
		
		// ++ 생성자에는 final 불가능. 아까 private이 된 것은 봤다.
	}
}
