/*Una obra social tiene tres clases de socios:
○Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio. */
package Mod_3;

import java.util.Scanner;

public class obraSocial_ex5 {
    public static void main(String[] args) {
        double valor=0;
        String letra="*";
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese clase de socio: A, B o C");
        letra= leer.nextLine();
        System.out.println("Ingrese el costo del tratamiento para saber si obtiene un descuento y cuánto debe abonar con descuento incluido");
        valor= leer.nextDouble();
        if (letra.equals("A")){
            System.out.println("Al ser socio clase A, obtiene un 50% de descuento. Debe abonar $ " + valor/2); 
        }
        if (letra.equals("B")){
            System.out.println("Al ser socio clase B, obtiene un 35 % de descuento. Debe abonar $ " + valor*0.65); 
            }
        if (letra.equals("C")){
             System.out.println("Al ser socio clase C, no obtiene descuento.  Debe abonar $ " + valor); 
            }
        }
}
