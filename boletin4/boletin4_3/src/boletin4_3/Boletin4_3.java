package boletin4_3;

/**
 *
 * @author david
 */
public class Boletin4_3 {

  
import java.util.Scanner;

 

    public static void main(String[] args) {
    
        
        Scanner teclado=new Scanner(System.in);
        
        Circulo circulo1= new Circulo();
        
        
        System.out.println("Que radio tiene el circulo que quieres calcular?");
        circulo1.setRadio(teclado.nextDouble());
        
        circulo1.calcularArea();
        circulo1.calcularLonxitude();
    }
    
}
