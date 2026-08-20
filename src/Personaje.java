public class Personaje {
    private String nombre;
    String apellido;
    private int vida;
    boolean esta_vivo = true;
    private int edad;

    public void setNombre(String nombre){
        switch (nombre) {
            case "tonto":
                System.out.println("No puedes colocar un insulto como un nombre");
                break;
            case "sopenco":
                System.out.println("No puedes colocar un insulto como un nombre");
                break;
            case "conchudo":
                System.out.println("No puedes colocar un insulto como un nombre");
                break;
            case "weon":
                System.out.println("No puedes colocar un insulto como un nombre");
                break;
            case "pipi":
                System.out.println("No puedes colocar un insulto como un nombre");
                break;
            case "caca":
                System.out.println("No puedes colocar un insulto como un nombre");
                break;
        
            default:
                break;
        }
    }

    public String getNombre(){
        return this.nombre;
    }


    public void setVida(int vida){ //esto quiere guardar la vida no darla
        if (vida < 0){
            System.out.print("La vida del personaje no puede ser negativa. Que demonios haces!");
            this.vida = 0;
        } else{
            this.vida = vida;
        }
    }

    public int getVida(){
        return this.vida;
    }

    public void setEdad(int edad){
        if (vida < 0){
            System.out.println("La edad no puede ser negativa, se le asigna la edad de 18 por defecto");
            this.edad = 18;
        }
        else{
            this.edad = edad;
        }
    }

    public int getEdad(){
        return this.edad;
    }


}

