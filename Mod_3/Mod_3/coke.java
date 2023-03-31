package Mod_3;

import java.util.Scanner;

public class coke {
    public static void main(String[] args) {
        
        //Declaracion de Variables
        int cantidad_correctas=0, cantidad_incorrectas=0;
        String cadena="";
        Scanner obtener = new Scanner(System.in);

        //Ciclo Do_While para Comprobar que "Cadena" no sea "&&&&&" y si es así se termina el programa. 
        limpiar_pantalla();

        do {

            //El Usuario Debe Ingresar 5 Letras.
            System.out.println("Por Favor Ingresa Una Cadena de un Maximo de 5 Caracteres, Para finalizar teclee \"&&&&&\"");
            cadena = obtener.nextLine();
            
            //Chequeo que tenga el largo correcto. Si NO lo tiene envio un mensaje Para que lo Corrija.
            if(cadena.length()==5){ 
                //Chequeo Que la cadena tenga los Caracteres Solicitados X y O. Y sumo Los Correctos E Incorrectos.
                if ((cadena.substring(0,1)).equals("x") && (cadena.substring(4)).equals("o")) {
                    cantidad_correctas = cantidad_correctas + 1;
                    System.out.println("La Cadena Ingresada es Correcta");
                    //Este pequeño trozo de Codigo Hace que Espere 2 segundo el programa para despues limpiar la pantalla.
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //Limpio la pantalla
                    limpiar_pantalla();
        
                    if(cadena.equals("&&&&&")){
                        System.out.println("Cerrando el Sistema, Hasta Luego... !!!");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        limpiar_pantalla();
                    } else {

                        System.out.println("La Cadena Ingresada es Incorrecta");
                        cantidad_incorrectas = cantidad_incorrectas + 1;
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        limpiar_pantalla();
                    }
                }
            }else{
                //Mensaje para indicarle al usuario que esta ingresando un largo de cadena no permitido.
                System.out.println("El Largo de la cadena Introducida No esta Permitido en el Sistema!!!");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                limpiar_pantalla();
            }
        } while (!cadena.equals("&&&&&"));

        //Mensajes para indicar que ha finalizado el programa.
        System.out.println("¡¡¡El programa Ha Finalizado!!!");
        System.out.println("Se Ingresaron " + cantidad_correctas + " Cadenas Correctas");
        System.out.println("Se Ingresaron " + cantidad_incorrectas + " Cadenas Incorrectas");
        System.out.println("Gracias por Usar CokeBot Systems !!!");
    }
    //Metodo Para Limpiar la Pantalla
    public static void limpiar_pantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
