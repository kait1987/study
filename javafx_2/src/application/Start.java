package application;
	
import java.lang.reflect.Member;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Start extends Application {
	
	// 씬빌더 => FXML 파일 작성 => JAVA 가져오기
	
	public static ArrayList<Member>	memberliList = new ArrayList<>();
		
	
	@Override
	public void start(Stage stage) throws Exception  {
		
		// FXML 첫 실행시 파일 가져오기 
		memberlist = FileUtil.readfile(
				new file ("C:/Users/me/git/study/javafx_2/src/File" ,"memberlist.txt" ) );
		
		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
		
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false); // stage 크기
		stage.setTitle("Nike"); // stage 상단 이름
			// stage.getIcons().add(new Image("/FXML/icon.png"));
		stage.show();
		
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
