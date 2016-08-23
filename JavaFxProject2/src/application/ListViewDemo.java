package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewDemo extends Application {

	Stage window;
	Label label;
	Button button;
	ListView<String> listView;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("ListView Demo");
		
		listView = new ListView<>();
		listView.getItems().addAll("Avengers", "Terminator", "Pacific Rim", "San Andreas");
		//enables user to select multiple items in the list
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		label = new Label("Tip: Hold 'shift' or 'control' ('command' for mac) to select multiple items");
		label.setMinHeight(35);
		label.setWrapText(true);//allow to display multiple lines in a label
		
		button = new Button("Submit");
		button.setOnAction(e -> handleSelection());
		
		VBox layout = new VBox(20);
		layout.getChildren().addAll(listView, label, button);
		layout.setPadding(new Insets(20,20,20,20));
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout, 300, 300);
		window.setScene(scene);
		window.show();
	}
	
	//create a temporary list, store selected items in it and loop through it to print it out
	private void handleSelection(){
		
		String message= "";
		ObservableList<String> temp;
		temp = listView.getSelectionModel().getSelectedItems();
		
		for (String s:temp){
			message += s + "\n";
		}
		
		System.out.println(message);
		
	}
	
}
