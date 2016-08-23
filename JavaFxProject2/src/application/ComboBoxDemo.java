package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application{

	Stage window;
	Button button;
	ComboBox<String> comboBox;
	String value;
	
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("ComboBox Demo");
		
		comboBox = new ComboBox<>();
		comboBox.getItems().addAll("Avatar", "Superman", "Star Trek");
		
		comboBox.setPromptText("What's your favorite movie?");
		
		comboBox.setEditable(true); //overwrites setPromtText
		
		button = new Button("Submit");
		button.setOnAction(e -> System.out.println(comboBox.getValue()));
		comboBox.setOnAction(e -> System.out.println("Selected: "+comboBox.getValue()));
		
		//layout
		VBox layout = new VBox(20);
		layout.setAlignment(Pos.CENTER);
		layout.getChildren().addAll(comboBox, button);
		Scene scene = new Scene(layout, 300, 300);
		window.setScene(scene);
		window.show();
		
	}
	
}
