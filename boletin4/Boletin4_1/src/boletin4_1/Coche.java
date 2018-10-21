
package boletin4_1;


public class Coche {
    
    private int velocidad;
    
    //contructor sin parametro
    public Coche(){
   
}
    
//METODOS
    
    public int getVelocidad(){
    return velocidad;
    }
    
    
    public void acelerar (int valor){
        int acelerar;
        acelerar= velocidad+valor;
    } 
    public void setvalor(int valor){
        this.valor=valor;
    }
    public void frenar (int menos){
        int frenar;       
        frenar=((velocidad+valor)-menor);
    }
    public void setmenos(int menos){
        this.menos=menos;
    }

            }