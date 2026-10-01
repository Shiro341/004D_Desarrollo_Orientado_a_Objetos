package com.spotify.mini;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button; // Fixed: Use JavaFX Button
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SpotifyApp extends Application {

    @Override
    public void start(Stage escenario) throws Exception {
        Label lblNombreApp = new Label("Spotify Duoc");
        lblNombreApp.setStyle("-fx-text-fill: #fff;");
        Button btnAgregarCancion = new Button("Aceptar");
        btnAgregarCancion.setStyle("-fx-backgroud-color: rgb(20, 163, 77):" + "-fx-background-radius: 20px;" + "-fx-padding: 5 20;" + "-fx-text-fill: #fff");




        // Fixed: Use double for spacing (5.0 or 5) or set spacing via method
        VBox contendor_vertical = new VBox(5, lblNombreApp, btnAgregarCancion);

        contendor_vertical.setStyle("-fx-background-color: #222;");

        contendor_vertical.setPadding(new Insets(29));
        
        Scene scene = new Scene(contendor_vertical, 500, 300);

        escenario.setScene(scene);
        escenario.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}