package exam07;

import java.util.Calendar;

public class Person {

	// 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
	String name; 		// 이름
	String juminNum; 	// 주민번호(14자리, - 제외)
	final static int THIS_YEAR = Calendar.getInstance().get(Calendar.YEAR);
	
	
	// 생성자 정의
	public Person(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
		
	}

	// 인사하는 메소드를 정의해봅시다.
	// - “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
	public void sayHello() {

		System.out.println("안녕하세요 저는 " + name + "입니다. " + ageCal() + " 살 입니다.");
	}

	
	// 나이 계산 메소드
	public int ageCal() {
		 	
		int birthYear = Integer.parseInt(juminNum.substring(0,2)); // 주민번호 처음 두자리 수
		int num = Integer.parseInt(juminNum.substring(7,8));
		
		
		if(num == 1 || num == 2) { // 1,2 는 1900년대 생
			
			return THIS_YEAR - ((1900 + birthYear) + 1);
		} else if(num == 3 || num == 4) {
			
			return THIS_YEAR - ((2000 + birthYear) + 1);
		} else {
			
			return -1;	
		}
		
		
	}
	
	
}