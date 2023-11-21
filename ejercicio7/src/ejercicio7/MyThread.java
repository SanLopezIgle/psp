
package ejercicio7;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MyThread extends Thread{
    private String nombre;
    private String cadena;
    BuzonCorreo buzon;

    public MyThread(String nombre, String cadena, BuzonCorreo buzon) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.buzon = buzon;
    }
    
    @Override
    public void run() {
        if(nombre.equals("Enviar")){
            try {
                buzon.enviarMensaje(cadena);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                buzon.leerMensaje();
            } catch (InterruptedException e) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
    
}
