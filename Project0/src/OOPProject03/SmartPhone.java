package OOPProject03;

import java.util.Scanner;

public class SmartPhone {

	// 1 Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
	private Contact[] arr;
	private int num;
	public static Scanner scanner = new Scanner(System.in);

	// 2 배열에 인스턴스를 저장하고, 수정하고, 삭제, 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.

	// 생성자
	public SmartPhone(int size) {
		arr = new Contact[size];
		num = 0;
	}
	
	// 배열에 요소를 추가하는 메소드
	public void insert(Contact c) {
		arr[num++] = c;
	}
	
	
	public void insertContact(int select) {
		
		System.out.println("연락처 등록을 시작합니다.");
		System.out.println("------------------------");
	
		System.out.println("이름을 입력하세요.");
		System.out.print("> ");
		String name = scanner.nextLine();

		System.out.println("전화번호를 입력하세요.");
		System.out.print("> ");
		String phoneNum = scanner.nextLine();

		System.out.println("이메일을 입력하세요.");
		System.out.print("> ");
		String email = scanner.nextLine();

		System.out.println("주소를 입력하세요.");
		System.out.print("> ");
		String address = scanner.nextLine();

		System.out.println("생일을 입력하세요.");
		System.out.print("> ");
		String birthday = scanner.nextLine();

		System.out.println("그룹을 입력하세요.");
		System.out.print("> ");
		String group = scanner.nextLine();
		
		if(select == 1) { // 그룹이 회사일 경우
			
			System.out.println("회사이름을 입력하세요.");
			System.out.println("> ");
			String companyName = scanner.nextLine();
			
			System.out.println("부서 이름을 입력하세요.");
			System.out.println("> ");
			String depName = scanner.nextLine();
			
			System.out.println("직급을 입력하세요.");
			System.out.println("> ");
			String position = scanner.nextLine();
			
			insert(new CompanyContact(name, phoneNum, email, address, birthday, group, companyName, depName, position));
		}  else { // 그룹이 고객일 경우
			
			System.out.println("고객사이름을 입력하세요.");
			System.out.println("> ");
			String clientCompanyName = scanner.nextLine();
			
			System.out.println("거래 품목을 입력하세요.");
			System.out.println("> ");
			String item = scanner.nextLine();
			
			System.out.println("직급을 입력하세요.");
			System.out.println("> ");
			String position = scanner.nextLine();
			
			insert(new CustomerContact(name, phoneNum, email, address, birthday, group, clientCompanyName, item, position));
			
		}
		
		
		
		
		System.out.println("연락처가 등록되었습니다.");
	}

	// 전체 목록 출력 메소드
	public void showAllData() {
		System.out.println("연락처 리스트("+num+"명)");

		for (int i = 0; i < num; i++) {
			System.out.println("---------------------------");
			arr[i].printContact();
			
		}
		System.out.println("-------------------------------");
	}

	// 수정 메소드
	public void update() {
		System.out.println("수정하려는 이름을 입력해주세요.");
		System.out.println("> ");
		String name = scanner.nextLine();
		
		int index = searchIndex(name);

		
			
			if (index < 0) {
				System.out.println("찾으시는 정보가 존재하지 않습니다.");
			} else {
				
				System.out.println("새 이름을 입력하세요.");
				System.out.print("> ");
				String uname = scanner.nextLine();

				System.out.println("새 전화번호를 입력하세요.");
				System.out.print("> ");
				String phoneNum = scanner.nextLine();

				System.out.println("새 이메일을 입력하세요.");
				System.out.print("> ");
				String email = scanner.nextLine();

				System.out.println("새 주소를 입력하세요.");
				System.out.print("> ");
				String address = scanner.nextLine();

				System.out.println("새 생일을 입력하세요.");
				System.out.print("> ");
				String birthday = scanner.nextLine();

				System.out.println("새 그룹을 입력하세요.");
				System.out.print("> ");
				String group = scanner.nextLine();
				
				if(arr[index] instanceof CompanyContact) {
					
					CompanyContact company = (CompanyContact) arr[index];
					
					System.out.println("새 회사이름을 입력하세요.");
					System.out.println("> ");
					String companyName = scanner.nextLine();
					
					System.out.println("새 부서 이름을 입력하세요.");
					System.out.println("> ");
					String depName = scanner.nextLine();
					
					System.out.println("새 직급을 입력하세요.");
					System.out.println("> ");
					String position = scanner.nextLine();
					
					company.setName(uname);
					company.setPhoneNum(phoneNum);
					company.setEmail(email);
					company.setAddress(address);
					company.setBirthday(birthday);
					company.setGroup(group);
					company.setCompanyName(companyName);
					company.setDepName(depName);
					company.setPosition(position);
					
				} else {
					
					CustomerContact customer = (CustomerContact) arr[index];
					
					System.out.println("새 고객사이름을 입력하세요.");
					System.out.println("> ");
					String	clientCompanyName = scanner.nextLine();
					
					System.out.println("새 거래품목 이름을 입력하세요.");
					System.out.println("> ");
					String item = scanner.nextLine();
					
					System.out.println("새 직급을 입력하세요.");
					System.out.println("> ");
					String position = scanner.nextLine();
					
					customer.setName(uname);
					customer.setPhoneNum(phoneNum);
					customer.setEmail(email);
					customer.setAddress(address);
					customer.setBirthday(birthday);
					customer.setGroup(group);
					customer.setClientCompanyName(clientCompanyName);
					customer.setItem(item);
					customer.setPosition(position);
					
				}
				
				
				
				System.out.println("정보가 수정되었습니다.");
			}
				
			
		}

	

	// 삭제 메소드
	public void delete() {
		System.out.println("삭제하고자 하는 사용자의 이름을 입력해 주세요.");
		System.out.println("> ");
		String name = scanner.nextLine();

		int index = searchIndex(name);

		if (index > -1) {
			for (int i = index; i < num - 1; i++) {
				arr[i] = arr[i + 1];
			}
			num--;

			System.out.println("데이터가 삭제되었습니다.");
		} else {
			System.out.println("해당 사용자 이름은 존재하지 않습니다.");
		}
	}

	// 이름으로 배열의 index 찾아 index 값을 반환하는 메소드
	private int searchIndex(String name) {

		int index = -1;

		for (int i = 0; i < num; i++) {
			if (arr[i].getName().equals(name)) {
				index = i;
				break;
			}
		}

		return index;

	}
}
