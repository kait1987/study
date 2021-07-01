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
    private ToggleGroup �׷�;

    @FXML
    private RadioButton opt_2;

    @FXML
    private RadioButton opt_3;

    @FXML
    private RadioButton opt_4;

    @FXML
    void padd(ActionEvent event) { // ��� ��=ư�� ������ �� 
    	String pname = txtpname.getText();
    	String pcontents = txtpcontents.getText();
    	
    	String pcategory = ""; 
    	
    	// 4. ���õ� ī�װ� �ؽ�Ʈ �ֱ� => ��ư��.isSelected()
    	
    	if(opt_1.isSelected() ) pcategory = "�Ƿ�";
    	if(opt_2.isSelected() ) pcategory = "�Ź�";
    	if(opt_3.isSelected() ) pcategory = "�Ǽ�����";
    	if(opt_4.isSelected() ) pcategory = "��Ÿ";
    	
    	int pprice;
    	int pstcok;
    	
    	try {
    	// 3. ��ǰ����/��� �����ϰ�� ���� => int ������ ��ȯ
    		
    	 pprice = Integer.parseInt(txtpprice.getText() );
    	 pstcok = Integer.parseInt(txtstock.getText() );
    	
    	// 5. 5���� �ϳ��� �����̸� x
    	if (pname.equals("") || pcontents.equals("") || pcategory.equals("") ) {
    		
    		Alert alert = new Alert( AlertType.INFORMATION);
			alert.setContentText(" [����] �Է¾ȵ� �׸��� �ֽ��ϴ�.");
			alert.setHeaderText("��� ����");
			alert.showAndWait(); // Ȯ�� ��ư ������������ ������ 
			return;
    	}
    	if(pname.length()>10) {
    	// ��ǰ���� 3~10 ���� ����	
    		Alert alert = new Alert( AlertType.INFORMATION);
			alert.setContentText(" [����]��ǰ���� 3~10���� ���̸� �Է�");
			alert.setHeaderText("��� ����");
			alert.showAndWait(); // Ȯ�� ��ư ������������ ������
    		return;
    		
    	}
    	
    	}catch (Exception e) { // ���� �Է�ĭ��  ���� �Է½� ����
    		Alert alert = new Alert( AlertType.INFORMATION);
			alert.setContentText(" [����] ����/����� ���ڸ� �Է�");
			alert.setHeaderText("��� ����");
			alert.showAndWait(); // Ȯ�� ��ư ������������ ������
    		return;
    		
		}
    	
    	

    	// ���� ��� ����ϸ� db�� ����
    	Product product = new Product(pname, pcontents, pprice, pstcok, pcategory, 0, 0, "�̹���");
    	ProductDao productDao = ProductDao.getProductDao();
    	productDao.addproduct(product);
    	
    	
    		
    	
    		
    		
    		
    	
    		
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

}
