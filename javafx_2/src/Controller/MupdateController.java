package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import DAO.MemberDao;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MupdateController implements Initializable {
	

    @FXML
    private Button btnupdate;

    @FXML
    private Button btncancel;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;

    @FXML
    void cancel(ActionEvent event) {
    	MainController.getinstance().loadpage("info");
    }
    @FXML
    void update(ActionEvent event) {
    	
    	Member member = new Member();
    		member.setId(loginid); // 업데이트할 아이디 
    		member.setName( txtname.getText() ); // 입력받은 이름 
    		member.setEmail( txtemail.getText() ); // 입력받은 이메일 
    		
    	// 1. dao 객체 생성 
    	MemberDao memberDao = MemberDao.getMemberDao();
    	//2 . dao 메소드 실행 
    	int result =  memberDao.updatemember( member );
    	
    	if( result == 1 ) { // 성공 
    	
    		MainController.getinstance().loadpage("info");
    	
    	}
    	else { // db 오류  
    		
    	}
    	
    }
    private String loginid; // 로그인된 아이디를 저장할 변수 선언 
	
   	@Override
   	public void initialize(URL arg0, ResourceBundle arg1) {
   		
   		loginid = LoginController.getintance().getid() ;
   		
   		// 1. DAO 객체 생성 
   		MemberDao memberDao = MemberDao.getMemberDao();
   		
   		// 2. DAO 메소드 실행 [ 로그인된 아이디를 넣어서 회원정보 가져오기 ]
   		Member member = memberDao.getmember(loginid);
   		
   		// 3. 각 컨트롤러에 넣어주기 
   		txtname.setText( member.getName() );
   		txtemail.setText( member.getEmail() );
   		
   	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
