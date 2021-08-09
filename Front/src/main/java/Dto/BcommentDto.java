package Dto;

public class BcommentDto {
	
	
	private int	bcno; 
	private int	nno;
	private String bccontents;
	private String bcwriter;
	private String bcdate;
			
	public BcommentDto() { }

	public BcommentDto(int bcno, int nno, String bccontents, String bcwriter, String bcdate) {
		this.bcno = bcno;
		this.nno = nno;
		this.bccontents = bccontents;
		this.bcwriter = bcwriter;
		this.bcdate = bcdate;
	}
	
	// 
	public BcommentDto( int nno, String bccontents, String bcwriter) {
		this.nno = nno;
		this.bccontents = bccontents;
		this.bcwriter = bcwriter;
	}

	public int getBcno() {
		return bcno;
	}

	public void setBcno(int bcno) {
		this.bcno = bcno;
	}

	public int getNno() {
		return nno;
	}

	public void setNno(int nno) {
		this.nno = nno;
	}

	public String getBccontents() {
		return bccontents;
	}

	public void setBccontents(String bccontents) {
		this.bccontents = bccontents;
	}

	public String getBcwriter() {
		return bcwriter;
	}

	public void setBcwriter(String bcwriter) {
		this.bcwriter = bcwriter;
	}

	public String getBcdate() {
		return bcdate;
	}

	public void setBcdate(String bcdate) {
		this.bcdate = bcdate;
	}
	
	// get. set
	
		

}
