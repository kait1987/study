package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class BoardController implements Initializable {
	

    @FXML
    private TableView<?> tableview;

    @FXML
    private Button btnwrite;

    @FXML
    void write(ActionEvent event) {
    	
    	 // 쓰기버튼을 눌렀을 때 => 화면전환
    	MainController.getinstance().loadpage("boardwrite");
    	
    	

    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
