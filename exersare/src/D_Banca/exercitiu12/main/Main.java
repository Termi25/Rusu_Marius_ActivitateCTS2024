package D_Banca.exercitiu12.main;

import D_Banca.exercitiu12.implementare.observer.Client;
import D_Banca.exercitiu12.implementare.observer.Observer;
import D_Banca.exercitiu12.implementare.subiect.Banca;
import D_Banca.exercitiu12.implementare.subiect.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect banca=new Banca("BRD");

        Observer client1=new Client("Manole");
        Observer client2=new Client("Popescu");

        banca.abonare(client1);
        banca.abonare(client2);

        banca.notificaTotiAbonatii("Notificare catre toti clientii din partea bancii");
    }
}
