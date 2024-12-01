package task;

public class Task02 {
	public static void main(String[] args) {
		//int, long, double, float, boolean, char
		//1. 정수(int) -> 모든 자료형 자동형변환 가능여부 확인
		int num = 40;
		long numl = 40L;
		double numd = 40.4;
		float numf = 40.4f;
		boolean b = true;
		char c = 'A';
		
		System.out.println(numl + num);
		System.out.println(numd + num);
		System.out.println(numf + num);
//		System.out.println(b + num);
		System.out.println(c + num);
	
		
		
		//2. 정수(long) -> 모든 자료형 자동형변환 가능여부 확인
		System.out.println(num + numl);
		System.out.println(numd + numl);
		System.out.println(numf + numl);
//		System.out.println(b + numl);
		System.out.println(c + numl);
		
		
		//3. 실수(double) -> 모든 자료형 자동형변환 가능여부 확인
		System.out.println(num + numd);
		System.out.println(numl + numd);
		System.out.println(numf + numd);
//		System.out.println(b + numd);
		System.out.println(c + numd);

		
		//4. 실수(float) -> 모든 자료형 자동형변환 가능여부 확인
		System.out.println(num + numf);
		System.out.println(numl + numf);
		System.out.println(numd + numf);
//		System.out.println(b + numf);
		System.out.println(c + numf);
		
		
		//5. 논리형 (boolean)  -> 모든 자료형 자동형변환 가능여부 확인
//		System.out.println(num + b);
//		System.out.println(numl + b);
//		System.out.println(numd + b);
//		System.out.println(numf + b);
//		System.out.println(c + b);
		
		
		//6. 문자형(char) -> 모든 자료형 자동형변환 가능여부 확인
		System.out.println(num + c);
		System.out.println(numl + c);
		System.out.println(numd + c);
		System.out.println(numf + c);
//		System.out.println(b + c);
	
	}
}
