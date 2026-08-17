import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
        
    }

    static void showMenu(){
        Personaje personaje_player = new Personaje();
        String opcion_elegida;
        Scanner scanner = new Scanner(System.in); //toda esta linea es una instancia

        System.out.println("**Bienvendios al mundo de Westeros**");
        boolean start_menu = true;

        
        while (start_menu) {
            System.out.println("1.- Crear personaje");
            System.out.println("2.- Ver personaje");
            System.out.println("3.- Salir");

            System.out.print("Por favor ingrese una opción: ");
            opcion_elegida = scanner.nextLine();

            System.out.println("La opción escogida por el usuario es: " + opcion_elegida);


            //Este sirve para hacer acciones en función de un valor o sus posibles valaores
        
            switch (opcion_elegida) {
                case "1":
                    System.out.println("Creación de personaje");
                    

                    System.out.println("¿Cómo llamaras a tu héroe?: ");
                    personaje_player.name = scanner.nextLine();
                    System.out.println("¿what is the playe´s name?: " + personaje_player.name);

                    System.out.println("¿Cuál es el apellido del héroé?: ");
                    personaje_player.lastName = scanner.nextLine();
                    System.out.println("¿Cúal es el apellido del jugador?: " + personaje_player.lastName);

                    System.out.println("Indique la vida del héroe: ");
                    // Ya no lo haremos así, por que es inseguro
                    //personaje_player.life = Integer.parseInt(scanner.nextLine());

                    personaje_player.setearVida(Integer.parseInt(scanner.nextLine()));

                    break;
            
                case "2":

                    System.out.println("Ver Personaje");
                    System.out.println("Nombre: " + personaje_player.name);
                    System.out.println("Apellido: " + personaje_player.lastName);
                    System.out.println("Vida: " + verVida());
                    
                    break;

                case "3":
                    System.out.println("Gracias por jugar");
                    start_menu = false;
                    break;
        
                default:
                    System.out.println("Por favor ingrese una de las opciones permitidas");
                    break;
        
            }
        }
    }
}