
package ejercicio5;


public class HiloPrioridades implements Runnable{
    private int numero;

    public HiloPrioridades(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        System.out.println("Hola, soy el hilo número " + numero);
    }
}
