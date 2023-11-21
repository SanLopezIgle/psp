
package ejercicio1;


public class MyThread extends Thread{
    
    public MyThread(String nombre){
        super(nombre);
    }
    
    public void run(){
        for (int i = 0; i <= 10; i++) {
            System.out.println(getName() + ": Iteracion " + i);
            int tiempoAleatorio = (int) (Math.random() * 3000);
        }
    }
}
