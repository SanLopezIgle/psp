
package ejercicio7;

/**
 * Programa que simule un buzón de correo (recurso compartido), 
 * de manera que se pueda leer un mensaje o enviarlo. El buzón solamente 
 * puede almacear un mensaje, de manera que para poder escribir se debe 
 * encontrar vacío y para poder leer debe de estar lleno. Crear varios hilos 
 * lectores y escritores que manejen el buzón de manera sincronizada.
 */

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        BuzonCorreo buzon = new BuzonCorreo();
        
        String cadena1 = "hola san";
        String cadena2 = "hola ana";

        MyThread escritor1 = new MyThread("escritor1", cadena1, buzon);
        MyThread lector1 = new MyThread("lector1", cadena1, buzon);
        MyThread escritor2 = new MyThread("escritor2", cadena2, buzon);
        MyThread lector2 = new MyThread("lector2", cadena2, buzon);

        escritor1.start();
        lector1.start();
        escritor2.start();
        lector2.start();
    }
    
}
