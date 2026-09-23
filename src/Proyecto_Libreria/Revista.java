public class Revista extends Material {
    
    private String mesPublicacion;

    public Revista(String mesPublicacion, String autor, int cantidadDisponible, String titulo) {
        super(autor, cantidadDisponible, titulo);
        this.mesPublicacion = mesPublicacion;
    }

    public String getMesPublicacion() {
        return this.mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {

        if (mesPublicacion == null){
            System.out.println("El mes de publicacion no puede ser el valor nulo.");
        }
        else if (mesPublicacion.strip().isEmpty()) {
            System.out.println("El mes de publicacion no puede estar vacio.");
        }
        else{
            this.mesPublicacion = mesPublicacion.strip();
        }
    }


    @Override
    public int calcularDiasPrestamo() {  
        return 3;
    }

    @Override
    public String mostrarInfo() {
        System.out.println("=== Revista ===");
        return super.mostrarInfo() + "Mes Publicacion: " + this.mesPublicacion;
    }

    
}
