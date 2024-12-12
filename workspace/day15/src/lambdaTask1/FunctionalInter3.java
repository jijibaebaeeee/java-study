package lambdaTask1;


public interface FunctionalInter3 {
//	1. 2개의 정수를 매개변수로 받아서 곱한 결과를 반환하는 메소드(람다식 이용)
//	FunctionalInter3 이용하기
//	- 새로운 함수형 인터페이스(FunctionalInter4)를 만들고
//	- 2개의 문자열을 매개변수로 전달받는 추상 메소드(combineString)를 선언한다.
//	- 람다식을 이용하여 2개의 문자열을 연결하여 출력한다.
	
	public static void main(String[] args) {
		FunctionalInter4 fi4 = new FunctionalInter4() {

			@Override
			public String combineString(String line1, String line2) {
				return line1 + line2;
			}
			
		};
		
		//람다식 바꾸기
		FunctionalInter4 fi = (line1, line2) -> line1 + line2;
		System.out.println(fi);
		//람다식 출력
		System.out.println(fi.combineString("배지수 ", "집가자"));
	}


}
