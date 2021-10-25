package OOPProject03;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		
		SmartPhone sPhone = new SmartPhone(10);
		Scanner scanner = new Scanner(System.in);
		
		

		while(true) {
			showMenu();
			
			int select = Integer.parseInt(sPhone.scanner.nextLine());
			
			switch(select) {
			
			case 1:case 2:
				System.out.println("연락처를 등록합니다.");
				sPhone.insertContact(select);
				break;
			case 3:
				System.out.println("전체 목록입니다.");
				sPhone.showAllData();
				break;
			case 4:
				System.out.println("연락처를 수정합니다.");
				sPhone.update();
				break;
			case 5:
				System.out.println("연락처를 삭제합니다.");
				sPhone.delete();
				break;
			case 6 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			
			}
		}
				
				
				
				
				
	}
	
	public static void showMenu() {
		System.out.println("연락처 관리 프로그램");
		System.out.println("------------------------");
		System.out.println("1. 연락처 등록하기(회사)");
		System.out.println("2. 연락처 등록하기(고객)");
		System.out.println("3. 전체 목록 보기");
		System.out.println("4. 연락처 수정하기");
		System.out.println("5. 연락처 삭제하기");
		System.out.println("6. 프로그램 종료");
		System.out.println("------------------------");
		System.out.println("메뉴 번호를 입력해 주세요.");
		System.out.println("> ");
	}

}
