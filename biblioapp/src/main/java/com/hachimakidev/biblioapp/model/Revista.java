package com.hachimakidev.biblioapp.model;

public class Revista extends Material {

    private String editorial;
    private String periodicidad;

    public Revista(String titulo, int paginas, String editorial, String periodicidad){
        super(titulo, paginas);
        this.editorial = editorial;
        this.periodicidad = periodicidad;

    }

    public String getEditorial(){
        return editorial;   

    }

    public String getPeriodicidad(){
        return periodicidad;
    }

    @Override
    public int getDiasPrestamos() {
        return 3;
    }
    
}
