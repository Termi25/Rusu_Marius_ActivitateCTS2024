package E_Sportiv.exercitiu12.main;

import D_Banca.exercitiu12.implementare.observer.Client;
import D_Banca.exercitiu12.implementare.observer.Observer;
import E_Sportiv.exercitiu12.implementare.subiect.SalaSport;
import E_Sportiv.exercitiu12.implementare.subiect.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect salaSport=new SalaSport("Ceva");
        Observer client1=new Client("Manole");
        Observer client2=new Client("Popescu");

        salaSport.aboneaza(client1);
        salaSport.aboneaza(client2);

        salaSport.notificareMeciFotbal();
    }
}
