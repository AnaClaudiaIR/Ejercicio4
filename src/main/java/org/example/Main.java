package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.awt.*;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Haz clic aquí"); //Crear el botón
        Button button2 = new Button("Otro botón");
        Button button3 = new Button("Tercer botón");

        HBox hbox = new HBox(button1,button2); //Colocar el botón
        hbox.setSpacing(10);
        VBox vbox = new VBox(hbox,button3);
        Scene scene = new Scene(vbox, 300, 250); //ventana y que elementos tiene
        primaryStage.setTitle("Botones"); //nombre de la ventana
        primaryStage.setScene(scene); //ejecutar la escena
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
