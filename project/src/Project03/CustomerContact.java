package Project03;

import java.util.Scanner;

import project01.Contact;

public class CustomerContact extends Contact {

	private String customername;
	private String item;
	
	public CustomerContact(String name, String phonenumber, String email, String address, String birthday, String group, String grade, String customername) {
		super(name, phonenumber, email, address, birthday, group);
		this.customername = customername;
		this.item = item;
				
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

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	
	// ????????? ?????? ?????????
			private void printinfo() {
				System.out.println("----------------------------------------------");
				System.out.println("?????? : "+ getName());
				System.out.println("???????????? : "+ getPhoeNumber() );
				System.out.println("????????? : "+ getEmail() );
				System.out.println("?????? : "+ getAddress() );
				System.out.println("?????? : "+ getBirthday() );
				System.out.println("?????? : " + getGroup() );
				
	// ??????
				System.out.println("??????????????? : " + getCustomername() );
				System.out.println("????????????: " + getItem() );
				System.out.println("----------------------------------------------\n");
				
	
	}
	
	
	
			
			
}
