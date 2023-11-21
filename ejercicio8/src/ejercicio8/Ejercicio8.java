
package ejercicio8;

/**
 * Desarrolla un programa empleando hilos que simule el comportamiento de un 
 * ascensor en un edificio de 20 plantas. Cuando alguien llama el ascensor desde 
 * un piso, irá a ese piso cuando pueda (si está parado, va en ese rato, si está
 * en marcha, solo podrá ir cuando haya finalizado su recorrido, ya sea de 
 * subida o de bajada). 
 * Para poder controlar este movimiento, precisamos conocer cuál es el 
 * piso en el que se encuentra el ascensor.
 */

public class Ejercicio8 {

    
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();

        new MyThread(0, 8, ascensor, "sandra").start();
        new MyThread(6, 3, ascensor, "ana").start();
        new MyThread(2, 5, ascensor, "sara").start();
        new MyThread(2, 5, ascensor, "kevin").start();
    }
    
}
