package VideoJuegos;

public class ProductoDigital extends Producto{
    private int descuento;
    private String plataforma;


    ProductoDigital(String nombre, int precioBase, int Stock, int descuento, String plataforma){
        super(nombre, precioBase, Stock);
        this.descuento = descuento;
        this.plataforma = plataforma; //this.plataforma es el atributo de arriba mientras que plataforma seria lo que esta en el parametro validado con un get
    }

    public int getDescuento(){
        return this.descuento;
    }

    public String getPlataforma(){
        return this.plataforma;
    }
       
    @Override
    public int calcularPrecioFinal() {
        
        return getPrecioBase() - (getPrecioBase() * this.descuento) / 100;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + "El descuento es: " + this.descuento + " Plataforma: " + this.plataforma;
    }
    

}
