package Proyecto_Instagram;
import java.time.LocalDate;

public abstract class Publicacion {
    private String id;
    private String autor;
    final String fechaCreacion;
    private int likes;
    protected boolean estaActiva;


    public Publicacion(String id, String autor){
        if (validarId(id)){
            this.id = id;
        }

        else {
            System.out.println("Error: id inválido.");
        }


        if (validarAutor(autor)){
            this.autor = autor;
        }

        else {
            System.out.println("Error: autor inválido.");
        }

        this.estaActiva = true;
        this.fechaCreacion = LocalDate.now().toString(); 
    }


    private boolean validarId(String id){
        return !id.strip().isEmpty();
    }

    public String getId(){
        return this.id;
    }

    private boolean validarAutor(String autor){
        return autor.strip().length() >= 2 && autor.strip().length() <= 50;

    }
    public String getAutor(){
        return this.autor;
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
