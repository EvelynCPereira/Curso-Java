/*Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
S/N? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

3
 */
package Mod_3;

import java.util.Scanner;

public class calculadora_ej6 {
    public static void main(String[] args) {
        int num1, num2, option;
        String letra="N";
        System.out.println("Ingrese dos números enteros positivos");
        Scanner leer= new Scanner (System.in);
       num1=leer.nextInt();
       num2=leer.nextInt();
        do {
            System.out.println("MENU" + "\n" + "1. Sumar" + "\n" + "2. Restar"+"\n" + "3. Multiplicar" + 
            "\n" + "4. Dividir" + "\n" + "5. Salir" + "\n" + "Elija opción:");
            option=leer.nextInt();
            switch (option) {
                case 1:
                    System.out.println("La suma de sus números es: " + (num1+num2)); 
                    break;
                case 2:
                    System.out.println("La resta de sus números es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("El resultado es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("El resultado es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa S/N?");
                    letra= leer.next();
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (letra =="N");
    }
}