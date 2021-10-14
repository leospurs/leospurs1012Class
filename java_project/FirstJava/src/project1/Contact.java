package project1;

import java.util.Scanner;


public class Contact {
	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private String birthday;
	private String group;
	private Scanner scanner;
	
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	public Contact() {

		this.setName(name);
		this.setPhoneNum(phoneNum);
		this.setEmail(email);
		this.setAddress(address);
		this.setBirthday(birthday);
		this.setGroup(group);
	}
	
	public void printAll(Contact contact) {
		
		System.out.println("=============================");
		System.out.println(contact.getName() + " 님의 정보");
		System.out.println("=============================");
		System.out.println();
		System.out.println("전화번호");
		System.out.println("------------------------------");
		System.out.println(contact.getPhoneNum());
		System.out.println("------------------------------");
		System.out.println("이메일");
				
		System.out.println(contact.getEmail());
		System.out.println("주소");
		System.out.println(contact.getAddress());
		System.out.println("생일" );
		System.out.println(contact.getBirthday());
		System.out.println("그룹");
		System.out.println(contact.getGroup());
		System.out.println("=============================");
	}
	
	public void insert(Contact contact, Scanner scanner) {
		System.out.println("이름을 입력하세요.");
		System.out.print("> ");
		contact.setName(scanner.nextLine());
		
		System.out.println("전화번호를 입력하세요.");
		System.out.print("> ");
		contact.setPhoneNum(scanner.nextLine());
		
		System.out.println("이메일을 입력하세요.");
		System.out.print("> ");
		contact.setEmail(scanner.nextLine());
		
		System.out.println("주소를 입력하세요.");
		System.out.print("> ");
		contact.setAddress(scanner.nextLine());
		
		System.out.println("생일을 입력하세요.");
		System.out.print("> ");
		contact.setBirthday(scanner.nextLine());
		
		System.out.println("그룹을 입력하세요.");
		System.out.print("> ");
		contact.setGroup(scanner.nextLine());
		
	}

	
	// main 메소드를 정의합니다.
	public static void main(String[] args) {
		
		// 연락처 데이터를 저장하는 인스턴스를 생성합니다.
		Contact contact = new Contact();
		Scanner scanner = new Scanner(System.in);
		// 변수값을 반환하는 각각의 메소드를호출 해서 각 데이터를 출력문으로 출력합니다.
		System.out.println("이름: " + contact.getName());
		System.out.println("전화번호: " + contact.getPhoneNum());
		System.out.println("이메일: " + contact.getEmail());
		System.out.println("주소: " + contact.getAddress());
		System.out.println("생일: " + contact.getBirthday());
		System.out.println("그룹: " + contact.getGroup());
		
		// 생선된 인스턴스의 정보 출력 메소드를 호출한다. -> 정보 출력 메소드 생성	
		contact.printAll(contact);
		// 인스턴스의 각 변수에 값을 바꾸는 메소드를이용해서 데이터를수정한다. -> 값 변경 메소드 생성
		contact.insert(contact, scanner);
		// 인스턴스의 출력 메소드를 다시실행합니다.
		contact.printAll(contact);
		
	}

}
