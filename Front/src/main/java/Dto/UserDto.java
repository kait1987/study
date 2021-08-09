package Dto;

public class UserDto {
	
	private int uno;
	private String uid;
	private String upassword;
	private String uname;
	private String uaddress;
	private String uemail;
	private int upoint;
	
	public UserDto() {}

	public UserDto(int uno, String uid, String upassword, String uname, String uaddress, String uemail, int upoint) {
		this.uno = uno;
		this.uid = uid;
		this.upassword = upassword;
		this.uname = uname;
		this.uaddress = uaddress;
		this.uemail = uemail;
		this.upoint = upoint;
	}
	
	public UserDto(String uid, String upassword, String uname, String uaddress, String uemail, int upoint) {
		this.uid = uid;
		this.upassword = upassword;
		this.uname = uname;
		this.uaddress = uaddress;
		this.uemail = uemail;
		this.upoint = upoint;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public int getUpoint() {
		return upoint;
	}

	public void setUpoint(int upoint) {
		this.upoint = upoint;
	}
	

}
