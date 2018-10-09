/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_1;

import java.util.Scanner;



/**
 * @author drodriguezguardiola
 */
public class Boletin1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
      float base= 4f,altura= 3f,area;
      System.out.println("teclea base");
      base=ler.nextFloat();
      System.out.println("teclea altura");
      altura=ler.nextFloat();
      area = base*altura/2;
      System.out.println("area= "+area);
      
              
    }
    
}

