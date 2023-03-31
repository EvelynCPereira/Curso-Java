package Utilidades;

public class EfectoMaqEscribir {

    public static void main(String[] args) {
        
    }
    public void iniciar_efecto(String mensaje) {
        if (mensaje == null)
            return;
        for (int i = 0 ;  i < mensaje.length() ; i++) {
            String sub = mensaje.substring(0, i + 1);
            for (int j = 0 ; j < 10 ; j++) {
                try {
                    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                } catch (Throwable ignored) {}
                System.out.print(sub);
            }
        }
    }
    
}
