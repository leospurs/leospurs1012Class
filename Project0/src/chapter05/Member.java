package chapter05;

public class Member {
	
//	① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	String name;
	String phoneNumber;
	String subject;
	int grade;
	String email;
	String birthday;
	String address;
	
//	② 위에서 정의한 정보를 출력하는 메소드 정의
	public void printAll() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + subject);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
		System.out.println("생일 : " + birthday);
		System.out.println("주소 : " + address);
	}

//	③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
	public Member(String name,String phoneNumber, String subject, int grade, String email, String birthday, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.subject = subject;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}
	
	public Member(String name,String phoneNumber, String subject, int grade, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.subject = subject;
		this.grade = grade;
		this.email = email;	
	}
	
	
//	④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
	public static void main(String[] args) {
		Member member = new Member("손흥민","01022222222","축구학과",3,"son@gmail.com","921008","북런던");
		
		member.printAll();
		
		Member member1 = new Member("손흥민","01022222222","축구학과",3,"son@gmail.com");
		
		member1.printAll();
		
		
	}
	
}
