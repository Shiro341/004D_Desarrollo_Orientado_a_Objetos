package Instagram;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Publicacion {
    private String id;
    private ArrayList<Autor> Autores;
    private String fechaCreacion;
    private int likes;
    private boolean estaActiva;


    public Publicacion(String id, String autor){
        if (validarId(id)){
            this.id = id;
        }

        else {
            System.out.println("Error: id inválido.");
        }

        this.estaActiva = true;
        this.fechaCreacion = LocalDate.now().toString(); 
    }


    public boolean validarId(String id){
        return !id.strip().isEmpty();
    }

    public String getId(){
        return this.id;
    }

    public boolean validarAutor(String autor){
        return autor.strip().length() >= 2;

    }
    

    public String getFechaCreacion(){
        return this.fechaCreacion;
    }

    public void darLike(){
        this.likes++;
    
    }

    public int getLikes(){
        return this.likes;

    }

    public boolean isEstaActiva(){
        return this.estaActiva;
    }

    public abstract void mostrarDetalle();  
}
