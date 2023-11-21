
package ejercicio9;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MyThread implements Runnable{
    
    private String nombre;

    public MyThread(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println(nombre + " iteracion " + i);
            bloqueo();
        }
    }
    
    private void bloqueo(){
        try {
            Thread.sleep((long) (Math.random() * 500 + 500));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
