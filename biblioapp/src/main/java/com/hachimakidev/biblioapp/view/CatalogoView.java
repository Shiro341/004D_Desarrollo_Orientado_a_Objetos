package com.hachimakidev.biblioapp.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CatalogoView {
    public VBox catalogo(){
        Label lblPlaceholder = new Label("Aquí irá nuestra tabla de materiales...");
        lblPlaceholder.setStyle("-fx-font-style: italic; fx-text-fill: #64748b; -fx-padding: 30 0;");


        Label lblRut = new Label("RUT solicitante: ");
        TextField txtRut = new TextField();
        txtRut.setPromptText("Ej: 12345678-9");

        Button btnPrestar = new Button("Prestar seleccionado");

        HBox panelAcciones = new HBox(10, lblRut, txtRut, btnPrestar);
        panelAcciones.setPadding(new Insets(10, 0, 0, 0));

        VBox layout = new VBox(12, lblPlaceholder, panelAcciones);
        layout.setPadding(new Insets(16));
        return layout;

    }
}
