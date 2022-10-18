package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		
		Parent root = null;
		
		try {
			
			root = FXMLLoader.load(getClass().getResource("/View/MainOverview.fxml"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
        Scene scene = new Scene(root);
    
        primaryStage.setTitle("Adelan 1.0");
        primaryStage.setScene(scene);
        primaryStage.show();
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
