package C_Farmacie.exercitiu9.main;

import C_Farmacie.exercitiu9.implementare.Client;
import C_Farmacie.exercitiu9.implementare.ClientAbstract;
import C_Farmacie.exercitiu9.implementare.ClientProxy;

public class Main {
    public static void main(String[] args) {
        ClientAbstract client1=new Client(1,"Manole",false);
        client1.cumparaMedicamente();

        ClientAbstract client2=new Client(2,"Popescu",false);
        ClientAbstract clientProxy=new ClientProxy(client2);
        clientProxy.cumparaMedicamente();
    }
}
