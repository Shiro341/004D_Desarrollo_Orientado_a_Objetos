package com.hachimakidev.biblioapp.model;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class MaterialManager{

    private final List<Material> materiales = new ArrayList<>();
    
    public MaterialManager(){
        cargarCatalogo();
    }

    public List<Material> getMaterial(){
        return materiales;
    }

    public void cargarCatalogo(){
        
        InputStream input = getClass().getResourceAsStream("/catalogo.json");

    if (input == null){
        System.err.println("No se encontró el archivo /catalogo.json");
        System.err.println("Revisa que esté en src/main/resources o en la raíz del classpath.");
        return;
    }

    try{InputStreamReader reader =  new InputStreamReader(input, StandardCharsets.UTF_8);
        Gson gson = new Gson();
        CatalogoJson datos = gson.fromJson(reader, CatalogoJson.class);

        if(datos != null){
            materiales.clear();
            materiales.addAll(datos.getLibros());
            materiales.addAll(datos.getRevistas());
        } else{
            materiales.clear();
        }

    } catch (Exception e){
        System.err.println("Ocurrió un error al leer o parsear catalogo.json");
        e.printStackTrace();

    }

    }

}
