
package ejercicio5;

/**
 * Escribe una clase que cree dos hilos y fuerce que la escritura del segundo sea siempre anterior a la escritura por pantalla del primero. Ejemplo de ejecución: Hola, soy el hilo número 2 Hola, soy el hilo número 1 
    a) hazlo con join
    b )hazlo con prioridades
 */
public class Ejercicio5 {

    public static void main(String[] args) throws InterruptedException {
        
        /*
        HiloJoin hiloJoin1 = new HiloJoin(1);
        HiloJoin hiloJoin2 = new HiloJoin(2);
        
        Thread thread1 = new Thread(hiloJoin1);
        Thread thread2 = new Thread(hiloJoin2);
        
        thread1.start();
        thread2.start();
        
        thread2.join();
        
        System.out.println("fin");
        */
        
        HiloPrioridades hiloPrioridades1 = new HiloPrioridades(1);
        HiloPrioridades hiloPrioridades2 = new HiloPrioridades(2);
        
        Thread thread1 = new Thread(hiloPrioridades1);
        Thread thread2 = new Thread(hiloPrioridades2);
        
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        
        thread1.start();
        thread2.start();
        
        System.out.println("fin");
    }
    
}
