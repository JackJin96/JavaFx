package application;
	
import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
//import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;

public class Main extends Application{
	
	//ActionEvent is a simple click
	
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage){
		
		primaryStage.setTitle("Title of the window");
		button= new Button();
		button.setText("Click me");
		
		button.setOnAction(e -> {
			System.out.println("This is a new syntax!");
			System.out.println("You can add multiple things!");
		});
		
		/*
		button.setOnAction(this); 
		//whenever the user clicks, the code to handle it is in "this" class 
		//(you can create another class just for handling events) */
		
		StackPane layout= new StackPane(); 
		layout.getChildren().add(button);
		
		Scene scene= new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}
	
	/*  
	@Override
	public void handle(ActionEvent event) {
		// What do you want to do when user interacts with you (when he/she clicks a button) 
		
		if(event.getSource()==button){ 
			//verify the source of the click, differentiate buttons if you have multiple ones 
			System.out.println("The button is clicked!");
		}
	} 
	*/
	

}
