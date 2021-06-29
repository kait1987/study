package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import DAO.MemberDao;
import application.Start;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	
	// 로그인 성공시 main컨트롤에게 로그인성공한 id 넘기기 
	
	private static LoginController instance; // 임시객체
	
	public LoginController() {
		instance = this;
	}
	
	public static LoginController getintance() {
		return instance;
	}
	public String getid() {
		return txtid.getText();
	}
	
	// FXML 제어 하는 클래스 
	
	@Override  // FXML 초기값 
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		loading.setVisible(false); // 이미지 숨기기 	
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
    	
    	try {
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/findid.fxml"));
			
			Scene scene = new Scene( parent );
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Nike Find ID");
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void findpassword(MouseEvent event) {
    	
    	try {
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/findpassword.fxml"));
			
			Scene scene = new Scene( parent );
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Nike Find Passowrd");
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void login(ActionEvent event) {
    	loading.setVisible(true);
    		// 텍스트상자.getText() : 텍스트에 입력된 데이터 호출
			//
			//    	// 입력된 회원과 기존회원과 비교해서 로그인 
									//    	for( Member temp : Start.memberlist ) {
														//    		//  임시객체 : 리스트명 
														//    				// 리스트내 객체수만큼 하나씩 임시객체에 대입 
														//    		if( temp.getId().equals( txtid.getText() )  
														//    				&& temp.getPassword().equals( txtpassword.getText() ) ) {
														//    			
														//    			// 로그인 성공시 현재 창 닫기 => 새로운 main 스테이지 열기 
														//    			
														//    		 	// 스테이지 끄기  : 현재 속한 컨트롤명
														//    			btnlogin.getScene().getWindow().hide();
														//    			
														//    			try {
														//    				Stage stage = new Stage();
														//    				Parent parent = FXMLLoader.load(getClass().getResource("/FXML/main.fxml"));
														//    				Scene scene = new Scene(parent);
														//    				stage.setScene(scene);
														//    				stage.show();
														//    			}
														//    			catch (Exception e) {
														//					// TODO: handle exception
														//				}
														//    			
														//    			
														//    			return;
														//    		}  		
														//    	}
    	
    	// db 로그인 
    		// 1. dao 객체 만들기 
    	MemberDao memberDao = MemberDao.getMemberDao();
    		// 2. login 메소드 호출 
    	int result = memberDao.login( txtid.getText() , txtpassword.getText() );
    								// 로그인창에 입력된 아이디 , 입력된 패스워드 
    		// 3. 결과 제어 
    	if( result == 1 ) {
    	 	 //스테이지 끄기  : 현재 속한 컨트롤명
			btnlogin.getScene().getWindow().hide();
			
			try {
				Stage stage = new Stage();
				Parent parent = FXMLLoader.load(getClass().getResource("/FXML/main.fxml"));
				Scene scene = new Scene(parent);
				stage.setScene(scene);
				stage.show();
			}
			catch (Exception e) {
				// TODO: handle exception
			}	
			
    	}else if( result == 2 ) {
    		// 메세지 창 띄우기 
    		Alert alert = new Alert( AlertType.INFORMATION);
    		alert.setContentText(" 회원님의 아이디 혹은 비밀번호가 다릅니다 ");
    		alert.setHeaderText("로그인 실패");
    		alert.showAndWait(); // 확인 버튼 누르기전까지 대기상태 
    	}
    	else {
			Alert alert = new Alert( AlertType.INFORMATION);
			alert.setContentText(" [데이터베이스 오류] 관리자에게 문의 ");
			alert.setHeaderText("회원가입 실패");
			alert.showAndWait(); // 확인 버튼 누르기전까지 대기상태 
    	}
    	
    	
	
    	
    }
    
    @FXML
    void sigup(ActionEvent event) {
    	try {
			Parent parent = FXMLLoader.load( getClass().getResource("/FXML/signup.fxml"));
			
			Scene scene = new Scene(parent);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Nike signup");
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	

    }
    
    
    
    
    
    
    
    

	
    
    
    
    
    
    
    
    
    
    
    
}
