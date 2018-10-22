
package boletin4_1;


public class Boletin4_1 {


    public static void main(String[] args) {
        
        Coche velocidadCoche = new Coche();
        velocidadCoche.acelerar(80);
        velocidadCoche.frenar(20);
        System.out.println("velocidad coche=" +velocidadCoche.getVelocidad());
        
        
    }
    
}
