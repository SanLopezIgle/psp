
package ejercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Simular la caja de una empresa con dos hilos. Uno simulará el ingreso, 
 * que compra de artículos por parte de clientes y el otro la extracción de 
 * dinero de la caja con el pago a proveedores. La cuenta tendrá un capital 
 * fundacional. Realizar 10 ingresos y 5 extracciones.
 */
public class Ejercicio6 {

    public static void main(String[] args) throws InterruptedException {
        
        CajaEmpresa caja = new CajaEmpresa();
        double cantidad = Math.random() * 1000;
        
        Thread hiloIngreso = new Thread(() -> {
            for (int i = 1; i < 11; i++) {
                System.out.println("Ingreso numero: " + i);
                caja.ingreso(cantidad);
                try {
                    Thread.sleep(100); // Simular tiempo entre operaciones
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ejercicio6.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        Thread hiloExtraccion = new Thread(() -> {
            for (int i = 1; i < 6; i++) {
                System.out.println("Extraccion numero " + i);
                caja.extraccion(cantidad);
                try {
                    Thread.sleep(150); // Simular tiempo entre operaciones
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ejercicio6.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        hiloIngreso.start();
        hiloExtraccion.start();
        
        hiloIngreso.join();
        hiloExtraccion.join();
        
        System.out.println("Capital final: " + caja.getCapitalFundacional());
    }
    
}
