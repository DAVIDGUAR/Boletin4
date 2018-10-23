/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author david
 */
public class circulo {
    

    //ATRIBUTOS
    private double radio;
  private final double PI = 3.14;

    //CONSTRUCTORES
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    //METODOS DE ACCESO

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //METODOS DE CALCULO

    
    public void calcularArea(){
        double area;
        
        area= 2*this.PI*Math.pow(this.radio, this.radio);
        System.out.println("El area del circulo de radio "+this.radio+" es de "+area);
    
    }
    

    public void calcularLonxitude(){
    double lonxitude;
    
    lonxitude=2*this.PI*radio;
       System.out.println("El perimetro  de la circunferencia de radio "+this.radio+" es de "+lonxitude);
    
    }
}
