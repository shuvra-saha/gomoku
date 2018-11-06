package application;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;


public class MainController {

	private Thread thread;
	public static boolean state = true;
	public static volatile boolean computerMove = false;
	public static boolean withAi;

	@FXML
	private Button startBtn;
	
	@FXML
	private AnchorPane anchorPane;

	@FXML
	private ComboBox<String> gameMode;

	@FXML
	private ComboBox<String> theme;

	@FXML
	void initialize() {
		assert anchorPane != null : "fx:id=\"anchorPane\" was not injected: check your FXML file 'StartPage.fxml'.";
		assert startBtn != null : "fx:id=\"startBtn\" was not injected: check your FXML file 'StartPage.fxml'.";
		//System.out.println("main controller init");
		

		theme.getItems().addAll("Brown Wood", "Bluish Wood", "White Board");

		
		
		

	}

	@FXML
	public void startGame(ActionEvent event) throws IOException {
		
		
		GameController.themeName = theme.getValue();
		//System.out.println(GameController.themeName);
		state = true;
		
		AnchorPane pane = FXMLLoader.load(getClass().getResource("GomokuBoard.fxml"));
		anchorPane.getChildren().setAll(pane);

	}

	
}
