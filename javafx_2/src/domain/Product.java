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
	
	// �� ������
	public Product () {}
	
	// ��� �ʵ带 �����ϴ� ������
	
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
	
	// ��ǰ��ȣ�� ������ ������ 
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
