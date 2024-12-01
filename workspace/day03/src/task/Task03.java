package task;

public class Task03 {
	public static void main(String[] args) {
		//int, long, double, float, boolean, char
		//1. 정수(int) -> 모든 자료형 강제형변환 가능여부 확인
		int num = 40;
		System.out.println((long)num);
		System.out.println((double)num);
		System.out.println((float)num);
//		System.out.println((boolean)num);
		System.out.println((char)num);
		
		//2. 정수(long) -> 모든 자료형 강제형변환 가능여부 확인
		long numl = 40L;
		System.out.println((long)numl);
		System.out.println((double)numl);
		System.out.println((float)numl);
//		System.out.println((boolean)numl);
		System.out.println((char)numl);
		
		//3. 실수(double) -> 모든 자료형 강제형변환 가능여부 확인
		double numd = 40.4;
		System.out.println((long)numd);
		System.out.println((double)numd);
		System.out.println((float)numd);
//		System.out.println((boolean)numd);
		System.out.println((char)numd);
		
		//4. 실수(float) -> 모든 자료형 강제형변환 가능여부 확인
		float numf = 40.4f;
		System.out.println((long)numf);
		System.out.println((double)numf);
		System.out.println((float)numf);
//		System.out.println((boolean)numd);
		System.out.println((char)numf);
		
		//5. 논리형 (boolean) -> 모든 자료형 강제형변환 가능여부 확인
		boolean b = true;
//		System.out.println((int)b);
//		System.out.println((long)b);
//		System.out.println((double)b);
//		System.out.println((float)b);
//		System.out.println((char)b);
		
		
		//6. 문자형(char) -> 모든 자료형 강제형변환 가능여부 확인
		char c = 'C';
		System.out.println((int)c);
		System.out.println((long)c);
		System.out.println((double)c);
		System.out.println((float)c);
//		System.out.println((boolean)c);
		
	}
}
