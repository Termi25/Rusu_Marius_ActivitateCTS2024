package B_Restaurant.exercitiu8.main;

import B_Restaurant.exercitiu8.implementare.Item;
import B_Restaurant.exercitiu8.implementare.Sectiune;
import B_Restaurant.exercitiu8.implementare.StructuraAbstracta;
import B_Restaurant.exercitiu8.implementare.Subsectiune;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta sectiune1=new Sectiune("bauturi");

        StructuraAbstracta item1=new Item("apa plata");
        StructuraAbstracta item2=new Item("apa minerala");
        StructuraAbstracta item3=new Item("Fanta");
        StructuraAbstracta item4=new Item("Coca Cola");

        StructuraAbstracta subsectiune1=new Subsectiune("apa");
        StructuraAbstracta subsectiune2=new Subsectiune("sucuri");

        subsectiune1.adauga(item1);
        subsectiune1.adauga(item2);

        subsectiune2.adauga(item3);
        subsectiune2.adauga(item4);

        sectiune1.adauga(subsectiune1);
        sectiune1.adauga(subsectiune2);

        sectiune1.afisare("   ");

    }
}
