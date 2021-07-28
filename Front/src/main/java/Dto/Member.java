package Dto;

public class Member {
	
	// 1. 필드
	private int mno;
	private String mid;
	private String mpassword;
	private String mname;
	private String memail;
	private String mphone;
	private String maddress;
	
		
	
	// 2. 생성자
	public Member () {}

	// 모든 필드를 받는 생성자
	public Member(int mno, String mid, String mpassword, String mname, String memail, String mphone, String maddress) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
		this.memail = memail;
		this.mphone = mphone;
		this.maddress = maddress;
	}


// 회원번호 없는 생성자[ 회원가입 컨트롤]
	public Member(String mid, String mpassword, String mname, String memail, String mphone, String maddress) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
		this.memail = memail;
		this.mphone = mphone;
		this.maddress = maddress;
	}



	public final int getMno() {
		return mno;
	}



	public final void setMno(int mno) {
		this.mno = mno;
	}



	public final String getMid() {
		return mid;
	}



	public final void setMid(String mid) {
		this.mid = mid;
	}



	public final String getMpassword() {
		return mpassword;
	}



	public final void setMpasssord(String mpassword) {
		this.mpassword = mpassword;
	}



	public final String getMname() {
		return mname;
	}



	public final void setMname(String mname) {
		this.mname = mname;
	}



	public final String getMemail() {
		return memail;
	}



	public final void setMemail(String memail) {
		this.memail = memail;
	}



	public final String getMphone() {
		return mphone;
	}



	public final void setMphone(String mphone) {
		this.mphone = mphone;
	}



	public final String getMaddress() {
		return maddress;
	}



	public final void setMaddress(String maddress) {
		this.maddress = maddress;
	}
	
	
	
	// 3. 메소드[ get, set 등]
	
}
