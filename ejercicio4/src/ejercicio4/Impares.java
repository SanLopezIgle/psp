
package ejercicio4;


public class Impares implements Runnable{
    private int suma = 0;
    
    @Override
    public void run(){
        for (int i = 1; i <= 1000; i+=2) {
            suma += i;
        }
    }
    
    public int getSuma(){
        return suma;
    }
}
