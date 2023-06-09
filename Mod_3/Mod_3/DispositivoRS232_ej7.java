/*Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE, y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(),Length(),equals().*/

package Mod_3;

import java.util.Scanner;

public class DispositivoRS232_ej7{
public static void main(String[] args) {
    String cadena="&&&&&";
    int cont1=0;
    int cont2=0;
    Scanner leer= new Scanner (System.in);
    System.out.println("Ingrese una cadena de 5 caracteres de largo y presione enter, para finalizar escribir &&&&&");
        do {
            cadena= leer.next();
            if ((cadena.substring(0,1)).equals("x") && (cadena.substring(4)).equals("o") 
            && cadena.length()==5) {
            cont1=(cont1 +1);
            }
            else {
                cont2=(cont2 +1);
            }
        } while (!cadena.equals("&&&&&"));
       System.out.println(cadena.substring(0,1));
    System.out.println("Cantidad de lecturas correctas: " + cont1);
    System.out.println("Cantidad de lecturas incorrectas: " + (cont2-1));
    }     
}
