import java.util.Scanner;

public class Main {

    // Declaramos la variable jugador de forma global en la clase para que 
    // se pueda acceder tanto al crearla como al ver sus datos.
    static Personaje jugador = null;

    public static void main(String[] args) {
        mostrarMenu();
    }

    static void mostrarMenu() {
        String opcion_menu;
        boolean mantener_menu = true;
        Scanner scanner = new Scanner(System.in);

        while (mantener_menu) {
            System.out.println("\nElija su opción");
            System.out.println("1.- Crear personaje");
            System.out.println("2.- Ver personaje");
            System.out.println("3.- Cerrar");
            System.out.println("4.- Test");
            System.out.print("Eliga una opción: ");
            opcion_menu = scanner.nextLine();

            switch (opcion_menu) {
                case "1":
                    crearPersonaje(scanner);
                    break;
                case "2":
                    verDatosDelPersonaje();
                    break;
                case "3":
                    System.out.println("Saliendo del menú");
                    mantener_menu = false;
                    break;
                case "4":
                    testeandoCositas();
                    break;
                default:
                    System.out.println("Por favor ingrese una opción válida");
                    break;
            }
        }
        scanner.close();
    }


    static void testeandoCositas(){
        System.out.println("Este es el hacker");
        Personaje hacker = new Hacker();
        hacker.trabajar();

        hacker.validarNombre("sopenco");
        System.out.println(hacker.mostrarNombre());

        System.out.println("Este es el GameDev");
        Personaje gamedev = new GameDev();
        gamedev.trabajar();

        System.out.println("Este es el programador");
        Personaje programadorJairo = new Programador();
        programadorJairo.trabajar();
        

    }

    static void crearPersonaje(Scanner scanner) {
        String opcion_clase;
        
        System.out.println("\nElige una clase para tu personaje");
        System.out.println("1.- Hacker");
        System.out.println("2.- Programador");
        System.out.println("3.- GameDev");
        System.out.println("Opción Elegida: ");
        
        opcion_clase = scanner.nextLine();

        switch (opcion_clase) {
            case "1":
                jugador = new Hacker();
                System.out.println("¡Has creado un Hacker con éxito!");
                break;
            
            case "2":
                jugador = new Programador();
                System.out.println("¡Has creado un Programador con éxito!");
                break;
            
            case "3":
                jugador = new GameDev();
                System.out.println("¡Has creado un GameDev con éxito!");
                break;
        
            default:
                System.out.println("Opción de clase no válida.");
                break;
        }
    }

    static void verDatosDelPersonaje() {
        if (jugador != null) {
            System.out.println("\n--- Datos del Personaje ---");
            // Aquí puedes llamar a métodos de tu clase Personaje, ej: jugador.mostrarInfo();
        } else {
            System.out.println("\nAún no has creado ningún personaje.");
        }
    }
}