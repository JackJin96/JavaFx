package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CloseWindowProperly extends Application {
	
	Button button;
	Stage window;
	
	public static void main(String args[]){
		
		launch(args);
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("Close Window Properly");
		window.setOnCloseRequest(e -> {
			e.consume();
			closeProgram();
			});
		          
		button = new Button("Close");
		button.setOnAction(e -> closeProgram());
		
		StackPane layout = new StackPane(button);
		Scene scene = new Scene(layout, 500, 500);
		primaryStage.setScene(scene); 
		primaryStage.show();
		
	}
	
	private void closeProgram(){
		boolean answer = ConfirmBox.display("Exit Confirm", "Sure you want to exit?");
		if (answer)
			window.close();
	}
		

	
	
	

}
