package F_STB.exercitiu2.main;

import F_STB.exercitiu2.implementare.FactoryMijlocTransport;
import F_STB.exercitiu2.implementare.MijlocTransport;
import F_STB.exercitiu2.implementare.TipTransport;

public class Main {
    public static void main(String[] args) {
        FactoryMijlocTransport factoryMijlocTransport=new FactoryMijlocTransport();
        MijlocTransport autobuz= factoryMijlocTransport.creeaza(
                TipTransport.Autobuz,123,120000);
        MijlocTransport autobuz2=autobuz.cloneaza();
        autobuz2.setNumarTransport(124);
        System.out.println(autobuz);
        System.out.println(autobuz2);
    }
}
