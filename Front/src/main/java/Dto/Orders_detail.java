package Dto;

public class Orders_detail {
	
	private int orders_detail_no;  
    private int orders_no; 
    private int orders_product_code;
    private int orders_amount;
    private int orders_detail_state;
    
 public Orders_detail() {
	// TODO Auto-generated constructor stub
}

public Orders_detail(int orders_detail_no, int orders_no, int orders_product_code, int orders_amount,
		int orders_detail_state) {
	
	this.orders_detail_no = orders_detail_no;
	this.orders_no = orders_no;
	this.orders_product_code = orders_product_code;
	this.orders_amount = orders_amount;
	this.orders_detail_state = orders_detail_state;
  }

public Orders_detail( int orders_no, int orders_product_code, int orders_amount,
		int orders_detail_state) {
	
	
	this.orders_no = orders_no;
	this.orders_product_code = orders_product_code;
	this.orders_amount = orders_amount;
	this.orders_detail_state = orders_detail_state;
  }

public int getOrders_detail_no() {
	return orders_detail_no;
}

public void setOrders_detail_no(int orders_detail_no) {
	this.orders_detail_no = orders_detail_no;
}

public int getOrders_no() {
	return orders_no;
}

public void setOrders_no(int orders_no) {
	this.orders_no = orders_no;
}

public int getOrders_product_code() {
	return orders_product_code;
}

public void setOrders_product_code(int orders_product_code) {
	this.orders_product_code = orders_product_code;
}

public int getOrders_amount() {
	return orders_amount;
}

public void setOrders_amount(int orders_amount) {
	this.orders_amount = orders_amount;
}

public int getOrders_detail_state() {
	return orders_detail_state;
}

public void setOrders_detail_state(int orders_detail_state) {
	this.orders_detail_state = orders_detail_state;
}
 
 
}
