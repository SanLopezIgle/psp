
package ejercicio7;


public class BuzonCorreo {
    
    private String mensaje = null;

    public synchronized void enviarMensaje(String mensaje) throws InterruptedException {
        while (this.mensaje != null) {
            wait();
        }
        this.mensaje = mensaje;
        notify();
        System.out.println("Mensaje enviado: " + mensaje);
    }
    
    public synchronized void leerMensaje() throws InterruptedException {
            while (this.mensaje == null) {
                wait();
            }
            System.out.println("Mensaje recibido: " + this.mensaje);
            this.mensaje = null;
            notify();
    }
}
