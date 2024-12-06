package homework;

public class BookMain {
	public static void main(String[] args) {
		//객체 생성
		Book book = new Book(); // 알수없음, 알수없음 
		Book book1 = new Book("월화수우우우우우목금퇼"); // 월화수우우우우우목금퇼, 알수없음
		Book book2 = new Book("내일은 퇼", "배지수"); // 내일은 퇼, 배지수
		
		//출력
		book.printInfo();
		book1.printInfo();
		book2.printInfo();
		
		//객체 생성
		EBook ebook = new EBook() ; // 알수없음, 알수없음, 0
		EBook ebook2 = new EBook("노인과 바다", "배지수아님", 4.3) ; // 노인과 바다, 배지수아님
		
		//출력
		ebook.printInfo();
		ebook2.printInfo();
		
	}

}
