package E_Sportiv.exercitiu4.main;

import E_Sportiv.exercitiu4.implementare.ContClient;
import E_Sportiv.exercitiu4.implementare.PrototypeContClient;

public class Main {
    public static void main(String[] args) {
        PrototypeContClient client1=new ContClient("Henry",19);
        PrototypeContClient client2=client1.cloneaza();
        client2.setNume("Andrei");
        System.out.println(client1);
        System.out.println(client2);
    }
}
