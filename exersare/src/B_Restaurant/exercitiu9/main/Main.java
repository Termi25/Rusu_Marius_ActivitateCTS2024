package B_Restaurant.exercitiu9.main;

import B_Restaurant.exercitiu9.implementare.ProxyRezervare;
import B_Restaurant.exercitiu9.implementare.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        RezervareAbstracta rezervareProxy=new ProxyRezervare(
                4,"Popescu",
                "25/05/2024","14:00");
        rezervareProxy.realizareRezervare();

        System.out.println();
        RezervareAbstracta rezervareProxy1=new ProxyRezervare(
                3,"Manole",
                "25/05/2024","14:00");
        rezervareProxy1.realizareRezervare();
    }
}
