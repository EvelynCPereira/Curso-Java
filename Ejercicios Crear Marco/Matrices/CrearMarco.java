

import java.util.Scanner;

import Utilidades.EfectoMaqEscribir;
import Utilidades.LimpiarPantalla;

public class CrearMarco {
    
    public static void main(String[] args) {
        
        //Declaración de Variables.
        int filas=0, columnas=0, x=0, y=0;
        String salir = "C";

        //Instancias de Algunas Utilidades.
        Scanner sc = new Scanner(System.in);

        LimpiarPantalla l = new LimpiarPantalla();
        EfectoMaqEscribir ef = new EfectoMaqEscribir();

        /*Este Do_While lo utilizo para preguntar si quieren hacer un nuevo dibujo
          con otras dimenciones. Sin salir del programa*/
        do {

            l.limpiar();

            //Solicito Al usuario El Largo de Las Filas y Las Columnas.
            System.out.print("Por Favor, Ingrese La Cantidad de Filas Que Tendra el Marco ... ");
            filas = sc.nextInt();
            l.limpiar();
            System.out.print("Muchas Gracias!! Ahora Por Favor ingrese la Cantidad de Columnas ... ");
            columnas = sc.nextInt();
            l.limpiar();
            
            //Algo de Chachara para que el usuario se sienta a gusto ... !!! 
            ef.iniciar_efecto("Haciendo Nuestra Magia ... ");
            System.out.println("\n");

            //Ciclos For Para la Creacion del Marco
            for (x=0; x < filas; x++) {       
                for (y=0; y < columnas; y++) {
                    if(x==0 || x==(filas-1)){
                        System.out.print("*");
                    }else if(y==0 || y==(columnas-1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }

            System.out.print("Si desea Dibujar Un nuevo Marco, escriba \"C\", De Lo Contrario Escriba \"S\" para Salir. ");
            salir=sc.next();
        } while (!salir.equalsIgnoreCase("s"));

        sc.close();
    }
}
