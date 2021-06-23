package domain;



public class Member {
	
	
	private String id;
	private String pasaword;
	private String name;
	private String email;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Member(String id, String password, String name, String email) {
		this.id = id;
		this.pasaword = password;
		this.name = name;
		this.email = email;
		
	}
	public String getID() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
