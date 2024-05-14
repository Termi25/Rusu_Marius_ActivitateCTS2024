package B_Restaurant.exercitiu9.main;

import B_Restaurant.exercitiu9.implementare.ProxyRezervare;
import B_Restaurant.exercitiu9.implementare.Rezervare;
import B_Restaurant.exercitiu9.implementare.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        RezervareAbstracta rezervare1=new Rezervare(
                4,"Popescu",
                "25/05/2024","14:00");
        RezervareAbstracta rezervareProxy=new ProxyRezervare(rezervare1);
        rezervareProxy.realizareRezervare();
    }
}
