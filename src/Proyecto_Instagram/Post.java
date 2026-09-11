package Proyecto_Instagram;
public class Post extends Publicacion{
    private String pieDeFoto;
    private String ubicacion;
    private boolean comentariosHabilitados;


    public Post(String id, String autor, String pieDeFoto, String ubicacion){
        super(id, autor);
        this.pieDeFoto = pieDeFoto;
        this.ubicacion = ubicacion;

        this.comentariosHabilitados = true;
    }


    @Override
    public void mostrarDetalle() {
        System.out.println("=== POST ===");

        System.out.println("ID: " + getId());
        System.out.println("Autor: " + getAutor());
        System.out.println("Likes: " + getLikes());
        System.out.println("Fecha Creación: " + getFechaCreacion());
        System.out.println("Estado: " + isEstaActiva());
        System.out.println("Pie de foto: " + pieDeFoto);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Comentarios Habilitados: " + comentariosHabilitados);
        
    }

    public void editarPieDeFoto(String nuevoTexto){
        
    }

}
