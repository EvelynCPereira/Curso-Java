/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String. */
package Mod_3;

import java.util.Scanner;

public class detectarVocal_ex3 {
    public static void main(String[] args) {
        System.out.println("Ingresar una letra");
        Scanner leer= new Scanner(System.in);
        String letra= leer.nextLine();
        if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||
        letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
            System.out.println("Es vocal");
        }
        else{
            System.out.println("No es vocal");
        }

    }
}
