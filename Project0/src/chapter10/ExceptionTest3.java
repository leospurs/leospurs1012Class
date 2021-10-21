package chapter10;

import java.util.Scanner;

public class ExceptionTest3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("피제수를 입력해주세요");
		int num1 = sc.nextInt();
		System.out.println("제수를 입력해 주세요.");
		int num2 = sc.nextInt();

		int result = 0;
		
		
		try {
			result = num1 / num2;
			System.out.println("나눗셈이 정상적으로 처리되었습니다.");
			System.out.println("나눗셈 결과는 " + result + "입니다.");
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눗셈 할 수 없습니다.");
			System.out.println(e.getMessage());
		} 
		catch(Exception e) { // 정확한 예외의 케이스를 모를때 마지막에 가장 상위의 예외처리 클래스를 호출해준다.
			System.out.println("오류발생");
		}
		
		
		System.out.println("프로그램을 종료합니다.");
		
	}
}
