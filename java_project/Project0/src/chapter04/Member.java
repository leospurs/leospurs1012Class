package chapter04;

import java.util.Calendar;

public class Member {

	// 올해 년도 구하기
	final int THIS_YEAR = Calendar.getInstance().get(Calendar.YEAR);

	public void vaccinCheck(int birthYear) {
		// 나이연산	
		int age = THIS_YEAR - birthYear - 1;
		
		if (age < 15 || age >= 65) {
			System.out.println("예방접종이 가능합니다.");
		} else {
			System.out.println("무료접종 대상이 아닙니다.");
		}
	}

	public void CheckUp(int birthYear) {
		
		int age = THIS_YEAR - birthYear - 1;
		
		boolean checkUp = birthYear%2 == THIS_YEAR%2;

		if (age >= 20 && checkUp) {
			System.out.println("검진 대상입니다.");
		
			if (age >= 40) {
				System.out.println("무료 암검사가 가능합니다.");
			}
			if (THIS_YEAR % 2 == birthYear % 2) {
				System.out.println("올해 검진 대상입니다.");
			}

		} else {
			System.out.println("검진 대상이 아닙니다.");
		}

	}
	
	// 나이값을 계산해주는 메소드	
	int ageCal(int year) {
		return Calendar.getInstance().get(Calendar.YEAR) - year -1;
	}
	
	public static void main(String[] args) {
		Member member = new Member();
		
		member.vaccinCheck(2001);
		
		member.CheckUp(1955);
	}
}
