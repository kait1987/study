package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

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
    	String panme = txtpname.getText();
    	String pcontents = txtpcontents.getText();
    	String pprice = txtpprice.getText();
    	String stcok = txtstock.getText();
    	
    	String pcategory; 
    	
    	if(opt_1.isSelected() ) pcategory = "�Ƿ�";
    	if(opt_2.isSelected() ) pcategory = "�Ź�";
    	if(opt_3.isSelected() ) pcategory = "�Ǽ�����";
    	if(opt_4.isSelected() ) pcategory = "��Ÿ";

    	// ���� 
    	
    		// 1. ������ ��ǰ�� X
    		
    		// 2. ��ǰ�� 3~10���� �̳��� ����
    	
    		// 3. ��ǰ����/��� �����ϰ�� ���� => int ������ ��ȯ
    		
    		// 4. ���õ� ī�װ� �ؽ�Ʈ �ֱ� => ��ư��.isSelected()
    	
    		// 5. 5���� �ϳ��� �����̸� x
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

}
