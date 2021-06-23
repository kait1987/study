package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignupController implements Initializable {
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	   @FXML
	    private TextField txtid;

	    @FXML
	    private PasswordField txtpassword;

	    @FXML
	    private Button btnlogin;

	    @FXML
	    private Button btnsignup;

	    @FXML
	    private PasswordField txtpassword2;

	    @FXML
	    private TextField txtname;

	    @FXML
	    private TextField txtemail;

	    @FXML
	    void login(ActionEvent event) {

	    }

	    @FXML
	    void signup(ActionEvent event) {

	    }
	
	
	
	
	
	

    
}
