package Proyecto_Instagram;

import java.util.ArrayList;
import java.util.Scanner;



public class Instagram {
    public static void main(String[] args) {

        mostrarMenu();

    }


    static void mostrarMenu(){
        Scanner scanner = new Scanner(System.in); //(Leer teclado)
        ArrayList<Publicacion> feed = new ArrayList<>(); //(Guarda el feed)
        boolean ejecutando = true; //(Controla el siglo While)

        while(ejecutando){
            System.out.println("\n=== INSTAGRAM CONSOLE APP ===");
            System.out.println("1. Crear Publicacion");
            System.out.println("2. Ver Feed completo");
            System.out.println("3. Dar Like a una publicación");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine().trim();
    

            
            switch (opcion) {
                case "1":
                System.out.println("-> Opción Crear Publicación seleccionada.");
                    break;
                case "2":
                    mostrarFeed(feed);
                    break;
                case "3":
                    System.out.println("-> Opción Dar Like seleccionada.");
                    break;
                case "4":
                    System.out.println("¡Hasta pronto! 🛸");
                    scanner.close();
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;


                    
            }   
        }
    }


    static void mostrarFeed(ArrayList<Publicacion> feed){
        if (feed.isEmpty()){
            System.out.println("El feed está vacío. ¡Crea una publicación primero!");
            return;
        }

        System.out.println("\n === FEED DE PUBLICACIONES === ");
        for (Publicacion pub : feed) {
            pub.mostrarDetalle();
            System.out.println("---------------------------");
            
        }

    }
}