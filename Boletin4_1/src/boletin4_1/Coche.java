
package boletin4_1;


public class Coche {
    
    private int velocidad;
    
    //contructor sin parametro
    
    //public Coche(){
      //  velocidad=0;
   
//}
   // constructor parametros
    
   public Coche(int velocidad)
   {
        this.velocidad=velocidad;
       
   }

  
    
//METODOS
   
   
   
   public void setVelocidad(int velocidad){
       
       this.velocidad=velocidad;
       
   }
    
    /**    HACE LO MISMO QUE EL setVelocidad 
     * 
     * public void velocidadInicial(int inicial){
    velocidad=velocidad+inicial;
    }
    * 
    */
   
   
   
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