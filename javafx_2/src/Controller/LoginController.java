package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Start;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	// FXML 제어 하는 클래스 
	
	@Override  // FXML 초기값 
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	// 컨트롤들의 객체 가져오기 
	@FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsigup;

    @FXML
    private Label lblfindid;

    @FXML
    private Label lblfindpassword;

    @FXML
    private ImageView loading;

    @FXML
    void findid(MouseEvent event) {

    }

    @FXML
    void findpassword(MouseEvent event) {

    }

    @FXML
    void login(ActionEvent event) {
    	loading.setVisible(true);
    		// 텍스트상자.getText() : 텍스트에 입력된 데이터 호출

    	// 입력된 회원과 기존회원과 비교해서 로그인 
    	for( Member temp : Start.memberlist ) {
    		//  임시객체 : 리스트명 
    				// 리스트내 객체수만큼 하나씩 임시객체에 대입 
    		if( temp.getId().equals( txtid.getText() )  
    				&& temp.getPassword().equals( txtpassword.getText() ) ) {
    			System.out.println(" 로그인 성공 ");
    			return;
    		}  		
    	}
    	System.out.println(" 로그인 실패 ");
    	
    }

    @FXML
    void signup(ActionEvent event) {
    	
    	try {
    		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/signup.fxml"));
    		
    		Scene scene = new Scene(parent);
    		Stage stage = new Stage();
    		stage.setScene(scene);
    		stage.setResizable(false);
    		stage.setTitle("nike signup");
    		stage.show();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
    }
    
    
    
    
    
    
    
    

	
    
    
    
    
    
    
    
    
    
    
    
}
