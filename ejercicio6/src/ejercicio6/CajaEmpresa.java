

package ejercicio6;

public class CajaEmpresa {
    
    private double capitalFundacional = 1000;
    
    public synchronized void ingreso(double cantidad){
        capitalFundacional += cantidad;
        System.out.println("Ingreso: " + cantidad);
        System.out.println("Capital actual: " + capitalFundacional);
    }
    
    public synchronized void extraccion(double cantidad){
        if(capitalFundacional >= cantidad){
            capitalFundacional -= cantidad;
            System.out.println("Extraccion: " + cantidad);
            System.out.println("Capital actual: " + capitalFundacional);
        } else{
            System.out.println("Extraccion cancelada, fondos insuficientes");
        }
    }
    
    public double getCapitalFundacional(){
        return capitalFundacional;
    }
}
