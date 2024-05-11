package C_Farmacie.exercitiu10.main;

import C_Farmacie.exercitiu10.implementare.FlyweightFactory;
import C_Farmacie.exercitiu10.implementare.Reteta;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factoryClienti=new FlyweightFactory();
        Reteta reteta=new Reteta(3,25,24.0);
        factoryClienti.getClient("Manole",1).platesteReteta(reteta);
    }
}
