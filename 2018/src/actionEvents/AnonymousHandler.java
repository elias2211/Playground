package actionEvents;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnonymousHandler extends Application{
  @Override
  public void start(Stage primaryStage) {
    HBox hBox = new HBox();
    hBox.setSpacing(0);
    hBox.setAlignment(Pos.TOP_LEFT);
    Button btNew = new Button("Green");
    Button btOpen = new Button("Yellow");
    Button btSave = new Button("Red");
    Button btPrint = new Button("Gold");
    hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);
    
    
  // This Secion uses  Anonymous Class but bottom one uses Lambda expression
    //but does the same thing. 
    
    // Create and register the handler
    /**   btNew.setOnAction(new EventHandler<ActionEvent>() {
      @Override // Override the handle method
      public void handle(ActionEvent e) {
        System.out.println("Process New");
        hBox.setStyle("-fx-background-color: green; ");
      }
    });
    
    btOpen.setOnAction(new EventHandler<ActionEvent>() {
      @Override 
      public void handle(ActionEvent e) {
        System.out.println("Process Open");
        hBox.setStyle("-fx-background-color: yellow; ");
      }
    });
    
    btSave.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        System.out.println("Process Save");
        hBox.setStyle("-fx-background-color: red; ");
      }
    });
    
    btPrint.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        System.out.println("Process Print");
        hBox.setStyle("-fx-background-color: gold; ");
      }
    });  */
    
    // Lambda Expressions
    btNew.setOnAction(e -> {
      System.out.println("Process New");
      hBox.setStyle("-fx-background-color: green; ");
    });
    
    btOpen.setOnAction(e -> {
      System.out.println("Process Open");
      hBox.setStyle("-fx-background-color: yellow; ");
    });
    
    btSave.setOnAction(e -> {
      System.out.println("Process ");
      hBox.setStyle("-fx-background-color: red; ");
    });
    
    btPrint.setOnAction(e -> {
      System.out.println("Process Print");
      hBox.setStyle("-fx-background-color: gold; ");
    });
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(hBox, 800, 700);
    primaryStage.setTitle("AnonymousHandlerDemo");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }

}
