package domain;

public class Board {
	
	// 필드 => 변수 / 객체 
	private int bno;		// 게시물번호
	private String btitle;	// 게시물제목
	private String bcontents;	// 게시물내용
	private String bwriter;	// 게시물 작성자
	private String bdate; // 게시물 작성일 
	private int bcount; // 게시물 조회수 
	
	// 생성자1 : 빈생성자 
	public Board() {}
	// 생성자2 : 모든 필드를 받는 생성자 
	public Board(int bno, String btitle, String bcontents, String bwriter, String bdate, int bcount) {
		this.bno = bno;
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bcount = bcount;
		
	}
	// 생성자 3 : 게시물 번호 [bno]를 제외한 생성 [db 삽입용]
	public Board(String btitle, String bcontents, String bwriter, String bdate, int bcount) {
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bcount = bcount;
	}

	// get , set : 필드에 저장/호출 역할
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontents() {
		return bcontents;
	}

	public void setBcontents(String bcontents) {
		this.bcontents = bcontents;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getBcount() {
		return bcount;
	}

	public void setBcount(int bcount) {
		this.bcount = bcount;
	}
	
	
	
	
	
	

}
