
package boletin4_1;


public class Coche {
    
    private int velocidad;
    
    //contructor sin parametro
    public Coche(){
        velocidad=0;
   
}
    //constructor parametros
    //public Coche(int velocidad,int valor,int menos){
     //   this.velocidad=velocidad;
      //  this.acelerar=valor;
      //  this.frenar=menos;
    //}
    
    
//METODOS
    
    public int getVelocidad(){
    return velocidad;
    }
    
    
    public void acelerar (int valor){
       
        velocidad= velocidad+valor;
    } 
      
    
    
    public void frenar (int menos){
       velocidad= (velocidad)-menos;
       
        }
    }