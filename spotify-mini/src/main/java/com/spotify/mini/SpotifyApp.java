package com.spotify.mini;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SpotifyApp extends Application{

    private TextField txtTitulo;
    private TextField txtArtista;
    private TextField txtDuracion;
    private Label lblEstado;

    @Override
    public void start(Stage stage) {

        Label titulo = crearTitulo();
        GridPane formulario = crearFormulario();
        HBox botones = crearBotonnes();
        Label estado = crearEstado();

        VBox root = new VBox(15, titulo, formulario, botones, estado);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.TOP_CENTER);

        Scene 

    }

}