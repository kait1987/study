package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application{
	
	public void start(Stage stage) throws Exception{
		
		
		Parent parent = FXMLLoader.load(getClass().getResource("�׽�Ʈ2.fxml") );
		
		
		
		Scene scene = new Scene(parent);
		
		stage.setScene(scene);
		
		stage.show();
		}
	
	
	
	
	public static void main(String[] args) {
		
	}

}
