module javafx_Client {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	// opens 패키지명 to 라이브러리
}
