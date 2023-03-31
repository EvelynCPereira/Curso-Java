package Utilidades;

public class LimpiarPantalla{

    public void main(String[] args) {

        limpiar();
    
    }

    public void limpiar() {

        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}