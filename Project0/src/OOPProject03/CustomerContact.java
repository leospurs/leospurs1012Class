package OOPProject03;

public class CustomerContact extends Contact {

	// 변수 추가
	private String clientCompanyName;
	private String item;
	private String position;
	
	// 생성자 
public CustomerContact(String name, String phoneNum, String email, String address, String birthday, String group, String clientCompanyName, String item, String position)	{
		
		super(name, phoneNum, email, address, birthday, group);
		this.clientCompanyName = clientCompanyName;
		this.item = item;
		this.position = position;
		 
	}
	
	public CustomerContact(String name, String phoneNum, String email, String address, String birthday, String group) {
		super(name, phoneNum, email, address, birthday, group);
	}

	public String getClientCompanyName() {
		return clientCompanyName;
	}

	public void setClientCompanyName(String clientCompanyName) {
		this.clientCompanyName = clientCompanyName;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
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
		System.out.println("거래처회사 이름 : " + clientCompanyName);
		System.out.println("거래 품목 : " + item);
		System.out.println("직급 : " + position);
	}
	
	
}
