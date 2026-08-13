public class Canil {
    public static void main(String[] args){
        System.out.println("******Bienvenido al Caníl*****");

        Perro perro_del_profe = new Perro();

        perro_del_profe.name = "Gimli";
        perro_del_profe.age = 6;
        perro_del_profe.weight = 40;
        perro_del_profe.hasVaccine = false;


        Perro perro_del_jairo = new Perro();

        perro_del_jairo.name = "Yuka";
        perro_del_jairo.age = 6;
        perro_del_jairo.weight = 35;
        perro_del_jairo.hasVaccine = true;

        
        if (perro_del_jairo.age > 2){
            System.out.println("Tiene más de 2 años");
        }

        else{
            System.out.println("No tiene más de 2 años");
        }


        if (perro_del_jairo.weight > 20){
            System.out.println("El perro es grande");
        }
        else{
            System.out.println("El perro es ligero");
        }



        System.out.println("Gracias por su visita, lo quiero mucho <3");

    }


}
