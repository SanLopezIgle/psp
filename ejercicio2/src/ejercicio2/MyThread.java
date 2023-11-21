
package ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MyThread extends Thread{
    
    public MyThread(String nombre){
        super(nombre);
    }
    
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println(getName() + ": Iteracion " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
