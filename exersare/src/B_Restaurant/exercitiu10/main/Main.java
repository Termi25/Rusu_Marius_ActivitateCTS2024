package B_Restaurant.exercitiu10.main;

import B_Restaurant.exercitiu10.implementare.FlyweightFactory;
import B_Restaurant.exercitiu10.implementare.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factoryClienti=new FlyweightFactory();
        factoryClienti.getClient("Popescu")
                .rezervaMasa(new MasaRezervata(34));
    }
}
