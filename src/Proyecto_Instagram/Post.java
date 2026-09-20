package Proyecto_Instagram;

public final class Post extends Publicacion {
    private String pieDeFoto;
    private String ubicacion;
    private boolean comentariosHabilitados;

    public Post(String id, String autor, String pieDeFoto, String ubicacion) {
        super(id, autor);
        
        // Reutilizamos el método para garantizar un estado válido desde el inicio
        editarPieDeFoto(pieDeFoto);
        setUbicacion(ubicacion);
        
        this.comentariosHabilitados = true; // Habilitados por defecto
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
        System.out.println("Ubicación: " + ubicacion);
        
        // Regla de dominio: indicar explícitamente "Comentarios desactivados"
        System.out.println("Comentarios: " + (comentariosHabilitados ? "Habilitados" : "Comentarios desactivados"));
    }

    public void editarPieDeFoto(String nuevoTexto) {
        if (nuevoTexto == null) {
            this.pieDeFoto = "";
        } else if (nuevoTexto.length() > 2200) { // Límite de 2200 caracteres
            System.out.println("Error: El pie de foto no puede exceder los 2200 caracteres.");
        } else {
            this.pieDeFoto = nuevoTexto;
        }
    }

    private void setUbicacion(String nuevaUbicacion) {
        if (nuevaUbicacion == null || nuevaUbicacion.strip().isEmpty()) {
            this.ubicacion = "Sin ubicación"; // Regla por defecto
        } else {
            this.ubicacion = nuevaUbicacion;
        }
    }

    public void setComentariosHabilitados(boolean estado) {
        this.comentariosHabilitados = estado;
    }
}