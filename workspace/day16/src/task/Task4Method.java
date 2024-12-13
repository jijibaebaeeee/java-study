package task;
import java.util.Scanner;
public class Task4Method {
	int num;
	
	void mapping(Scanner sc) throws TaskException{
		System.out.println("정수 입력 : ");
		//Returns true if the next token in this scanner's input can be interpreted as an int value 
		//in the default radix using the nextInt() method. 
		//The scanner does not advance past any input.
		if(!(sc.hasNextInt())) { // <-- 정수를 입력받지 않았다면!
			
			throw new TaskException("숫자가 아닌 문자열이 입력되었습니다.");
			
		}
		num = sc.nextInt();

		System.out.println(num);
//		sc.next();
				
		if((num % 3 == 0 && num % 5 == 0)) {
			System.out.println("Fizz");
		}else if(num % 5 == 0) {
			System.out.println("Buzz");
		}else if(num % 3 == 0) {
			System.out.println("FizzBuzz");
		}else
			System.out.println(num);
	}

}
