/*Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial. */
package Mod_3;

import java.util.Scanner;

public class sumaFinal_ej5 {
    public static void main(String[] args) {
        double limite, num1, suma=0;
        System.out.println("Ingrese un valor límite");
        Scanner leer= new Scanner (System.in);
        limite=leer.nextDouble();
        do {
            System.out.println("Ingrese un número");
            num1=leer.nextDouble();
            suma=(suma + num1);
        } while (suma<=limite);
        System.out.println(suma);
    }
}
