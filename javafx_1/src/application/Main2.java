package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application {
	
	//2. Start 메소드 오버라이딩 [ 재정의 ]
	@Override
	public void start(Stage stage) throws Exception {
					// 스테이지 클래스 객체 이름정하기 
		// 3. fxml 파일을 객체화 [ 씬빌더 만들어둔 fxml 파일을 java로 가져오기 ]
		// Parent parent = FXMLLoader.load( getClass().getResource("테스트1.fxml"));
		Parent parent = FXMLLoader..load( getClass().getResource("테스트2.fxml"));
			// Parent : 모든 레이아웃[fxml] 을 담는 클래스 
		// 4. 씬 => fxml 넣기 
		Scene scene = new Scene( parent );
		// 5. 스테이지 => 씬 넣기 
		stage.setScene(scene);
		// 6. 스테이지 실행 
		stage.show();
	}
	// 1. 시작 
	public static void main(String[] args) {
		launch(args); // => Start 메소드 
	}
}
