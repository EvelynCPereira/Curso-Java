/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar. */
package Mod_3;

public class cambioVariables_ex2 {
    public static void main(String[] args) {
        //Declaracion de variables y asignacion de valor//
        int A=1, B=2, C=3, D=4, x=0;
        System.out.println(A + " " + B + " "+ C + " "+ D);
        //auxiliar x para no perder valor de B//
        x = B;
        //Intercambio de valores//
        B = C;
        C = A;
        A = D;
        D = x;
        System.out.println(A + " " + B + " "+ C + " "+ D);
    }
}
