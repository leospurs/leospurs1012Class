package exam09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginId {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

//		1.콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다.
//
//		  ①사용자 예외 클래스를 정의해서 예외를 발생 시켜 봅시다.
//
//		  ②예외 클래스 이름은 BadIdInputException이라고 정의합시다.


		System.out.println("==================문제1번===============");
		
		System.out.println("아이디를 입력해 주세요.");
		System.out.println("> ");

		try {
			String id = getId();
		} catch (BadIdInputException b) {
			System.out.println(b.getMessage());
			b.printStackTrace();
		}

		System.out.println("아이디가 정상적으로 입력되었습니다.");
		
		
		System.out.println("==================문제2번===============");
		
//		2.Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다. 
//		이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다.		
		
		System.out.println("출생 연도를 4자리를 입력해주세요.");
		System.out.println("> ");
		
		try {
			int birthYear = scanner.nextInt();
			System.out.println("출생년도는 " + birthYear + "년 입니다.");
		} catch (InputMismatchException i) {
			System.out.println("잘못된 형식입니다.");
		}
		
	
	}

	public static String getId() throws BadIdInputException {

		
		String id = scanner.nextLine();

		String pattern = "^[0-9a-zA-Z]*$";

		if (!(id.matches(pattern))) {
			BadIdInputException b = new BadIdInputException();

			throw b;
		}
		return id;
	}

}
