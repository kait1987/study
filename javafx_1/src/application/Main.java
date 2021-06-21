package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application{

	// 1. 해당 클래스에게 javafx 상속받기
	// 2. main메소드에 launch메소드 실행 [ 필수 ] 
	// 3. start() 메소드 Override 하기 [ 필수 ]
		// javafx 구조 
			// 1. Stage : window 창
			// 2. Scene : Stage 안에 들어가는 여러개의 화면 
			// 3. Graph : 레이아웃 , 컨트롤 , 버튼 등  	
	
	@Override
	public void start(Stage 스테이지) throws Exception {
					// 1. 스테이지 클래스 객체명 
		// 2. 레이아웃 생성 
		VBox 레이아웃 = new VBox();
		// 레이아웃 설정 
		레이아웃.setAlignment(Pos.CENTER); // 가운데 정렬
		
			// 3. 컨트롤 생성 
			Button 버튼 = new Button();
			// 4. 컨트롤 설정 
			버튼.setText("클릭");
			버튼.setOnAction( 인수 -> Platform.exit() );
			
			// 3. 레이블 생성 
			Label 레이블 = new Label();
			레이블.setText("안녕하세요 fx 입니다");
			레이블.setFont( new Font(20) );
			
		// 5. 레이아웃에 컨트롤 넣기 
		레이아웃.getChildren().add(버튼);
		레이아웃.getChildren().add(레이블);
		
		// 6. 씬 생성 => 레이아웃 넣기   //가로 , 세로 사이즈 
		Scene 씬 = new Scene(레이아웃 , 500 , 500 );
		// 7. 스테이지에 씬 넣기 
		스테이지.setScene(씬);
		스테이지.setTitle("javafx 창");
		// 8. 스테이지 실행 
		스테이지.show();
	}	
	public static void main(String[] args) {
		launch(args); // start 메소드 호출
	}
	
	
	
	
	

}
