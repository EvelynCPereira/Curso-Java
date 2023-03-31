import java.util.Scanner;

/*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota:investigar la función Math.sqrt(). */
public class Ejercicio_5 {
    public static void main(String[] args) {
        int num;
        System.out.println("Ingreso un número");
        Scanner leer= new Scanner(System.in);
        num= leer.nextInt();
        System.out.println("Doble: " + (num*2) + "\n" + "Triple: " + (num*3) + "\n" + "Raiz 2: " + Math.sqrt(num));
    }
}
