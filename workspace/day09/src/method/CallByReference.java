package method;
// 10번 : callbyreference
public class CallByReference {
	public static void main(String[] args) {
		//java의 기본 참조 타입 복사는 얕은 복사이다
		
		//1. 참조값과 call By Value
		int[] ar = {1, 2, 3};
//		System.out.println("메소드 호출 전 : " + ar[0]);
//		modifyArray(ar);
//		System.out.println("메소드 호출 후 : " + ar[0]);
//		
		System.out.println("array2 메소드 호출 전 : " + ar[0]);
		modifyArray2(ar);
		System.out.println("array2 메소드 호출 후 : " + ar[0]);
	}
	
	static void modifyArray(int[] ar) {
		ar[0] = 10; // 참조된 배열의 첫번째 값을 변경
	}
	// 배열의 참조값이 복사되어 전달되므로 메소드 내부에서 배열의 내용을 변경하면 원본 배열에도 영향을 미친다.
	
	static void modifyArray2(int[] ar) {
		ar = new int[] {10, 20, 30};
		
	}
	// 참조값이 복사되어 전달되므로 메소드 내부에서 새로운 객체를 참조하게 변경하면 원본객체는 바뀌지 않는다.
}
