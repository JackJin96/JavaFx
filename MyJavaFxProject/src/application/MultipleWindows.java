package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MultipleWindows extends Application{
	
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("MultipleWindows");
		
		button= new Button("What do I do?");
		button.setOnAction(e -> {
			boolean result = ConfirmBox.display("Title", "Are you sure you want to do this?");
			//now you have the data passed from ConfirmBox to here
			
			if (result == true){
			System.out.println("He wants to do this.");
			}
			else {
				System.out.println("He is embarrassed!");
			}
			}); 
		
		StackPane layout= new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene (layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
