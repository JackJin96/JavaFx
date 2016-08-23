package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceBoxDemo extends Application{

	Stage window;
	Button button;
	Label label;
	
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("ChoiceBox Demo");
		
		label = new Label("Select your favorite fruit");
		
		ChoiceBox<String> choice = new ChoiceBox<>();
		
		//add items
		choice.getItems().addAll("Apples", "Bananas", "Grapefruit", "Oranges");
		
		//set default choice
		choice.setValue("Apples");
		
		//listen for selection changes
		choice.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
				System.out.println(oldValue + " TO " + newValue);}
		);
		
		button = new Button("Select");
		
		//extract selection
		button.setOnAction(e -> getChoice(choice));
		
		//layout
		VBox layout = new VBox(20);
		layout.getChildren().addAll(label, choice, button);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout, 300, 300);
		window.setScene(scene);
		window.show();
		
	}
	
	private void getChoice (ChoiceBox<String> box){
		String selection = box.getValue();
		System.out.println(selection);
	}
	
}
