/* Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.*/

package Mod_3;

import java.util.Scanner;

public class ValidarA_ej4 {
    public static void main(String[] args) {
        String frase;
        System.out.println("Ingrese una frase/palabra");
        Scanner leer= new Scanner(System.in);
        frase= leer.nextLine();
        System.out.println( frase.substring(0,1));
       if ((frase.substring(0,1)).equals("a")){
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }

    }
}
