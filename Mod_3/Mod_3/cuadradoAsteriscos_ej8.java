/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
****
*  *
*  *
**** */
package Mod_3;

import java.util.Scanner;

public class cuadradoAsteriscos_ej8 {
    public static void main(String[] args) {
        int num, num2, j=0, i=0; 
        System.out.println("Ingrese las dimensiones del cuadrado a dibujar");
        Scanner leer= new Scanner(System.in);
        num= leer.nextInt();
        num2= leer.nextInt();
        String[] [] matriz= new String[num] [num2];
        for (i = 0; i< num ; i++) {
            for (j=0; j< num2; j++){
                if (i==0 || i==(num-1) || j==0 || j==(num2-1)) {
                    matriz[i][j] = "*" ;
                }
                else {
                   matriz [i][j]= (" ");
                }
                System.out.print(matriz[i][j] );
            } 
            System.out.println("");  
        }
    }
}
