import java.util.Scanner;

/*Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma */

public class Ejercicio_1{


public static void main(String[] args) {
    System.out.println("Ingrese dos números");
    Scanner leer= new Scanner (System.in);
    int num1, num2, suma;
    num1= leer.nextInt();
    num2= leer.nextInt();
    System.out.println("El resultado es de = " + (num1 + num2));
}
}