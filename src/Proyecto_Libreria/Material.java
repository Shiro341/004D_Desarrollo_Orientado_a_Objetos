public abstract class Material {
    private String titulo;
    private String autor;
    private int cantidadDisponible;

    public Material(String autor, int cantidadDisponible, String titulo) {
        setAutor(autor);
        setCantidadDisponible(cantidadDisponible);
        setTitulo(titulo);
    }

    public String getTitulo() {
        return this.titulo;
    }
    public final void setTitulo(String titulo) {
        if (titulo == null){
            System.out.println("El titulo no puede el valor nulo.");
        }
        else if (titulo.strip().isEmpty()) {
            System.out.println("El titulo no puede estar vacio.");
        }
        else{
            this.titulo = titulo.strip();
        }
    }
    public  String getAutor() {
        return this.autor;
    }
    public final void setAutor(String autor) {
       if (autor == null){
            System.out.println("El autor no puede el valor nulo.");
        }
        else if (autor.strip().isEmpty()) {
            System.out.println("El autor no puede estar vacio.");
        }
        else{
            this.autor = autor.strip();
        }
    }
    public int getCantidadDisponible() {
        return this.cantidadDisponible;
    }
    public final void setCantidadDisponible(int cantidadDisponible) {
        if(cantidadDisponible < 0){
            System.out.println("Error: La cantidad disponible no puede ser menor a 0.");
        }
        else{
            this.cantidadDisponible = cantidadDisponible;    
        }
   }

    public abstract int calcularDiasPrestamo();
    public String mostrarInfo(){
        return "Titulo: " + this.getTitulo() + "Autor: " + this.getAutor() + "Cantidad Disponible: " + this.getCantidadDisponible() + "Dias Prestamo: " + calcularDiasPrestamo();
    }

}
