
package ejercicio8;


public class Ascensor {
    
    int piso = 0;
    boolean ascensorMovimiento = false;
    String estado = null;
    
    public synchronized void llamarAscensor(int llamadaPiso, String persona) throws InterruptedException{
        int diferenciaPisos;
        
        while(ascensorMovimiento == true){
            wait();
        }
        
        ascensorMovimiento = true;
        
        if(llamadaPiso != piso){
            if(piso < llamadaPiso){
                estado = "subiendo";
                moverAscensor(llamadaPiso, persona);
            }else{
                estado = "bajando";
                moverAscensor(llamadaPiso, persona);
            }
        }else{
            System.out.println("se abre el ascensor al estar en el piso indicado");
        }
        ascensorMovimiento = false;
        notifyAll();
    }
    public synchronized void moverAscensor(int pisoDestino, String persona) throws InterruptedException{
        if(estado.equals("subiendo")){
            for (int i = piso; i <= pisoDestino; i++) {
                if(pisoDestino == i){
                    System.out.println("el ascensor ha llegado a su piso de destino: " + i + " lo llamo: " + persona);
                }else{
                    System.out.println("el ascensor esta en el piso " + i + " " + estado + " hasta el piso " + pisoDestino);
                }
                piso = i;
                Thread.sleep(100);
            }
        }else{
            for (int i = piso; i >= pisoDestino; i--) {
                if(pisoDestino == i){
                    System.out.println("el ascensor ha llegado a su piso de destino: " + i);
                }else{
                    System.out.println("el ascensor esta en el piso " + i + " " + estado + " hasta el piso " + pisoDestino + " lo llamo: " + persona);
                }
                piso = i;
                Thread.sleep(100);
            }
        }
    }
    
}
