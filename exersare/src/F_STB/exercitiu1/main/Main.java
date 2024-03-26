package F_STB.exercitiu1.main;

import F_STB.exercitiu1.implementare.FactoryMijlocTransport;
import F_STB.exercitiu1.implementare.MijlocTransport;
import F_STB.exercitiu1.implementare.TipTransport;

public class Main {
    public static void main(String[] args) {
        FactoryMijlocTransport factoryMijlocTransport=new FactoryMijlocTransport();
        MijlocTransport autobuz= factoryMijlocTransport.creeaza(
                TipTransport.Autobuz,123,120000);
        System.out.println(autobuz);
    }
}
