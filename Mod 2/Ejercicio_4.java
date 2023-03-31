import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ 9 * C / 5 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        int centigrados ;
        System.out.println("Ingrese la cantidad de grados centígrados");
        Scanner leer= new Scanner(System.in);
        centigrados= leer.nextInt();
        System.out.println ("F= " + (32
        + 9 * centigrados / 5));
        
    }
}
