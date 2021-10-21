package OOPProject;

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
	
	public SmartPhone()	 {
		this(10);
	}

	// 정보 입력 및 저장 메소드
	public void insert(Contact c) {
		arr[num++] = c;
	}
	
	
	public void insertContact() {

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

		insert(new Contact(name, phoneNum, email, address, birthday, group));
		System.out.println("연락처가 등록되었습니다.");
	}

	// 전체 출력 메소드
	public void showAllData() {
		System.out.println("연락처 정보 리스트");
		System.out.println("-------------------------------");
		System.out.println("이름 \t전화번호 \t 이메일 \t 주소 \t 생일 \t 그룹");
		System.out.println("-------------------------------");

		for (int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------------------------");
	}

	// 수정 메소드
	public void update() {
		System.out.println("수정하려는 이름을 입력해주세요.");
		System.out.println("> ");
		String searchName = scanner.nextLine();

		for (int i = 0; i < num; i++) {
			
			if (searchName.equals(arr[i].getName())) {
				num--;
				System.out.println("새 이름을 입력하세요.");
				System.out.print("> ");
				String name = scanner.nextLine();

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
				
				
				
			} else {
				System.out.println("해당 사용자 이름은 존재하지 않습니다.");
			}
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
