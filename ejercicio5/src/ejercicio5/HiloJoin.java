
package ejercicio5;


public class HiloJoin implements Runnable{
    private int numero;

    public HiloJoin(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        System.out.println("soy el hilo número " + numero);
    }
}
