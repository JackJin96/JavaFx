package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {
	
	Stage window;
	
	public static void main(String[] args){
		launch(args);
	}
	
	@SuppressWarnings("static-access")
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("GridPane Demo");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		
		//name label
		Label nameLabel = new Label("Username:");
		grid.setConstraints(nameLabel, 0, 0);
		
		//name input
		TextField nameInput = new TextField("Jack");
		grid.setConstraints(nameInput, 1, 0);
		
		//pass label
		Label passLabel = new Label("Password:");
		grid.setConstraints(passLabel, 0, 1);
		
		
		//pass input
		TextField passInput = new TextField();
		passInput.setPromptText("password");
		grid.setConstraints(passInput, 1, 1);	
		
		//log-in button
		Button login = new Button("Log In");
		grid.setConstraints(login, 1, 2);
		
		grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, login);
		Scene scene = new Scene(grid, 300, 200);
		window.setScene(scene);
		window.show();
		
	}
	

}