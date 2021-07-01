package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import DAO.ProductDao;
import domain.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;

public class PaddController implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
    private TextField txtpname;

    @FXML
    private TextArea txtpcontents;

    @FXML
    private TextField txtpprice;

    @FXML
    private TextField txtstock;

    @FXML
    private Button btnpadd;

    @FXML
    private RadioButton opt_1;

    @FXML
    private ToggleGroup 그룹;

    @FXML
    private RadioButton opt_2;

    @FXML
    private RadioButton opt_3;

    @FXML
    private RadioButton opt_4;

    @FXML
    void padd(ActionEvent event) { // 등록 번=튼을 눌렀을 때 
    	String pname = txtpname.getText();
    	String pcontents = txtpcontents.getText();
    	
    	String pcategory = ""; 
    	
    	// 4. 선택된 카테고리 텍스트 넣기 => 버튼명.isSelected()
    	
    	if(opt_1.isSelected() ) pcategory = "의류";
    	if(opt_2.isSelected() ) pcategory = "신발";
    	if(opt_3.isSelected() ) pcategory = "악세서리";
    	if(opt_4.isSelected() ) pcategory = "기타";
    	
    	int pprice;
    	int pstcok;
    	
    	try {
    	// 3. 제품가격/재고에 문자일경우 제어 => int 형으로 변환
    		
    	 pprice = Integer.parseInt(txtpprice.getText() );
    	 pstcok = Integer.parseInt(txtstock.getText() );
    	
    	// 5. 5개중 하나라도 공백이면 x
    	if (pname.equals("") || pcontents.equals("") || pcategory.equals("") ) {
    		
    		Alert alert = new Alert( AlertType.INFORMATION);
			alert.setContentText(" [오류] 입력안된 항목이 있습니다.");
			alert.setHeaderText("등록 실패");
			alert.showAndWait(); // 확인 버튼 누르기전까지 대기상태 
			return;
    	}
    	if(pname.length()>10) {
    	// 제품명이 3~10 글자 제한	
    		Alert alert = new Alert( AlertType.INFORMATION);
			alert.setContentText(" [오류]제품명은 3~10글자 사이만 입력");
			alert.setHeaderText("등록 실패");
			alert.showAndWait(); // 확인 버튼 누르기전까지 대기상태
    		return;
    		
    	}
    	
    	}catch (Exception e) { // 숫자 입력칸에  문자 입력시 예외
    		Alert alert = new Alert( AlertType.INFORMATION);
			alert.setContentText(" [오류] 가격/재고에는 숫자만 입력");
			alert.setHeaderText("등록 실패");
			alert.showAndWait(); // 확인 버튼 누르기전까지 대기상태
    		return;
    		
		}
    	
    	

    	// 제어 모두 통과하면 db에 저장
    	Product product = new Product(pname, pcontents, pprice, pstcok, pcategory, 0, 0, "이미지");
    	ProductDao productDao = ProductDao.getProductDao();
    	productDao.addproduct(product);
    	
    	
    		
    	
    		
    		
    		
    	
    		
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

}
