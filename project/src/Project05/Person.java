package Project05;


public class Person {
	
	private Phone homePhone;
	private Phone officePhone;
	private Phone[] phones;
	
	public Person() {
		phones = new Phone[2];
	}
	
	public Phone getPhone(int i) {
		if(i==0 || i== 1)
			return phones[i]
				
			return null;
					
	}

	public Phone getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(Phone homePhone) {
		this.homePhone = homePhone;
	}

	public Phone getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(Phone officePhone) {
		this.officePhone = officePhone;
	}

	public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	
}
