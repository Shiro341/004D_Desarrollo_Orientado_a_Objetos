public class Publicacion {
    private String id;
    private String autor;
    private String fechaCreacion;
    private int likes;
    protected boolean estaActiva;



    public Publicacion(String id, String autor){
        this.id = id;
        this.autor = autor;
        this.likes = 0;
    }


    public void setId(String id) {

    }

    public String getId(){
        return this.id;
    }

    public void setAutor(String autor){
        if (autor.length() > 20) {
            System.out.println("El nombre no puede exceder los 20 caracteres");
        }
        else {
            this.autor = autor;
        }
    }


    public String getAutor(){
        return this.autor;
    }


    public void setDarLike(){
        this.likes = this.likes + 1;
    }

    public int getDarLike(){
        return this.likes;
    }


}
