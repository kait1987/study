package Project03;

import project01.Contact;

public class CompanyContact extends Contact{
	
	public CompanyContact(String name, String phonenumber, String email, String birthday, String address, String group, String grade ) {
		super(name, phonenumber, email, address, birthday, group);
		
		this.grade = grade;
	}
	
	
	

	
	
}
