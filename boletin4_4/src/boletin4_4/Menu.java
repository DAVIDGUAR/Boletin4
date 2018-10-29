/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author drodriguezguardiola
 */
public class Menu {
    
    
    private float polbo,patacas;
    
    
    //contructor con parametros
    
    public Menu (float polbo, float patacas){
        this.polbo=polbo;
        this.patacas=patacas;
        
    }
    
    
    public void setpolbo(float polbo){
        this.polbo=polbo;
    }
    
    public float getpolbo(){
        return polbo;
    }
    
    public void setpatacas(float patacas){
        this.patacas=patacas;
    }
    
    public float getpatacas(){
       return patacas; 
    }
    
    
}
