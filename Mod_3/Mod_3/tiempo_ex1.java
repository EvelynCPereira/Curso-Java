/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas */
package Mod_3;

import java.util.Scanner;

public class tiempo_ex1 {
    public static void main(String[] args) {
        int minutos, horas=0, dias=0;
        System.out.println("Ingrese un tiempo en minutos");
        Scanner leer= new Scanner(System.in);
        minutos= leer.nextInt();
        horas= minutos/60;
        minutos= minutos%60;
            if (horas>24) {
                dias= horas/24;
                horas=horas%24;
            }
            System.out.println("Días: " + dias + "   Horas: " + horas + "  Minutos: " + minutos);
    }
}
