package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Main extends Application {
	
	
	public void start(Stage ��������) throws Exception{ 
		
		VBox ���̾ƿ� = new VBox();
		
		���̾ƿ�.setAlignment(Pos.CENTER);
		
		Button ��ư = new Button();
		
		
		��ư.setText("Ŭ��");
		��ư.setOnAction(�μ�->Platform.exit() );
		
		Label ���̺� = new Label();
		���̺�.setText("�ȳ��ϼ��� fx �Դϴ�.");
		���̺�.setFont(new Font(20) );
		
		
		���̾ƿ�.getChildren().add(��ư);
		���̾ƿ�.getChildren().add(���̺�);
		
		Scene �� = new Scene(���̾ƿ�, 500, 500);
		
		��������.setScene(��);
		��������.setTitle("javafx â");
		
		��������.show();
		
		
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
		
	}
	
	
}
