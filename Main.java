package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	static int a=5;
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("LOGIN");
			Parent root = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			
			Scene scene = new Scene(root,670,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		System.out.println(a);
	}
}
