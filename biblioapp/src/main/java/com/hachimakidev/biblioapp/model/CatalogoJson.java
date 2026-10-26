package com.hachimakidev.biblioapp.model;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class CatalogoJson {

    private List<Libro> libros = new ArrayList<>();
    private List<Revista> revistas = new ArrayList<>();

    public CatalogoJson() {

    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Revista> getRevistas() {
    return revistas;
    }

public void loadCatalogos() {
    InputStream input = getClass().getResourceAsStream("/catalogo.json");

    if (input == null) {
        System.err.println("No se encontró /catalogo.json");
        return;
    }

    try (InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8)) {
        Gson gson = new Gson();
        CatalogoJson datos = gson.fromJson(reader, CatalogoJson.class);

        if (datos != null) {
            this.libros.clear();
            this.revistas.clear();
            this.libros.addAll(datos.getLibros());
            this.revistas.addAll(datos.getRevistas());
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}