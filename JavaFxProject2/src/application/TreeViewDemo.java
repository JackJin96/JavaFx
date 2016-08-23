package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TreeViewDemo extends Application {
	
	Stage window;
	TreeView<String> tree;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("TreeView Demo");
		
		TreeItem<String> root, mainCourse, dessert;
		
		//root
		root = new TreeItem<>();
		root.setValue("Menu");
		root.setExpanded(true); //"root" is expanded by default
		
		//main courses
		mainCourse = makeBranch("Main Course", root);
		makeBranch("Roasted Chicken", mainCourse);
		makeBranch("Sauted Cabbage", mainCourse);
		makeBranch("Fried Tofu", mainCourse);
		
		//desserts
		dessert = makeBranch("Dessert", root);
		makeBranch("Mochi Icecream", dessert);
		makeBranch("Mango Sticky Rice", dessert);
		makeBranch("Vanilla Crepes", dessert);
		
		//create tree
		tree = new TreeView<String>(root);
		tree.setShowRoot(true);
		tree.getSelectionModel().selectedItemProperty()
			.addListener((v, oldTreeItem, newTreeItem) -> {
				if (newTreeItem != null)
					System.out.println(newTreeItem.getValue());
			});    
		//You CANNOT select multiple items with a TreeView!!!
		
		//layout
		VBox layout = new VBox(10);
		layout.getChildren().add(tree);
		layout.setPadding(new Insets(10,10,10,10));
		Scene scene = new Scene(layout, 300, 300);
		window.setScene(scene);
		window.show();
	}
	
	public TreeItem<String> makeBranch(String name, TreeItem<String> parent){
		TreeItem<String> item = new TreeItem<>(name);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}

}
