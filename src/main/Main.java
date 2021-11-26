package main;

import javafx.application.Application;
import javafx.stage.Stage;
import ui.UserWindow;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		UserWindow main = new UserWindow();
		main.show();
		
	}

}
