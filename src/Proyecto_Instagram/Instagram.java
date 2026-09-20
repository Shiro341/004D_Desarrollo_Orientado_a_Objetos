package Proyecto_Instagram;

import java.util.ArrayList;
import java.util.Scanner;

public class Instagram {
    public static void main(String[] args) {

        mostrarMenu();

    }

    static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in); // (Leer teclado)
        ArrayList<Publicacion> feed = new ArrayList<>(); // (Guarda el feed)
        boolean ejecutando = true; // (Controla el siglo While)

        while (ejecutando) {
            System.out.println("\n=== INSTAGRAM CONSOLE APP ===");
            System.out.println("1. Crear Publicacion");
            System.out.println("2. Ver Feed completo");
            System.out.println("3. Dar Like a una publicación");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1" -> crearPublicacion(scanner, feed);
                case "2" -> mostrarFeed(feed);
                case "3" -> darLikePublicacion(scanner, feed);
                case "4" -> {
                    System.out.println("¡Hasta pronto! 🛸");
                    scanner.close();
                    ejecutando = false;
                }
                default -> System.out.println("Opción no válida. Intente nuevamente.");

            }
        }
    }

    static void crearPublicacion(Scanner scanner, ArrayList<Publicacion> feed) {
        System.out.println("\n--CREAR UNA NUEVA PUBLICACIÓN ---");
        System.out.println("¿Qué tipo deseas crear?");
        System.out.println("1. Historia");
        System.out.println("2. Reel");
        System.out.println("3. Post");
        System.out.print("Opción: ");

        String tipo = scanner.nextLine().trim();

        switch (tipo) {
            case "1" -> System.out.println("Hola");
            case "2" -> {
                System.out.println("\n== Creando Reel == ");
                System.out.println("Ingresa el ID: ");
                String id = scanner.nextLine().trim();
                System.out.println("Ingrese el autor: ");
                String autor = scanner.nextLine().trim();
                System.out.println("Duracion en segundos (3-90): ");
                int duracionSegundos = 30;
                try {
                    duracionSegundos = Integer.parseInt(scanner.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("Error: La duracion o el formato es incorrecto.");
                    System.out.println("Se le asigno por defecto 30 segundos.");
                }   System.out.println("El nombre del audio (Enter para el audio original): ");
                String audio = scanner.nextLine().trim();
                Reel nuevoReel = new Reel(id, autor, duracionSegundos, audio);
                feed.add(nuevoReel);
                System.out.println("✅ Reel creado y agregado al feed.");
            }
            case "3" -> {
                System.out.println("\n== Creando Post == ");
                System.out.println("Ingresa el ID: ");
                String id = scanner.nextLine().trim();
                System.out.println("Ingrese el autor: ");
                String autor = scanner.nextLine().trim();
                System.out.println("Ingrese el pieDeFoto: ");
                String pieDeFoto = scanner.nextLine().trim();
                System.out.println("Ingrese la ubicacion (Enter para Sin ubicación): ");
                String ubicacion = scanner.nextLine().trim();

                Post nuevoPost = new Post(id, autor, pieDeFoto, ubicacion);
                feed.add(nuevoPost);
                System.out.println("✅ Post creado y agregado al feed.");
            }

            default -> System.out.println("Opción no implementada aún.");
        }

    }

    static void mostrarFeed(ArrayList<Publicacion> feed) {
        if (feed.isEmpty()) {
            System.out.println("El feed está vacío. ¡Crea una publicación primero!");
            return;
        }

        System.out.println("\n === FEED DE PUBLICACIONES === ");
        for (Publicacion pub : feed) {
            pub.mostrarDetalle();
            System.out.println("---------------------------");

        }

    }

    static void darLikePublicacion(Scanner scanner, ArrayList<Publicacion> feed){
        if (feed.isEmpty()) {
            System.out.println("El feed esta vacío. ¡Crea una publicación primero!");
            return;
        }

        for (int i = 0; i < feed.size(); i++) {
            System.out.println("[" + i + "] " + feed.get(i).getId() + " - " + feed.get(i).getAutor());
        }

        int indice = -1;
        try {
            System.out.println("Escribe un número de índice para dar like: ");
            indice = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un número entero.");
        }

        if (indice < 0 || indice >= feed.size()){
            System.out.println("Error: Ese número no existe en el feed.");
            return;
        }

        Publicacion pub = feed.get(indice);
        pub.darLike();
        System.out.println("✅ Like agregado a la publicación " + pub.getId() + ". Total de likes: " + pub.getLikes());
        
    }   


}

