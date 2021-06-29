module javafx_2 {
	
	// javafx 모듈 => 라이브러리 
	requires javafx.controls;
	requires javafx.fxml;
	requires activation; 
	requires mail;
	requires java.sql;
	
	// 사용되는 패키지명 to 모듈명 
	opens application to javafx.graphics, javafx.fxml , javafx.controls;
	opens Controller to javafx.graphics, javafx.fxml , javafx.controls;
	opens domain to activation , mail;
	opens DAO to java.sql;
}
