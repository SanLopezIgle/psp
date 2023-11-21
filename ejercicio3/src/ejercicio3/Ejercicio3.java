
package ejercicio3;

/**
 * Realizar un programa que cree un hilo, que su vez cree otro
 * hilo, y así consecutivamente, hasta un total de cinco hilos.
 * Cada hilo debe presentar su nombre indicando que comenzó,
 * crear su hilo hijo y presentar su nombre 10 veces indicando 
 * que se está procesando, esperando un tiempo aleatorio
 * entre 100 y 600 milisegundos entre cada presentación. 
 * Cada hilo deberá esperar la que su hijo termine antes de 
 * presentar su último mensaje indicando su nombre y que finalizó.
 * 
 */
public class Ejercicio3 {

    
    public static void main(String[] args) {
        HiloPadre hiloPadre = new HiloPadre("hilo padre");
        hiloPadre.start();

        System.out.println("fin");
    }
    
}
