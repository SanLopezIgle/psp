
package ejercicio8;


public class Ejercicio8 {

    
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();

        new MyThread(0, 8, ascensor, "sandra").start();
        new MyThread(6, 3, ascensor, "ana").start();
        new MyThread(2, 5, ascensor, "sara").start();
        new MyThread(2, 5, ascensor, "kevin").start();
    }
    
}
