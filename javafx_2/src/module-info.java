module javafx_2 {
	
	// javafx ��� => ���̺귯�� 
	requires javafx.controls;
	requires javafx.fxml;
	
	// ���Ǵ� ��Ű���� to ���� 
	opens application to javafx.graphics, javafx.fxml , javafx.controls;
	opens Controller to javafx.graphics, javafx.fxml , javafx.controls;
	opens FXML to javafx.graphics, javafx.fxml , javafx.controls;
	
}
