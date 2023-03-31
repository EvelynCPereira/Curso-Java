/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota:investigarlafunciónequals()enJava. */
package Mod_3;

import java.util.Scanner;

public class Eureka_ej2 {
    public static void main(String[] args) {
        String frase;
        System.out.println("Ingrese la clave");
        Scanner leer = new Scanner(System.in);
        frase= leer.nextLine();
        if (frase.equals("eureka")){
            System.out.println("Clave correcta");
        }
        else {
            System.out.println("Seguí participando");
        }
    }
}
