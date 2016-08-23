package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application{
	
	Stage window;
	Button button;
	Label label;
	TextField otherReq;
	
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Sandwich Order");
		
		//label
		label= new Label("Please make your choice:");
		
		//CheckBox
		CheckBox box1 = new CheckBox("Bacon");
		CheckBox box2 = new CheckBox("Turkey");
		box2.setSelected(true); //box2 is checked by default
		
		//button
		button = new Button("Order Now!");
		button.setOnAction(e -> handleOptions(box1, box2));
		
		//other requirement text field
		otherReq = new TextField();
		otherReq.setPromptText("Other Requirements");
		
		//layout
		VBox layout = new VBox(20, label, box1, box2, button, otherReq);
		layout.setPadding(new Insets(20,20,20,20));
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout, 300, 300);
		window.setScene(scene);
		window.show();
		
	}
	
	private void handleOptions(CheckBox box1, CheckBox box2){
		String message = "User's order: \n" ;
		String otherReqMessage = "\nOther Requirements: \n";
		
		if (box1.isSelected())
			message += "Bacon\n";
		
		if (box2.isSelected())
			message += "Tuna\n";
		
		if (!box1.isSelected()&&!box2.isSelected())
			message += "Nothing\n";
		
		if (!otherReq.getText().isEmpty())	
			otherReqMessage += otherReq.getText() + "\n";
		else 
			otherReqMessage += "None\n";
		
		System.out.println(message+otherReqMessage);
	}
	
}
