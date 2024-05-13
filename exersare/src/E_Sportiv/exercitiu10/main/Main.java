package E_Sportiv.exercitiu10.main;

import E_Sportiv.exercitiu10.implementare.FlyweightFactory;
import E_Sportiv.exercitiu10.implementare.Tribuna;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factoryPersoane=new FlyweightFactory();
        factoryPersoane.get(1,170,50,
                        4,10,"Galben")
                .deseneazaPersoana(new Tribuna("VIP"));
    }
}
