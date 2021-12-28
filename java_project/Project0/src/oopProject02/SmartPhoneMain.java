package oopProject02;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
//		main()메소드를아래의요구조건을정의해봅니다.
//		1 SmartPhone 클래스의 인스턴스를 생성합니다.
//		2 사용자로부터 입력을 받아 Contact 인스턴스를 생성해서 SmartPhone 클래스의 인스턴스가 가지고 있는 배열에 추가합니다. 
//		3 10번 반복해서 배열에 추가합니다.
//		4 배열의 모든 요소를 출력합니다.
//		5 배열의 모든 요소를 검색합니다.
//		6 배열의 요소를 삭제해 봅시다.
//		7 배열의 요소를 수정해 봅시다.
		
		SmartPhone sPhone = new SmartPhone(10);
		Scanner scanner = new Scanner(System.in);
		
		

		while(true) {
			showMenu();
			
			int select = Integer.parseInt(sPhone.scanner.nextLine());
			
			switch(select) {
			
			case 1:
				System.out.println("연락처를 등록합니다.");
				sPhone.insertContact();
				break;
			case 2:
				System.out.println("전체 목록입니다.");
				sPhone.showAllData();
				break;
			case 3:
				System.out.println("연락처를 수정합니다.");
				sPhone.update();
				break;
			case 4:
				System.out.println("연락처를 삭제합니다.");
				sPhone.delete();
				break;
			case 5 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			
			}
		}
				
				
				
				
				
	}
	
	public static void showMenu() {
		System.out.println("연락처 관리 프로그램");
		System.out.println("------------------------");
		System.out.println("1. 연락처 등록하기");
		System.out.println("2. 전체 목록 보기");
		System.out.println("3. 연락처 수정하기");
		System.out.println("4. 연락처 삭제하기");
		System.out.println("5. 프로그램 종료");
		System.out.println("------------------------");
		System.out.println("메뉴 번호를 입력해 주세요.");
		System.out.println("> ");
	}

}
