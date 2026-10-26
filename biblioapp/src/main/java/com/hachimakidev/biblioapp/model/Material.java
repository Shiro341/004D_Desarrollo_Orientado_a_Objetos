package com.hachimakidev.biblioapp.model;

public abstract class Material {

    private String titulo;
    private int cantidadDisponible;

    protected Material(String titulo, int cantidadDisponible) {
        this.titulo = titulo;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public abstract int getDiasPrestamos();
    
}