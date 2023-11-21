
package ejercicio8;

import java.util.logging.*;

public class MyThread extends Thread{
    
    int primeraLlamada, ultimaLlamada;
    Ascensor ascensor;
    String persona;
    
    public MyThread(int primeaLlamada, int ultimaLlamada, Ascensor ascensor, String persona) {
        this.primeraLlamada = primeraLlamada;
        this.ultimaLlamada = ultimaLlamada;
        this.ascensor = ascensor;
        this.persona = persona;
    }

    @Override
    public void run() {
        try {
            ascensor.llamarAscensor(primeraLlamada, persona);
            Thread.sleep(100);
            ascensor.llamarAscensor(ultimaLlamada, persona);
            System.out.println("");
        } catch (InterruptedException e) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    
    
    
}
