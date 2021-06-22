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
	
	
	public void start(Stage 스테이지) throws Exception{ 
		
		VBox 레이아웃 = new VBox();
		
		레이아웃.setAlignment(Pos.CENTER);
		
		Button 버튼 = new Button();
		
		
		버튼.setText("클릭");
		버튼.setOnAction(인수->Platform.exit() );
		
		Label 레이블 = new Label();
		레이블.setText("안녕하세요 fx 입니다.");
		레이블.setFont(new Font(20) );
		
		
		레이아웃.getChildren().add(버튼);
		레이아웃.getChildren().add(레이블);
		
		Scene 씬 = new Scene(레이아웃, 500, 500);
		
		스테이지.setScene(씬);
		스테이지.setTitle("javafx 창");
		
		스테이지.show();
		
		
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
		
	}
	
	
}
