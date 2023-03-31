import java.util.Scanner;

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla */

public class Ejercicio_2{
public static void main(String[] args) {
System.out.println("Escriba su nombre");
Scanner leer= new Scanner(System.in);
String nombre;
nombre=leer.nextLine();
System.out.println("Hola " + nombre);
    }
}


