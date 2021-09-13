package Project03;

import project01.Contact;

public class CustomerContact extends Contact {

	
	public CustomerContact(String name, String phonenumber, String email, String address, String birthday, String group, String grade, String companyname) {
		super(name, phonenumber, email, address, birthday, group);
		this.companyname = companyname;
		this.grade = grade;
		
	}
	public String addStr() {
		String result = super.resultStr();
		result
	}
	
	
}
