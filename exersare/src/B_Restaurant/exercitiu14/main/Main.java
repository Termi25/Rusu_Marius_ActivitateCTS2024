package B_Restaurant.exercitiu14.main;

import B_Restaurant.exercitiu14.implementare.Masa;
import B_Restaurant.exercitiu14.implementare.OcupareMasaAbstracta;

public class Main {
    public static void main(String[] args) {
        OcupareMasaAbstracta masa=new Masa(1);
        masa.ocupareMasa();
    }
}
