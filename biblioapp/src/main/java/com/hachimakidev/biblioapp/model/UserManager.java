package com.hachimakidev.biblioapp.model;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserManager {

    private final List<User> users = new ArrayList<>();

    public UserManager() {
        loadUsers();
    }

    public void loadUsers() {
        InputStream input = getClass().getResourceAsStream("/user_data.json");

        if (input == null) {
            System.err.println("No se encontró el archivo /user_data.json.");
            System.err.println("Revisa que esté en src/main/resources o en la raíz del classpath.");
            return;
        }

        try (InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8)) {
            Gson gson = new Gson();
            User[] loadedUsers = gson.fromJson(reader, User[].class);

            if (loadedUsers != null) {
                users.clear();
                users.addAll(Arrays.asList(loadedUsers));
            } else {
                users.clear();
            }

        } catch (Exception e) {
            System.err.println("Ocurrió un error al leer o parsear user_data.json");
            e.printStackTrace();
        }
    }

    public Optional<User> findByRut(String rut) {
        String normalizedRut = normalizeRut(rut);

        if (normalizedRut.isEmpty()) {
            return Optional.empty();
        }

        for (User user : users) {
            if (normalizeRut(user.getRut()).equals(normalizedRut)) {
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }

    private String normalizeRut(String rut) {
        if (rut == null) {
            return "";
        }

        return rut
                .replace(".", "")
                .replace("-", "")
                .trim()
                .toUpperCase();
    }
}