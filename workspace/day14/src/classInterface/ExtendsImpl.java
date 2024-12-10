package classInterface;
//13번 : 상속과 구현은 별개이다

class ParentP{
	void parentMethod() {
		System.out.println("부모 클래스의 메소드");
	}
}

interface InterfaceG{
	void methodG();
}

interface InterfaceH{
	void methodH();
}


class ChildP extends ParentP implements InterfaceG, InterfaceH{

	@Override
	public void methodG() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodH() {
		// TODO Auto-generated method stub
		
	}
	
}


public class ExtendsImpl {

}
