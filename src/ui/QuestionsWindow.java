package ui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class QuestionsWindow extends Stage {
	
	//UI elements
	private Label counterLbl;
	
	public QuestionsWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("QuestionsWindow.fxml"));
			Parent root = loader.load();
			
			//UI elements
			counterLbl = (Label) loader.getNamespace().get("counterLbl");
			
			Scene scene = new Scene(root, 600, 400);
			setScene(scene);
			
			init();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void init() {
		counterLbl.set
		
	}
	
}
