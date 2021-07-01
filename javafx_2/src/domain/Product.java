package domain;

public class Product {
	
	private int pno ;		
	private String pname;		
	private String pcontents;	
	private int pprice;		
	private int pstock;		
	private String pcategory;	 
	private int pactivation;
	private int pquantity;
	private String pimage;
	
	// 빈 생성자
	public Product () {}
	
	// 모든 필드를 저장하는 생성자
	
	public Product(int pno, String pname, String pcontents, int pprice, int pstock, String pcategory,
					int pactivation, int pquantity,String pimage  ) {
		this.pno = pno;
		this.pname = pname;
		this.pcontents = pcontents;
		this.pprice = pprice;
		this.pstock = pstock;
		this.pcategory = pcategory;
		this.pactivation = pactivation;
		this.pquantity = pquantity;
		this.pimage = pimage;
		
	}
	
	// 제품번호를 제외한 생성자 
		public Product( String pname, String pcontents, int pprice, int pstock, String pcategory,
				int pactivation, int pquantity,String pimage  ) {
	
	this.pname = pname;
	this.pcontents = pcontents;
	this.pprice = pprice;
	this.pstock = pstock;
	this.pcategory = pcategory;
	this.pactivation = pactivation;
	this.pquantity = pquantity;
	this.pimage = pimage;
		
	}
}
