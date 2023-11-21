
package parking;

/**
 * Escribe unha clase chamada Parking que reciba o número de prazas do parking e o número de
coches existentes no sistema. Débense crear tantos fíos como coches haxa. O parking disporá
dunha única entrada e unha única saída.
Na entrada de vehículos haberá un dispositivo de control que permita ou impida o acceso ao
parking, dependendo do estado actual do mesmo (prazas de aparcamento dispoñibles). Os
tempos de espera dos vehículos dentro do parking son aleatorios. No momento que un
vehículo sae do parking, notifica ao dispositivo de control o número de praza que tiña asignada
e se libera a praza que estivera ocupando, quedando así novamente dispoñible. Un vehículo
que saliu do parking esperará un tempo aleatorio para volver a entrar novamente ao mismo.
Por tanto os vehículos estarán entrando e saiendo indefinidamente do parking.
 */

public class Ejercicio10 {


    public static void main(String[] args) {
        Parking miParking = new Parking();
        for (int i = 0; i < 15; i++) {
            new MyThread((i+1), miParking).start();
        }
    }
    
}
