/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner conversion = new Scanner(System.in);
         
        float cambio=0,euro=0,dolar;
        
        
        System.out.println("teclea cambio");
        cambio=conversion.nextFloat();
        
        System.out.println("teclea euro");
        euro=conversion.nextFloat(); 
        
        dolar=cambio*euro;
        System.out.println("dolar ="+dolar);
    }
    
}