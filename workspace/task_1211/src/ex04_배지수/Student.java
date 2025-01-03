package ex04_배지수;

public class Student extends Person{
//	(2) Student 클래스
//    Person 클래스 상속
//    - 필드 (private) : int javaScore, int dbmsScore, int htmlScore(과목 점수)
//    - 생성자 : Person의 생성자를 호출하고, 각 점수 초기화
//    - 메소드
//        getTotalScore() : 세 과목 점수를 더한 값(정수)을 반환
//        getAverageScore() : 평균(정수형)으로 반환
	
	private int javaScore;
	private int dbmsScore;
	private int htmlScore;
	

	//생성자
	public Student(String name, int javaScore, int dbmsScore, int htmlScore) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
	}
	
	//메소드
	int getTotalScore() {
		return this.javaScore + this.dbmsScore + this.htmlScore;
	}
	
	int getAverageScore() {
		return (int) ((this.javaScore + this.dbmsScore + this.htmlScore) / 3);
	}
	
	

}
