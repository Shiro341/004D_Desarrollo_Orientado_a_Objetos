package Proyecto_Instagram;
public class Reel extends Publicacion {

    private int duracionSegundos;
    private String audioNombre;
    private int reproducciones;

    
    public Reel(String id, String autor, int duracionSegundos, String audioNombre){
        super(id, autor);

        this.duracionSegundos = Math.max(3, Math.min(90, duracionSegundos));

        if(audioNombre.strip().isEmpty()){
            this.audioNombre = "Audio original de " + autor;
        }
        else{
            this.audioNombre = audioNombre;
        }

        this.reproducciones = 0;

    }


    public void reproducir(){
        this.reproducciones++;
    }

    public void setDuracion(int duracionSegundos){
        this.duracionSegundos = Math.max(3, Math.min(90, duracionSegundos));
    }


    @Override
    public void mostrarDetalle() {
        System.out.println("=== REEL ===");
        System.out.println("ID: " + getId());
        System.out.println("Autor: " + getAutor());
        System.out.println("Likes: " + getLikes());
        System.out.println("Fecha Creación: " + getFechaCreacion());
        System.out.println("Estado: " + isEstaActiva());
        System.out.println("Duración: " + duracionSegundos);
        System.out.println("Audio: " + audioNombre);
        System.out.println("Reproducciones: " + reproducciones);

        
    }




}