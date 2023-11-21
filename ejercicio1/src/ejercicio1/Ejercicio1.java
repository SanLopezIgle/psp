
package ejercicio1;

/*
Programa en Java que cree dos hilos y los ejecuta. 
Los hilos escriben diez veces un número de iteración 
del bucle y su nombre. En cada iteración, después de 
escribir su nombre, se bloquean durante un tiempo aleatorio
de segundos y después vuelven a estar disponibles para su ejecución.
*/

public class Ejercicio1 {

    
    public static void main(String[] args) {
        MyThread hilo1 = new MyThread("hilo 1");
        MyThread hilo2 = new MyThread("hilo 2");
        
        hilo1.start();
        hilo2.start();
        
        System.out.println("fin");
    }
    
}
