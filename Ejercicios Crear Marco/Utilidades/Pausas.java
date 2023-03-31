package Utilidades;

public class Pausas {

    public void main(String[] args) {

    }

    public void stop(int ms) {
        
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    
}
