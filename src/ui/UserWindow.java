package ui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserWindow extends Stage {
	
	//UI elements
	private ProgressBar progressBar;
	private TextField userTf;
	 private Button playBtn;
	 private Button exitBtn;
	
	public UserWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("UserWindow.fxml"));
			Parent root = loader.load();
			
			//UI elements
			progressBar = (ProgressBar) loader.getNamespace().get("progressBar");
			userTf = (TextField) loader.getNamespace().get("userTf");
			playBtn = (Button) loader.getNamespace().get("playBtn");
			exitBtn = (Button) loader.getNamespace().get("exitBtn");
			
			Scene scene = new Scene(root, 600, 400);
			setScene(scene);
			
			init();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void init() {
		playBtn.setOnAction(event-> {
			
		});
		
	}
	
}
