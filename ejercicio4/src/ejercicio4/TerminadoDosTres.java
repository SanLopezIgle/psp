
package ejercicio4;


public class TerminadoDosTres implements Runnable{
    private int suma = 0;
    
    @Override
    public void run(){
        for (int i = 1; i <= 1000; i++) {
            if(i % 10 == 2 || i % 10 == 3){
                suma += i;
            }
        }
    }
    
    public int getSuma(){
        return suma;
    }
}
