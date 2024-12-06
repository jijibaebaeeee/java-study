package constantTest;

public class EnumTest {
	enum Day{ //고정된 값의 집합 like 특별한 데이터 유형(클래스)
		 SUNDAY(false), MONDAY(true), TUESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false);
		
		//필드
		boolean week;
		
		//생성자
		Day(boolean week){
			this.week = week;
		}
		
		//메소드
		boolean weekday() {
			return this.week;
		}
		
	}

	public static void main(String[] args) {
		Day today = Day.FRIDAY;
		
		System.out.println(today);
		
		
		//switch문을 사용한 열거형 상수 처리
		String result;
		switch(today) {
		case MONDAY:
			result = "월요일";
			break;
		case TUESDAY:
			result = "화요일";
			break;
		case FRIDAY:
			result = "금요일";
			break;
		default:
			result = "다른 요일";
			break;
		}
		System.out.println("오늘은 " + result + "입니다.");
		
		
		Day[] days = Day.values();
		System.out.println(days);
		for(Day data : days) {
			if(data == Day.SATURDAY) {
				continue;
			}else if(data == Day.SUNDAY) {
				continue;
			}else {
			System.out.println(data);
			}
		}
		
		
		
	}
}
