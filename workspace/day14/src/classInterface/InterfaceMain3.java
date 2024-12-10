package classInterface;
//12번 : 인터페이스의 다중 상속
//객체가 여러 역할을 수행해야할 때
//모듈화와 확장성을 고려할 때
//재사용성과 중복 방지

interface InterfaceD{
	void methodD();
}

interface InterfaceE{
	void methodE();
}

interface InterfaceC extends InterfaceD, InterfaceE{
	void methodC();
}

class ClassA implements InterfaceC{

	@Override
	public void methodD() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodE() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceMain3 {

}
