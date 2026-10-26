package com.hachimakidev.biblioapp.controller;

import com.hachimakidev.biblioapp.model.User;
import com.hachimakidev.biblioapp.model.UserManager;

import java.util.Optional;

public class UserController {

    private final UserManager userManager;

    public UserController() {
        this.userManager = new UserManager();
    }

    public String searchByRut(String rut) {
        if (rut == null || rut.trim().isEmpty()) {
            return "Ingresa un RUT para buscar.";
        }

        Optional<User> foundUser = userManager.findByRut(rut);

        if (!foundUser.isPresent()) {
            return "No se encontró un usuario con el RUT: " + rut;
        }

        return formatUser(foundUser.get());
    }

    private String formatUser(User user) {
        StringBuilder sb = new StringBuilder();

        sb.append("--------------\n");
        sb.append("RUT: ").append(user.getRut()).append("\n");
        sb.append("Nombre: ").append(user.getNombre()).append("\n");
        sb.append("Email: ").append(user.getEmail()).append("\n");
        sb.append("Edad: ").append(user.getEdad()).append("\n");
        sb.append("Puede solicitar préstamos: ")
          .append(user.isPuedeSolicitarPrestamos() ? "Sí" : "No")
          .append("\n");

        return sb.toString();
    }
}