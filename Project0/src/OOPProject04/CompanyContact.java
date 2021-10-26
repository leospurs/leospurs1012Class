package OOPProject04;

public class CompanyContact extends Contact {

	// 변수 추가
	private String companyName; //  회사이름
	private String depName; // 부서 이름
	private String position; // 직급
	
	// 생성자
	public CompanyContact(String name, String phoneNum, String email, String address, String birthday, String group, String companyName, String depName, String position)	{
		
		super(name, phoneNum, email, address, birthday, group);
		this.companyName = companyName;
		this.depName = depName;
		this.position = position;
		 
	}
	
	public CompanyContact(String name, String phoneNum, String email, String address, String birthday, String group) {
		super(name, phoneNum, email, address, birthday, group);
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public void printContact() {
		super.printContact();
		System.out.println("회사이름 : " + companyName);
		System.out.println("부서이름 : " + depName);
		System.out.println("직급 : " + position);
	}
}
