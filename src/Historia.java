public class Historia extends Publicacion {
    private int duracionHoras = 24;
    private boolean esMejoresAmigos;
    private int visitas;


    public Historia(String id, String autor, boolean esMejoresAmigos){
        super(id, autor);
        this.esMejoresAmigos = esMejoresAmigos;
        this.visitas = 0;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("=== HISTORIA ===");
        System.out.println("ID: " + getId());
        System.out.println("Autor: " + getAutor());
        System.out.println("Likes: " + getLikes());
        System.out.println("Fecha Creación: " + getFechaCreacion());
        System.out.println("Visitas: " + visitas);
        System.out.println("Estado: " + isEstaActiva());
        System.out.println("Mejores Amigos: " + esMejoresAmigos);
        System.out.println("Duracion: " + duracionHoras + "Horas");
        
    }

    public void registrarVisita(){
        if(isEstaActiva()){
            this.visitas++;
        }
        else{
            System.out.println("La historia expiró");
        }
    }

    public void caducar(){
        this.estaActiva = false;
    }   
    
}
