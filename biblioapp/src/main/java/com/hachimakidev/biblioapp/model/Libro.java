package com.hachimakidev.biblioapp.model;

public class Libro extends Material {

    private String autor;

    //override
    public Libro(String titulo, int paginas, String autor){
        super(titulo, paginas);
        this.autor = autor;
    }
    
    public String getAutor(){
        return autor;
    }

    @Override
    public int getDiasPrestamos() {
        return 14;
    }

}
