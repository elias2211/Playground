package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class LoginForm extends Application {
  
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Welcome to Mimi's Hair Salon");
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.BASELINE_CENTER);
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(24, 24, 24, 24));
    grid.setId("root");
    
    Text scenetitle = new Text("Welcome");
    scenetitle.setId("welcomeText");
    grid.add(scenetitle, 0, 0, 2, 1);
    
    Label userName = new Label("User Name:");
    grid.add(userName, 0, 1);
    
    TextField userTextField = new TextField();
    grid.add(userTextField,  1,  1);
    
    Label pw = new Label("Password:");
    grid.add(pw,  0,  2);
    
   // grid.setGridLinesVisible(true);
    
    PasswordField pwBox = new PasswordField();
    grid.add(pwBox,  1,  2);
    
    // Add a submit button
    Button btn = new Button("Sign in");
    HBox hbBtn = new HBox(10);
    hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
    hbBtn.getChildren().add(btn);
    grid.add(hbBtn,  1,  4);
    
    final Text actiontarget = new Text();
    grid.add(actiontarget, 1, 6);
    
    btn.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle (ActionEvent e) {
       // actiontarget.setFill(Color.FIREBRICK);
        actiontarget.setText("Sign in unsuccessful!");
      }
    });
    
    
    Scene scene = new Scene(grid, 800, 450);
    primaryStage.setScene(scene);
    scene.getStylesheets().add(LoginForm.class.getResource("Login").toExternalForm());
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}