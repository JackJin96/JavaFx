package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MultipleScenes extends Application{
	
	
	Scene scene1, scene2;
	
	public static void main(String[] args) { 
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Label label1= new Label("Welcome to the first scene!"); //a label is just a chuck of texts
		Button button1 = new Button ("Go to scene 2");
		button1.setOnAction(e -> primaryStage.setScene(scene2)); 
		
		//Layout 1 -- children are laid out in vertical column
		VBox layout1 = new VBox(20); 
		//stack all objects together in a column and space them out 20 pixels 
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene (layout1, 200, 200);
		
		//button 2
		Button button2 = new Button ("Go back to scene 1");
		button2.setOnAction(e -> primaryStage.setScene(scene1));
		
		//layout 2
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2, 600, 300);
		 
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Layout Switch");
		primaryStage.show();
		
		
	}

}
