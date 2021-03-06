package project01;

public class Contact {
	
	/*
	 * 저장정보 변수 선언
	 */
	
	private String name;
	private String phoeNumber;
	private String email;
	private String address;
	private String birthday;
	private String group;
	 
	
	// 생성자
	public Contact(String name, String phoeNumber, String email, String address, String birthday, String group) {
		super();
		this.name = name;
		this.phoeNumber = phoeNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}
	
	// 연락처 출력 메소드
	private void printinfo() {
		System.out.println("이름 : "+ this.name);
		System.out.println("전화번호 : "+ this.phoeNumber);
		System.out.println("이메일 : "+ this.email);
		System.out.println("주소 : "+ this.address);
		System.out.println("생일 : "+ this.birthday);
		System.out.println("그룹 : "+ this.group);
		

	}
	
	
	


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoeNumber() {
		return phoeNumber;
	}

	public void setPhoeNumber(String phoenumber) {
		this.phoeNumber = phoenumber;
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
	

}
