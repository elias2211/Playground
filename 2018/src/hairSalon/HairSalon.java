package hairSalon;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HairSalon extends Application{
	@Override
	public void start(Stage primaryStage) {
		//Create a scene and place a button in the scene
		Button btOK = new Button("Login");
		Scene scene = new Scene(btOK, 800, 700);
		primaryStage.setTitle("HairSalon");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
