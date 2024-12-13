package wrapperTest;

public class WrapperTest01 {
	public static void main(String[] args) {
		//기본 자료형 -> Wrapper 클래스(박싱)
		int num1 = 10;
		System.out.println(num1);
		Integer iNum1 = Integer.valueOf(num1);
		System.out.println(iNum1);
		
		//오토 언박싱 (객체 + 정수) 안되자나! 근데 가능해
		System.out.println(iNum1 + 10);
		
		
		
		//Wrapper 클래스 -> 기본자료형(언박싱)
		int unNum1 = iNum1.intValue();
		System.out.println(unNum1);
		
		//자동 박싱(AutoBoxing)
		double num2 = 1.1;
		Double dNum = num2;
		System.out.println(dNum);
		
		
		
		//갑자기 궁금한것. 나중에 문서로 찾아보기
		//double dou = 10;
		// -> 이것이 왜 자동형변환이 되는지 찾아봐
		
		//자동 언ㅂㄱ싱(AutoUnBoxing)
		double unNum2 = dNum; // .doubleValue() 가 없는데도 대입이 되네용?
		System.out.println(unNum2);
		
	}

}
