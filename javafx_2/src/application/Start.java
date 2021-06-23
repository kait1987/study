package application;

import java.io.File;
import java.util.ArrayList;

import domain.FileUtil;
import domain.Member;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application {

	// ������ => FXML ���� �ۼ� => JAVA ��������
	
	public static ArrayList< Member > memberlist = new ArrayList<>();
	
	@Override
	public void start(Stage stage) throws Exception {
	
		// FXML ù ����� ���� �������� 
		memberlist = FileUtil.readfile( 
				new File("E://���ּ�//.metadata//javafx_2//src//File", "memberlist.txt"));

		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
