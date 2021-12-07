package ui;

import java.io.File;
import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.ProgreesBarInit;

public class UserWindow extends Stage {
	
	//UI elements
	private ProgressBar progressBar;
	private TextField userTf;
	private Button playBtn;
	private Button exitBtn;
	private ImageView logoIv;
	
	//References
	private ProgreesBarInit progressBarInit;
	private QuestionsWindow questionsWindow;
	 
	public UserWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("UserWindow.fxml"));
			Parent root = loader.load();
			
			//UI elements
			progressBar = (ProgressBar) loader.getNamespace().get("progressBar");
			userTf = (TextField) loader.getNamespace().get("userTf");
			playBtn = (Button) loader.getNamespace().get("playBtn");
			exitBtn = (Button) loader.getNamespace().get("exitBtn");
			logoIv = (ImageView) loader.getNamespace().get("logoIv");
			
			progressBar.setVisible(false);
			
			Scene scene = new Scene(root, 600, 400);
			setScene(scene);
			
			init();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void nextWindow() {
		Platform.runLater(()-> {
			questionsWindow = new QuestionsWindow();
			questionsWindow.show();
			this.hide();
		});
	}
	
	private void init() {
		
		playBtn.setOnAction(event-> {
			progressBarInit = new ProgreesBarInit(this);
			progressBarInit.start();
		});
		exitBtn.setOnAction(event-> {
			System.exit(0);
		});
	}
	
	public void tell(double time) {
		Platform.runLater(
				()-> {
					//Is running in the UI Thread
					progressBar.setVisible(true);
					progressBar.setProgress(time);
					
				}
		);
	}
	
}
