package Dto;

public class Orders {

	
	private int orders_no;  
	private int orders_uno; 
	private String orders_name;
	private String orders_address;
	private String orders_phone; 
	private String orders_comment; 
	private int orders_fee; 
	private String orders_date; 
	private int orders_state;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(int orders_no, int orders_uno, String orders_name, String orders_address, String orders_phone,
			String orders_comment, int orders_fee, String orders_date, int orders_state) {
		
		this.orders_no = orders_no;
		this.orders_uno = orders_uno;
		this.orders_name = orders_name;
		this.orders_address = orders_address;
		this.orders_phone = orders_phone;
		this.orders_comment = orders_comment;
		this.orders_fee = orders_fee;
		this.orders_date = orders_date;
		this.orders_state = orders_state;
	}
	
	public Orders( int orders_uno, String orders_name, String orders_address, String orders_phone,
			String orders_comment, int orders_fee,  int orders_state) {
		
		
		this.orders_uno = orders_uno;
		this.orders_name = orders_name;
		this.orders_address = orders_address;
		this.orders_phone = orders_phone;
		this.orders_comment = orders_comment;
		this.orders_fee = orders_fee;		
		this.orders_state = orders_state;
	}

	public int getOrders_no() {
		return orders_no;
	}

	public void setOrders_no(int orders_no) {
		this.orders_no = orders_no;
	}

	public int getOrders_uno() {
		return orders_uno;
	}

	public void setOrders_uno(int orders_uno) {
		this.orders_uno = orders_uno;
	}

	public String getOrders_name() {
		return orders_name;
	}

	public void setOrders_name(String orders_name) {
		this.orders_name = orders_name;
	}

	public String getOrders_address() {
		return orders_address;
	}

	public void setOrders_address(String orders_address) {
		this.orders_address = orders_address;
	}

	public String getOrders_phone() {
		return orders_phone;
	}

	public void setOrders_phone(String orders_phone) {
		this.orders_phone = orders_phone;
	}

	public String getOrders_comment() {
		return orders_comment;
	}

	public void setOrders_comment(String orders_comment) {
		this.orders_comment = orders_comment;
	}

	public int getOrders_fee() {
		return orders_fee;
	}

	public void setOrders_fee(int orders_fee) {
		this.orders_fee = orders_fee;
	}

	public String getOrders_date() {
		return orders_date;
	}

	public void setOrders_date(String orders_date) {
		this.orders_date = orders_date;
	}

	public int getOrders_state() {
		return orders_state;
	}

	public void setOrders_state(int orders_state) {
		this.orders_state = orders_state;
	}
	
	
}
