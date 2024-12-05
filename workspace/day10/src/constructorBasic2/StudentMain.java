package constructorBasic2;
// 7번 : 기본생성자 확인

//문제 : 변수 이름 충돌 > 해결 this 키워드 사용해서 변수명인지 필드명인지를 구분한다.
class Student {
	   // 필드
	   String name;
	   int age;

	   // 생성자
	   public Student(String name, int age) {
	      name = name; // 의도한대로 동작하지 않는다
	      age = age; // 지역변수의 값을 그대로 대입하기 때문에 필드는 초기화 되지 않는다
	      System.out.println(name);
	   }

	   // 메소드
	   void studentInfo() {
	      System.out.println("이름 : " + name);
	      System.out.println("나이 : " + age);
	   }
	}

	public class StudentMain {
	   public static void main(String[] args) {
	      Student st1 = new Student("짱구", 5);
	      st1.studentInfo();
	   }
	}

