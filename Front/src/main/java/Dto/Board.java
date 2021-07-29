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
		this.bno = bno;
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bcount = bcount;
	}	
	// DB에 저장할때 [게시물번호는 제외]
	public Board( String btitle, String bcontents, String bwriter, String bdate, int bcount) {
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bcount = bcount;
	}
		
		//DB에 수정할때 [게시물번호, 날짜, 조회수 제외]
		public Board( String btitle, String bcontents) {
			this.btitle = btitle;
			this.bcontents = bcontents;
				
			//private : 혀ㅑㄴ재 클래스에서만 호출 가능
			// get, set, 메소드:
				// 외부로 부터 private 필드 접근
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
