package ex01;

public class Main2 {		
	//성적 평가 프로그램
	//학생의 성적을 2과목 입력받아 학점을 계산하는 프로그램 
	//90점이상 A, 80점이상 90점 미만 B, 70점이상 80점 미만 C, 70점미만 F //2과목 평균계산해서 정수형으로 비교
	
	//반드시 메소드를 만들 것(2개 이상)
	//객체도 2개 만들 것 (학생1, 학생2)
	
	//로직구성있어야함

	//사용자로부터 점수를 입력받고 학점과 합격 여부를 출력하기
	//필드 : 이름, java점수, dbms점수, 총점, 학점
	//생성자 : 상관없음
	//메소드 : calculateGrade(int ) : 점수를 받아 학점 반환하는 메소드(매개변수 1개 정수형)
	// 		isPass(int) : 점수가 70점이상이면 true, 아니면 false반환하는 메소드
	

	/* 로직구성
	 * 필드에 맞게 생성
	 * <Main>
	 * 객체 2개 생성
	 * 생성자 이름, java점수, dbms점수 받기 
	 * 1번 메소드
	 * 리턴타입 String
	 * 메소드명
	 * 매개변수 int
	 * int에 따라서 학점을 반환하기
	 * 
	 * 2번 메소드
	 * 점수가 70점이상이면 true Not false 반환하게
	 * */
	
	//필드
	String name;
	int java;
	int dbms;
	int total;
	String grade;
	
	//생성자
	public Main2(String name, int java, int dbms) {
		super();
		this.name = name;
		this.java = java;
		this.dbms = dbms;
		this.total = java + dbms;
		this.grade = calculateGrade(this.total / 2);
	}
	
	//메소드
	String calculateGrade(int score) {
		if(score >= 90) {
			return "A";
		}else if(score >= 80) {
			return "B";
		}else if(score >= 70) {
			return "C";
		}else {
			return "F";
		}
	}
	
	boolean isPass(int avgScore) {
		return avgScore>= 70;
	}
	
	
	public static void main(String[] args) {
		Main2 st1 = new Main2("지수", 90, 80);
		Main2 st2 = new Main2("선호", 80, 100);
		
		System.out.println(st1.grade);
		System.out.println(st2.grade);
		
		
		
		
	}


}
