package Mod_3;

import java.util.Scanner;


/*Crear un programa que dado un número determine si es par o impar. */

public class Par_Impar_ej1 {
    public static void main(String[] args) {
        int num;
        System.out.println("Ingrese un número");
        Scanner leer= new Scanner (System.in);
        num= leer.nextInt();
        if (num % 2==0) {
            System.out.println("Su número es par");
        }
        else {
            System.out.println("Su número es impar");
        }
    }
}

