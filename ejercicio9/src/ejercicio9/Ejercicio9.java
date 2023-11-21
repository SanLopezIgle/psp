
package ejercicio9;

/**
 * Programa que crea 3 hilos, los ejecuta y espera la que el tercer hilo 
 * acabe para que se ejecute el segundo y a su vez, que el segundo acabe para
 * que se ejecute el primero. El programa principal no terminará hasta que
 * terminen los tres hilos. Los hilos escriben 10 veces el número de iteración
 * del bucle y su nombre. En cada iteración, después de escribir su nombre,
 * se bloquean durante un tiempo aleatorio entre medio y un segundo y vuelven
 * a estar disponibles para su ejecución.
 */
public class Ejercicio9 {

    
    public static void main(String[] args) throws InterruptedException {
        
        MyThread hilo1 = new MyThread("Hilo 1");
        MyThread hilo2 = new MyThread("Hilo 2");
        MyThread hilo3 = new MyThread("Hilo 3");
        
        Thread thread1 = new Thread(hilo1);
        Thread thread2 = new Thread(hilo2);
        Thread thread3 = new Thread(hilo3);
        
        thread3.start();
        thread2.start();
        thread1.start();
        
        thread3.join();
        thread2.join();
        thread1.join();
        
        System.out.println("fin");
    }
    
}
