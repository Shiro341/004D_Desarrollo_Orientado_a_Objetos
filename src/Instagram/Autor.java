package Instagram;

public class Autor{

    private String nombreUsuario;
    private String nombreCompleto;
    private int seguidores;


    public Autor(String nombreUsuario, String nombreCompleto, int seguidores){
        this.nombreUsuario = nombreUsuario;
        this.nombreCompleto = nombreCompleto;
        this.seguidores = seguidores;
    }

    public String getNombreUsuario(){
        return this.nombreUsuario;
    }

    public String getNombreCompleto(){
        return this.nombreCompleto;
    }
    
    public int getSeguidores(){
        return this.seguidores;
    }

    @Override
    public String toString(){
        return "@" + this.nombreUsuario + " (" + this.nombreCompleto + ") - " + this.seguidores + " seguidores";
    }
}
