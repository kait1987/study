package Dto;

public class Reply {

	private int rno;
	private int bno;
	private	String rwriter;
	private String rcontents;
	private String rdate;
	
	public Reply() {
		// TODO Auto-generated constructor stub
	}

	public Reply(int rno, int bno, String rwriter, String rcontents, String rdate) {
		
		this.rno = rno;
		this.bno = bno;
		this.rwriter = rwriter;
		this.rcontents = rcontents;
		this.rdate = rdate;
	}
	
	public Reply( int bno, String rwriter, String rcontents, String rdate) {
		
		this.rno = rno;
		this.bno = bno;
		this.rwriter = rwriter;
		this.rcontents = rcontents;
		this.rdate = rdate;
	}

	public final int getRno() {
		return rno;
	}

	public final void setRno(int rno) {
		this.rno = rno;
	}

	public final int getBno() {
		return bno;
	}

	public final void setBno(int bno) {
		this.bno = bno;
	}

	public final String getRwriter() {
		return rwriter;
	}

	public final void setRwriter(String rwriter) {
		this.rwriter = rwriter;
	}

	public final String getRcontents() {
		return rcontents;
	}

	public final void setRcontents(String rcontents) {
		this.rcontents = rcontents;
	}

	public final String getRdate() {
		return rdate;
	}

	public final void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
	
}
