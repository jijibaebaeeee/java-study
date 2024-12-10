package teamTask;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Father fafa = new Father("형만");
		Mother mama = new Mother("미선");
		Brother bro = new Brother("짱구");
		Me me = new Me("짱아");
		
		
		String[] family = {"형만", "미선", "짱구", "짱아"};
		String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		String date = "", name="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요일을 입력하세요(예: 월요일) : ");
		
		date = sc.next();
		sc.nextLine();
		
		// 요일 입력받기
		while(true) {
			for(String check : week) {
				if(check.equals(date)) {
					break;
				}
			}
			System.out.println("다시 입력해주세요 : ");
			date = sc.next();
			sc.nextLine();
		}
		
		// 이름 입력받기
		System.out.println("이름을 입력하세요(예: 형만) : ");
		name = sc.next();
		sc.nextLine();
		
		while(true) {
			for(String check : family) {
				if(check.equals(name)) {
					break;
				}
			}
			System.out.println("다시 입력해주세요 : ");
			name = sc.next();
			sc.nextLine();
		}
		
		
		if(name == "형만") {
			fafa.dateCheck(date);
		}else if(name == "미선") {
			mama.dateCheck(date);
		}else if(name == "짱구") {
			bro.dateCheck(date);
		}else if(name == "짱아") {
			me.dateCheck(date);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
