package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TryCatch_Int extends Application {

	Button button;
	Stage window;
	
	public static void main (String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("Validation");
		
		Label label = new Label("Enter your age:");
		TextField textField = new TextField();
		Button button = new Button("Submit");
		button.setOnAction(e -> isInt(textField));
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.setAlignment(Pos.CENTER);
		layout.getChildren().addAll(label, textField, button);
		Scene scene = new Scene(layout, 300, 300);
		window.setScene(scene);
		window.show();
		
	}
	
	private boolean isInt(TextField input){
		try{
			int age = Integer.parseInt(input.getText());
			System.out.println("The user's age is " + age + ".");
			return true;
		}
		catch(NumberFormatException e){
			System.out.println(input.getText() + " is not an integer.");
			return false;
		}
	}
	
}
