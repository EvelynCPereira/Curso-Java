import java.util.Scanner;

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota:investigar la función toUpperCase() y toLowerCase() en Java. */
public class Ejercicio_3 {
    public static void main(String[] args) {
        String frase;
        System.out.println("Ingrese una frase");
        Scanner leer= new Scanner(System.in);
        frase= leer.nextLine();
        System.out.println(frase.toUpperCase() + "\n" + frase.toLowerCase());
    }
}