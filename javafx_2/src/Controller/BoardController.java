package Controller;

import java.net.URL;
import java.util.ResourceBundle;


import DAO.BoardDao;
import domain.Board;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class BoardController implements Initializable {
	
	private static BoardController instance;
	
	public BoardController() {
		instance = this;
		
	}
	
	public static BoardController getinstance() {
		return instance;
	}
	public Board getboard() {
		return board;
	}
	private static Board board;

    @FXML
    private TableView<Board> tableview;

    @FXML
    private Button btnwrite;

    @FXML
    void write(ActionEvent event) {
    	
    	 // 쓰기버튼을 눌렀을 때 => 화면전환
    	MainController.getinstance().loadpage("boardwrite");
    	
    	

    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		BoardDao boardDao = BoardDao.getBoardDao();
		
		ObservableList<Board> boards = boardDao.allboard();
		
		
		TableColumn tc = tableview.getColumns().get(0);
		tc.setCellValueFactory( new PropertyValueFactory<>("bno") );
		
		tc = tableview.getColumns().get(1);
		tc.setCellValueFactory( new PropertyValueFactory<>("btitle") );
		
		tc = tableview.getColumns().get(2);
		tc.setCellValueFactory( new PropertyValueFactory<>("bwriter") );
		
		tc = tableview.getColumns().get(3);
		tc.setCellValueFactory( new PropertyValueFactory<>("bdate") );
		
		tc = tableview.getColumns().get(4);
		tc.setCellValueFactory( new PropertyValueFactory<>("bcount") );
		
		tableview.setItems(boards);
		
		tableview.setOnMouseClicked( (MouseEvent event ) -> {
			
			if( event.getButton().equals(MouseButton.PRIMARY) ) {
							
			board = tableview.getSelectionModel().getSelectedItem();
			board.setBcount (board.getBcount()+1);
			// 조회수 증가
			boardDao.addcount(board);
			//화면 전환
			MainController.getinstance().loadpage("boardview");
			
			}
		
				
		} );
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
