package application;

import java.io.File;
import java.util.ArrayList;

import domain.FileUtil;
import domain.Member;
import javafx.application.	Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application {

	// 씬빌더 => FXML 파일 작성 => JAVA 가져오기
	
//	public static ArrayList< Member > memberlist = new ArrayList<>();
	
	@Override
	public void start(Stage stage) throws Exception {
	
		// FXML 첫 실행시 파일 가져오기 
//		memberlist = FileUtil.readfile( 
//				new File("C:/Users/User/git/web_0518/javafx_2/src/File/", "memberlist.txt"));

		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
		
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false); // stage 크기 고정 
		stage.setTitle("Nike"); // stage 상단 이름 

		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
