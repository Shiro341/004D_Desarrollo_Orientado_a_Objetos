package Clase_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones {
    public static void main(String[] args) {
        System.out.println("Todo impeke");
        Scanner sc = new Scanner(System.in);
        boolean mostrar_menu = true;

        while (mostrar_menu) {
            System.out.println();
            System.out.println("1. Conociendo Arrays");
            System.out.println("2. Conociendo ArraysList");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opcion: ");
            String opcion_ingresada = sc.nextLine();
            
            switch (opcion_ingresada) {
                case "1":
                    conociendoArrays();
                    break;

                case "2":
                    conociendoArraysList();
                    break;

                case "9":
                    mostrar_menu = false;
                    
                    break;
                default:
                    break;
            }
        }




    }

    static void conociendoArrays(){
        String[] alumnos = new String[4];
        alumnos[0] = "Diego Marín";
        alumnos[1] = "Amaro Lopez";
        alumnos[2] = "Mariany Sanchez";
        alumnos[3] = "Gustavo Araneda";
        

        System.out.println("A ver si es verdad: " + alumnos[0]);

        Integer[] edades = new Integer[4];
        edades[0] = 18;
        edades[1] = 19;
        edades[2] = 19;
        edades[3] = 18;
        

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Datos de " + alumnos[i] + " edad " + edades[i]);
        }
    }

    static void conociendoArraysList(){

        ArrayList<String> alumnos = new ArrayList<>();
        
        alumnos.add("Diego Marín");
        alumnos.add("Amaro Lopez");
        alumnos.add("Mariany Sanchez");
        alumnos.add("Gustavo Araneda");


        //remplazar un valor
        alumnos.set(1,"Amaró Lopez");

        //eliminar a AMARO
        alumnos.remove(1);

        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i)); 
        }




    }
}
