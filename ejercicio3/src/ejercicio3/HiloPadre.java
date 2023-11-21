
package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;


public class HiloPadre extends Thread {
    
     public HiloPadre(String nombre){
        super(nombre);
    }
    
     @Override
    public void run(){
         System.out.println(getName() + " empezo");
         
         HiloHijo hiloHijo = new HiloHijo(getName() + " - hijo 1");
         
         hiloHijo.start();
         try {
             hiloHijo.join();
         } catch (InterruptedException ex) {
             Logger.getLogger(HiloPadre.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         System.out.println(getName() + " acabo");
    }
}
