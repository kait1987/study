package new1;

public class SmartPhone {
	
//	이름
//	전화번호
//	이메일
//	주소 
//	생일
//	그룹
	
	String name = "박주성";
	String number = "010-0000-1111";
	String email = "asdf@adf.asdf";
	String address = "서울";
	String birthday = "2021-09-06";
	String group = "친구";
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
	
	public void showinfo() {
		System.out.println("이름 : "+ this.name);
		System.out.println("전화번호 : "+ this.number);
		System.out.println("이메일 : " + this.email);
		System.out.println("주소 : "+ this.address);
		System.out.println("생일 : " + this.birthday);
		System.out.println("그룹 : + " + this.group);
	}
	
	
	
	
	
	
}
