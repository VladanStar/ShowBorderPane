package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override  // Predefinisanje metoda start() klase Application
    public void start(Stage primaryStage) throws Exception{

        // kreiranje BorderPane objekta
        BorderPane pane = new BorderPane();

        // postavljnaje cvora u okvir
        pane.setTop(new CustomPane("TOP"));
        pane.setRight(new CustomPane("RIGHT"));
        pane.setBottom(new CustomPane("BOTTOM"));
        pane.setLeft(new CustomPane("LEFT"));
        pane.setCenter(new CustomPane("CENTER"));

        // kreiranje scene i njeno postavljanje na pozornicu
        Scene scene= new Scene(pane);
        primaryStage.setTitle("SHOW BORDERPANE");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    // Definisanje okna koji sadrzi natpisu centru okvira
    class CustomPane extends StackPane{
        public CustomPane(String title){
            getChildren().add(new Label(title));
            setStyle("-fx-border-color: red");
            setPadding(new Insets(11.5,12.5,13.5,14.5));
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
