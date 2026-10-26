package com.hachimakidev.biblioapp.view;

import com.hachimakidev.biblioapp.controller.UserController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class HomeView {

    private final UserController userController = new UserController();

    public Scene homeScene() {
        Label titleLabel = new Label("BiblioApp");
        titleLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        Label subtitleLabel = new Label("Buscar usuario por RUT");

        Label rutLabel = new Label("RUT:");

        TextField rutField = new TextField();
        rutField.setPromptText("Ej: 12.345.678-9");

        Button searchButton = new Button("Buscar");

        TextArea outputArea = new TextArea();
        outputArea.setPromptText("Aquí se mostrarán los datos del usuario...");
        outputArea.setPrefRowCount(12);
        outputArea.setWrapText(true);
        outputArea.setEditable(false);
        outputArea.setText("Ingresa un RUT y presiona Buscar.");

        searchButton.setOnAction(event -> {
            outputArea.setText(userController.searchByRut(rutField.getText()));
        });

        rutField.setOnAction(event -> {
            outputArea.setText(userController.searchByRut(rutField.getText()));
        });

        HBox searchBox = new HBox(10, rutLabel, rutField, searchButton);
        searchBox.setAlignment(Pos.CENTER_LEFT);
        HBox.setHgrow(rutField, Priority.ALWAYS);

        VBox root = new VBox(
                12,
                titleLabel,
                subtitleLabel,
                searchBox,
                outputArea
        );

        VBox.setVgrow(outputArea, Priority.ALWAYS);

        root.setPadding(new Insets(20));
        root.setAlignment(Pos.TOP_LEFT);

        return new Scene(root, 600, 420);
    }
}