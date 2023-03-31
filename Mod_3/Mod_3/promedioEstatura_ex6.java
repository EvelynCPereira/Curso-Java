/*Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general */
package Mod_3;

import java.util.Scanner;

public class promedioEstatura_ex6 {
    public static void main(String[] args) {
        double  estatura=0, suma1=0, suma2=0;
        int cant_personas, promedio_gral=0, promedio_enanos=0;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a promediar la estatura");
        cant_personas= leer.nextInt();

        for (int i = 0; i < cant_personas; i++) {
            System.out.println("Ingrese estatura de la persona");
            estatura= leer.nextDouble();
            if (estatura <1.60){
                promedio_enanos= (promedio_enanos + 1);
                suma1=suma1 + estatura;
            }
            else{
                promedio_gral=promedio_gral +1;
                suma2=suma2 + estatura;
            }
        }
        System.out.println("El promedio de estatura por debajo a 1.60 corresponde a :" +
        promedio_enanos + " personas" + " Y la estatura media de ellos es de : " + suma1/promedio_enanos );
        System.out.println("El promedio de estatura general es de : " + (suma1+ suma2)/(promedio_enanos + promedio_gral) );
    }
}
