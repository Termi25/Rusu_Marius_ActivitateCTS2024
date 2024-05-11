package C_Farmacie.exercitiu12.main;

import C_Farmacie.exercitiu12.implementare.observer.Client;
import C_Farmacie.exercitiu12.implementare.observer.Observer;
import C_Farmacie.exercitiu12.implementare.subiect.Farmacie;
import C_Farmacie.exercitiu12.implementare.subiect.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect farmacie= new Farmacie("Tei");

        Observer client1=new Client(1,
                "Manole");
        Observer client2=new Client(2,
                "Popescu");

        farmacie.abonare(client1);
        farmacie.abonare(client2);

        farmacie.notificareOfertaMedicamente();
    }
}
