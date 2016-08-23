package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoBorderPane extends Application{

    Stage window1;
	
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window1 = primaryStage;
		window1.setTitle("BorderPane Layout");
		
		Button buttonT1 = new Button("TopFirst");
		Button buttonT2 = new Button("TopSecond");
		Button buttonT3 = new Button("TopThird");
		HBox topMenu = new HBox(buttonT1, buttonT2, buttonT3);
		
		Button buttonL1 = new Button("LeftFirst");
		Button buttonL2 = new Button("LeftSecond");
		Button buttonL3 = new Button("LeftThird");
		VBox leftMenu = new VBox(buttonL1, buttonL2, buttonL3);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);
		Scene scene = new Scene(borderPane, 300, 300);
		window1.setScene(scene);
		window1.show();
		
	}
	
}

