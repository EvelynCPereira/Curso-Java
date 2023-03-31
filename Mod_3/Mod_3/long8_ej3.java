/*Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota:investigarla
funciónLenght()enJava */
package Mod_3;

import java.util.Scanner;

public class long8_ej3 {
    public static void main(String[] args) {
        String frase;
        System.out.println("Ingrese una palabra/frase de 8 caracteres");
        Scanner leer = new Scanner(System.in);
        frase=leer.nextLine();

        if (frase.length()==8){
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
    }
}
