package Project03;

import project01.Contact;

public class CompanyContact extends Contact{
	
	
	private String companyname;
	private String grade;
	private String divisionname;
	
	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday, String group, String companyname, String grade, String divisionname) {
		super(companyname, phoneNumber, email, address, birthday, group);
		this.companyname = companyname;
		this.grade = grade;
		this.divisionname = divisionname;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getPhoeNumber() {
		// TODO Auto-generated method stub
		return super.getPhoeNumber();
	}

	@Override
	public void setPhoeNumber(String phoenumber) {
		// TODO Auto-generated method stub
		super.setPhoeNumber(phoenumber);
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		super.setAddress(address);
	}

	@Override
	public String getBirthday() {
		// TODO Auto-generated method stub
		return super.getBirthday();
	}

	@Override
	public void setBirthday(String birthday) {
		// TODO Auto-generated method stub
		super.setBirthday(birthday);
	}

	@Override
	public String getGroup() {
		// TODO Auto-generated method stub
		return super.getGroup();
	}

	@Override
	public void setGroup(String group) {
		// TODO Auto-generated method stub
		super.setGroup(group);
	}

	public String getDivisionname() {
		return divisionname;
	}

	public void setDivisionname(String divisionname) {
		this.divisionname = divisionname;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getgrade() {
		return grade;
	}

	public void setgrade(String grade) {
		this.grade = grade;
	}
	
	
	// 연락처 출력 메소드
		private void printinfo() {
			System.out.println("----------------------------------------------");
			System.out.println("이름 : "+ getName());
			System.out.println("전화번호 : "+ getPhoeNumber() );
			System.out.println("이메일 : "+ getEmail() );
			System.out.println("주소 : "+ getAddress() );
			System.out.println("생일 : "+ getBirthday() );
			System.out.println("그룹 : " + getGroup() );
	
	//  추가		
			System.out.println("회사이름 : " + getCompanyname() );
			System.out.println("부서이름 : " + getDivisionname() );
			System.out.println("직급 : " + getgrade() );
			System.out.println("----------------------------------------------\n");
			

		}
	
	

	
	
}
