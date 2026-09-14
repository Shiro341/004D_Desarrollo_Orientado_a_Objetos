package VideoJuegos;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    static ArrayList<ProductoFisico> coleccionJuegosFisicos = new ArrayList<>();
    static ArrayList<ProductoDigital> coleccionJuegosDigital = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        boolean mostrarMenu = true;

        while (mostrarMenu) {
            System.out.println("1. Regitrar Producto");
            System.out.println("2. Listar inventario");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("4. Vender producto");
            System.out.println("5. Resumen del inventario");
            System.out.println("6. Salir");
            System.out.println("7.Insertar datos de prueba");

            String opcion_menu = sc.nextLine();

            switch (opcion_menu) {
                case "1":
                    registrarProducto();

                    break;
                case "2":
                    listarInventario();
                    break;
                case "3":
                    buscarProductoPorNombre();
                    break;
                case "4":
                    venderProductoPorNombre();
                    break;
                case "5":

                    break;
                case "6":

                    break;

                case "7":
                    insertarDatosDePrueba();
                    break;

                default:
                    break;
            }

        }
    }

    static public void registrarProducto() {
        boolean mostrarMenu = true;

        while (mostrarMenu) {
            System.out.println("1. Registrar un producto Físico");
            System.out.println("2. Registrar producto digital");
            System.out.println("3. Volver al menu");

            System.out.println("Ingrese una opcion: ");

            String opcion_registro_juego = sc.nextLine();

            switch (opcion_registro_juego) {
                case "1":
                    registrarProductoFisico();

                    break;
                case "2":
                    registrarProductoDigital();
                    break;
                case "3":
                    mostrarMenu = false;
                    break;

                default:
                    break;
            }
        }
    }

    static public void registrarProductoFisico(){
        System.out.println("Ingrese nombre del juego: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese precio base; ");
        int precioBase = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese stock del juego: ");
        int stock = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese costo de envio del juego: ");
        int costoEnvio = Integer.parseInt(sc.nextLine());



        ProductoFisico juego = new ProductoFisico(nombre, precioBase, stock, costoEnvio);

        coleccionJuegosFisicos.add(juego);
    }

    static public void registrarProductoDigital(){
        System.out.println("Ingrese nombre del juego: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese precio base; ");
        int precioBase = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese stock del juego: ");
        int stock = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el descuento: ");
        int descuento = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese la plataforma de juego: ");
        String plataforma = sc.nextLine();

        ProductoDigital juego = new ProductoDigital(nombre, precioBase, stock, descuento, plataforma);

        coleccionJuegosDigital.add(juego);
    }

    static public void listarInventario(){
        System.out.println("===INVENTARIO DE JUEGOS FISICOS===");
        for (ProductoFisico juegoFisico : coleccionJuegosFisicos){
            System.out.println(juegoFisico.mostrarInfo());
        }

        System.out.println("===INVENTARIO DE JUEGOS DIGITALES===");
        for (ProductoDigital juegoDigital : coleccionJuegosDigital){
            System.out.println(juegoDigital.mostrarInfo());
        }
        
    }

    static void insertarDatosDePrueba(){
        coleccionJuegosFisicos.add(new ProductoFisico("Pokemon Escudo", 45000, 10, 2500));
        coleccionJuegosFisicos.add(new ProductoFisico("Factorio", 28000, 60, 2500));
        coleccionJuegosFisicos.add(new ProductoFisico("PES 2017", 32000, 100, 3500));



    
    }
    
    static void buscarProductoPorNombre(){
        System.out.println("===INGRESE NOMBRE DEL JUEGO A BUSCAR===)");
        String nombre_a_buscar = sc.nextLine();

        for( ProductoFisico juego : coleccionJuegosFisicos){
            if(juego.getNombre().contains(nombre_a_buscar)){
                System.out.println(juego.mostrarInfo());
            }
        }

        for( ProductoDigital juego : coleccionJuegosDigital){
            if(juego.getNombre().contains(nombre_a_buscar)){
                System.out.println(juego.mostrarInfo());
            }
        }
    }

    static void venderProductoPorNombre(){
        System.out.println("===VENTA DEL JUEGO===");
        buscarProductoPorNombre();
    }
















}
