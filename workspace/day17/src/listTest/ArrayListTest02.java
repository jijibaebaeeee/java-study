package listTest;

class MyClass<T>{
	//필드
	T data; // List<data> or ArrayList<food> 이런 식으로 확장성 올려주는 필드 

	//생성자
	public MyClass(T data) {
		super();
		this.data = data;
	}
	
	//메소드
	void printData() {
		System.out.println(data);
	}
	
	
}


public class ArrayListTest02 {
	public static void main(String[] args) {
		MyClass mc1 = new MyClass("신기하다");
		MyClass<Double> mc2 = new MyClass<>(2.0000000000001);
		System.out.println(mc1);
		mc1.printData();
		mc2.printData();
	}
}
