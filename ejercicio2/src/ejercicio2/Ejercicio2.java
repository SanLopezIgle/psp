
package ejercicio2;

/**
 * Programa que crea 4 hilos, los ejecuta y espera la que
 * estos terminen. Los hilos escriben 5 veces el número de 
 * iteración del bucle y su nombre. En cada iteración, después
 * de escribir su nombre, se bloquean durante un segundo y 
 * vuelven a estar disponibles para su ejecución.
 */

public class Ejercicio2 {

    
    public static void main(String[] args) throws InterruptedException {
        MyThread hilo1 = new MyThread("hilo 1");
        MyThread hilo2 = new MyThread("hilo 2");
        MyThread hilo3 = new MyThread("hilo 3");
        MyThread hilo4 = new MyThread("hilo 4");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();
        
        System.out.println("fin");
    }
    
}
