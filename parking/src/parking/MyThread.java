
package parking;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;


public class MyThread  extends Thread{
    
    int numCoche;
    Parking parking;
    
    public MyThread(int numCoche, Parking miParking){
        this.numCoche = numCoche;
        this.parking = miParking;
    }
    
    @Override
    public void run(){
        try {
            parking.entrada(numCoche);
            Thread.sleep((long) (Math.random()*(2000-500)+500));
            parking.salida(numCoche);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
