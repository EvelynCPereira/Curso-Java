/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano. */
package Mod_3;

import java.util.Scanner;

public class numRomano_ex4 {
    public static void main(String[] args) {
        
        LimpiarPantalla limpiar = new LimpiarPantalla();
        limpiar.limpiar();
        int num=0;
        String enter= ("\n");
        do{
            System.out.println("Ingrese un número del 1 al 10");
            Scanner leer= new Scanner(System.in);
            num= leer.nextInt();
            switch (num) {
                 case 1:
                    System.out.println("I");
                    enter= leer.next();
                    limpiar.limpiar();
                    break;
                   
                case 2:
                    System.out.println("II");
                    enter= leer.next();
                    limpiar.limpiar();
                    break;
                case 3:
                    System.out.println("III");
                    enter= leer.next();
                    limpiar.limpiar();
                    break;
                case 4:
                    System.out.println("IV");
                    enter= leer.next();
                    limpiar.limpiar();
                    break;
                case 5:
                    System.out.println("V");
                    enter= leer.next();
                    limpiar.limpiar();
                    break;
                case 6:
                    System.out.println("VI");
                    enter= leer.next();
                    limpiar.limpiar();
                    break;
                case 7:
                    System.out.println("VII");
                    enter= leer.next();
                    limpiar.limpiar();
                    break;
                case 8:
                    System.out.println("VIII");
                    enter= leer.next();
                    limpiar.limpiar();
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("X");
                    enter= leer.next();
                    limpiar.limpiar();
                    break;
                default:
                    System.out.println("El número ingresado es inválido");
                    break;
            }
           
        }while(num <=10);
    }
}
