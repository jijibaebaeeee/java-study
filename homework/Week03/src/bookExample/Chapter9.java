package bookExample;


public class Chapter9 { // main 클래스를 담는 클래스
	public static void main(String[] args) { 
		
		//예제 9-2 -> 생성자
//		Snack chip = new Snack(); // 객체 생성 및 초기화
//		chip.price = 2000; // 객체의 필드 설정
//		chip.info(); // 객체 메서드 호출
		
		//예제 9-4 -> 생성자 추가하고 사용하기
		Snack chip = new Snack(5000);
		chip.info();
		
		//예제 9-6 매개변수 2개로 객체 생성하기
		Person p1 = new Person("김자바", 20);
		Person p2 = new Person("이코딩", 40);
		
		p1.introduce();
		p2.introduce();
		
		//예제 9-8 생성자 매개변수 부족 컴파일 오류
		Phone phone1 = new Phone("갤럭시", 1, "흰색"); // 생성자의 매개변수에 맞게 인수 전달
//		Phone phone2 = new Phone("아이폰", 2); // 컴파일 오류
		
		//예제 9-10 생성자 추가
		Phone phone2 = new Phone("아이폰", 2); // 이제 컴파일 오류 안남
		
		phone1.phoneInfo();
		phone2.phoneInfo();
		
		//예제 9-12 오버로딩
		Book b1 = new Book();
		System.out.println("b1.title : " + b1.title);
		System.out.println("b1.series : " + b1.series);
		System.out.println("b1.page : " + b1.page);
		Book b2 = new Book("멘토시리즈 자바");
		System.out.println("b2.title : " + b2.title);
		System.out.println("b2.series : " + b2.series);
		System.out.println("b2.page : " + b2.page);
		Book b3 = new Book("신데렐라", 170);
		System.out.println("b3.title : " + b3.title);
		System.out.println("b3.series : " + b3.series);
		System.out.println("b3.page : " + b3.page);
		Book b4 = new Book(5, "노인과 바다");
		System.out.println("b4.title : " + b4.title);
		System.out.println("b4.series : " + b4.series);
		System.out.println("b4.page : " + b4.page);
		
		
		
		
		
	}
}
