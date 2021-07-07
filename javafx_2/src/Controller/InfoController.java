package Controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import DAO.MemberDao;
import domain.Member;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

public class InfoController implements Initializable   {


    @FXML
    private Button btndelete;

    @FXML
    private Button btnupdate;

    @FXML
    private Label txtid;

    @FXML
    private Label txtname;

    @FXML
    private Label txtemail;

    @FXML
    void delete(ActionEvent event) {
    	
    	// 1.메시지 탈퇴여부 물어보기 
    	Alert alert = new Alert( AlertType.CONFIRMATION);
    	alert.setContentText(" 정말 탈퇴하시겠습니까? ");
    	alert.setHeaderText("회원탈퇴");
    	
    		// 메시지에서 선택한 버튼 가져오기
    	Optional<ButtonType> result = alert.showAndWait();
    	
    	if( result.get() == ButtonType.OK ) { // 확인 버튼을 눌렀을때
    		// 탈퇴
    		// 1. dao 객체 생성 
    		MemberDao memberDao = MemberDao.getMemberDao();
    		// 2. dao 메소드 실행 
    		int result2 =  memberDao.deletemember(loginid);
    		
    		if( result2 == 1 ) { 
    			Platform.exit(); // 모든 스테이지 종료 
    		}
    		
    	}else {
    		// 탈퇴 취소
    		return; // 메소드 종료 
    	}
    	
    	
    }

    @FXML
    void update(ActionEvent event) {
    	MainController.getinstance().loadpage("mupdate");
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
		txtid.setText( member.getId() );
		txtname.setText( member.getName() );
		txtemail.setText( member.getEmail() );
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
