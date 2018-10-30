
package boletin4_1;

/**
 * modificar la velocidad vehiculo
 * @author drodriguezguardiola
 * @since octubre 2018
 * @version 1.0
 * 
 */
public class Boletin4_1 {


    public static void main(String[] args) {
        
        
        /**
         * @param crea el obx velocidadCoche
         * @param incrementa la velocidad
         * @param reduce la velocidad
         * @param muestra la velocidad actual del vehiculo
         * 
         */
        
        Coche velocidadCoche = new Coche();
        velocidadCoche.acelerar(80);
        velocidadCoche.frenar(20);
        System.out.println("velocidad coche=" +velocidadCoche.getVelocidad());
        
        
    }
    
}
