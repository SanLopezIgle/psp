
package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;


public class HiloHijo extends Thread{
    
    private static int contadorHijos = 1;
    private static final int MAX_HIJOS = 5;
    
     public HiloHijo(String nombre){
        super(nombre);
    }
    
     @Override
    public void run(){
        System.out.println(getName() + " empezo");
        
        if(contadorHijos < MAX_HIJOS){
           HiloHijo hiloHijo = new HiloHijo(getName() + " - hijo " + (contadorHijos + 1));
           contadorHijos++;
           hiloHijo.start();
           
           try {
            hiloHijo.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloHijo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

         for (int i = 0; i <= 10; i++) {
             System.out.println(getName() + " - procesando" + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloHijo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
         System.out.println(getName() + " acabo");
    }
}
