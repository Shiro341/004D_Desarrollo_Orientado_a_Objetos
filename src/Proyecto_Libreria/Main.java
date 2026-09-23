
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Material> catalogo = new ArrayList<>();

        boolean mostrar_menu = true;

        while (mostrar_menu) {
            System.out.println("=== BIBLIOTECA MUNIPAL ===");
            System.out.println("1. Registrar material");
            System.out.println("2. Lista catalogo");
            System.out.println("3. Buscar material por titulo");
            System.out.println("4. Presentar material");
            System.out.println("5. Resumen del catalogo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            String opcion_menu = sc.nextLine();

            switch (opcion_menu) {
                case "1" -> registarMaterial(sc, catalogo);
                case "2" -> {
                }
                case "3" -> {
                }
                case "4" -> {
                }
                case "5" -> {
                }
                case "6" -> {
                    System.out.println("Programa finalizado.");

                    mostrar_menu = false;
                }
                default -> System.out.println("La opcion ingresada no es valida.");
            }

        }

    }

    static void registarMaterial(Scanner sc, ArrayList<Material> catalogo) {
        boolean mostrar_submenu = true;
        while (mostrar_submenu) {
            System.out.println("=== REGISTAR MATERIAL ===");
            System.out.println("1. Libros");
            System.out.println("2. Revistas");
            System.out.println("3. Volver");

            String opcion_submenu = sc.nextLine();

            switch (opcion_submenu) {
                case "1" -> registarLibro(sc, catalogo);

                case "2" -> registrarRevistas(sc, catalogo);

                case "3" -> mostrar_submenu = false;
                default -> System.out.println("Error: opción ingresada no valida.");
            }

        }

    }

    static void registarLibro(Scanner sc, ArrayList<Material> catalogo) {
        boolean mostrar_submenu = true;
        while (mostrar_submenu) {
            System.out.println("Titulo: ");

            String titulo = sc.nextLine().strip();
            System.out.println("Autor: ");
            String autor = sc.nextLine().strip();

            int cantidadDisponible = 0;

            boolean validacion_cantidad = true;
            while (validacion_cantidad) {
                try {
                    System.out.println("Cantidad diponible de libros: ");
                    cantidadDisponible = Integer.parseInt(sc.nextLine().strip());

                    if (cantidadDisponible < 1){
                        System.out.println("Error: debe ser un entero positivo.");
                    }
                    else{
                        validacion_cantidad = false;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error: Debe ingresar un número entero positivo");
                }
            }

    
            int numPaginas = 0;
            boolean validacion_numero = true;

            while (validacion_numero) { 
                try {
                    System.out.println("Numero de paginas: ");
                    numPaginas = Integer.parseInt(sc.nextLine().strip());
                    if (numPaginas < 1) {
                        System.out.println("Error: debe ser un entero positivo.");
                    } else {
                        validacion_numero = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debe ingresar un número entero positivo");
                }
            }

           
            Libro nuevoLibro = new Libro(numPaginas, autor, cantidadDisponible, titulo);
            catalogo.add(nuevoLibro);
            System.out.println("=== LIBRO AGREGADO CON EXITO ===");
            mostrar_submenu = false;

        }
    }

    static void registrarRevistas(Scanner sc, ArrayList<Material> catalogo){
        
    }

}