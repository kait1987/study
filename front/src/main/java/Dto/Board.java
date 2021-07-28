package Dto;

public class Board {
	
	private int bno;
	private String btitle;
	private String bcontents;
	private String bwriter;
	private String bdate;
	private int bcount;
	
	
	
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Board(int bno, String btitle, String bcontents, String bwriter, String bdate, int bcount) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bcount = bcount;
	}
		
		
		public Board( String btitle, String bcontents, String bwriter, String bdate, int bcount) {
			super();
			this.btitle = btitle;
			this.bcontents = bcontents;
			this.bwriter = bwriter;
			this.bdate = bdate;
			this.bcount = bcount;
	
	}
	public final int getBno() {
		return bno;
	}
	public final void setBno(int bno) {
		this.bno = bno;
	}
	public final String getBtitle() {
		return btitle;
	}
	public final void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public final String getBcontents() {
		return bcontents;
	}
	public final void setBcontents(String bcontents) {
		this.bcontents = bcontents;
	}
	public final String getBwriter() {
		return bwriter;
	}
	public final void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public final String getBdate() {
		return bdate;
	}
	public final void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public final int getBcount() {
		return bcount;
	}
	public final void setBcount(int bcount) {
		this.bcount = bcount;
	}
	
	

} 
