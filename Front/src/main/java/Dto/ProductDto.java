package Dto;

public class ProductDto {

	private int product_code;
	private String product_name ;
	private String product_comment;
	private int product_price;
	private String product_manufacturer;
	private String product_category ;
	private int product_stock ;
	private String product_releasedate ;
	private String product_img ;
	private int product_active ;
    private int product_salesrate;
    private int product_amount;
    
    public ProductDto() {}

	public ProductDto(int product_code, String product_name, String product_comment, int product_price,
			String product_manufacturer, String product_category, int product_stock, String product_releasedate,
			String product_img, int product_active, int product_salesrate, int product_amount) {
		this.product_code = product_code;
		this.product_name = product_name;
		this.product_comment = product_comment;
		this.product_price = product_price;
		this.product_manufacturer = product_manufacturer;
		this.product_category = product_category;
		this.product_stock = product_stock;
		this.product_releasedate = product_releasedate;
		this.product_img = product_img;
		this.product_active = product_active;
		this.product_salesrate = product_salesrate;
		this.product_amount = product_amount;
	}
    
	// 제품등록
	public ProductDto( String product_name, String product_comment, int product_price,
			String product_manufacturer, String product_category, int product_stock, String product_releasedate,
			String product_img) {
		this.product_name = product_name;
		this.product_comment = product_comment;
		this.product_price = product_price;
		this.product_manufacturer = product_manufacturer;
		this.product_category = product_category;
		this.product_stock = product_stock;
		this.product_releasedate = product_releasedate;
		this.product_img = product_img;	
	}
	
	// set, get

	public int getProduct_code() {
		return product_code;
	}

	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_comment() {
		return product_comment;
	}

	public void setProduct_comment(String product_comment) {
		this.product_comment = product_comment;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public String getProduct_manufacturer() {
		return product_manufacturer;
	}

	public void setProduct_manufacturer(String product_manufacturer) {
		this.product_manufacturer = product_manufacturer;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public int getProduct_stock() {
		return product_stock;
	}

	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}

	public String getProduct_releasedate() {
		return product_releasedate;
	}

	public void setProduct_releasedate(String product_releasedate) {
		this.product_releasedate = product_releasedate;
	}

	public String getProduct_img() {
		return product_img;
	}

	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}

	public int getProduct_active() {
		return product_active;
	}

	public void setProduct_active(int product_active) {
		this.product_active = product_active;
	}

	public int getProduct_salesrate() {
		return product_salesrate;
	}

	public void setProduct_salesrate(int product_salesrate) {
		this.product_salesrate = product_salesrate;
	}

	public int getProduct_amount() {
		return product_amount;
	}

	public void setProduct_amount(int product_amount) {
		this.product_amount = product_amount;
	}
	
	
}
