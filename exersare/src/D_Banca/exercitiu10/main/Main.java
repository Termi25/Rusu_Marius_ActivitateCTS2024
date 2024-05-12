package D_Banca.exercitiu10.main;

import D_Banca.exercitiu10.implementare.Banca;
import D_Banca.exercitiu10.implementare.ContBancar;
import D_Banca.exercitiu10.implementare.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory=new FlyweightFactory();
        factory.getClient("Manole",
                null,null,null,
                new Banca("BRD",
                        "Bvd Decebal",
                        1000000.0))
                .creeazaContBancar(new ContBancar(123,120.0));
    }
}
