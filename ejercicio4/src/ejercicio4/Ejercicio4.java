
package ejercicio4;

/**
 * Realiza un programa en java que ejecute tres hilos de forma concurrente.
* Uno de ellos debe sumar los números pares del 1 al 1000, otro los impares,
* y otro, los que terminen en dos o en tres.
 * @author Sandra
 */

public class Ejercicio4 {

    public static void main(String[] args) throws InterruptedException {
        Pares sumaPares = new Pares();
        Impares sumaImpares = new Impares();
        TerminadoDosTres sumaTerminadoDosTres = new TerminadoDosTres();
        
        Thread hiloPares = new Thread(sumaPares);
        Thread hiloImpares = new Thread(sumaImpares);
        Thread hiloTerminado = new Thread(sumaTerminadoDosTres);
        
        hiloPares.start();
        hiloImpares.start();
        hiloTerminado.start();
        
        
        hiloPares.join();
        hiloImpares.join();
        hiloTerminado.join();
        
        System.out.println("suma numeros pares: " + sumaPares.getSuma());
        System.out.println("suma numeros impares: " + sumaImpares.getSuma());
        System.out.println("suma numeros terminados en dos o tres: " + sumaTerminadoDosTres.getSuma());
    }
    
}
