package E_Sportiv.exercitiu1.main;

import E_Sportiv.exercitiu1.implementare.FactoryJucator;
import E_Sportiv.exercitiu1.implementare.Jucator;
import E_Sportiv.exercitiu1.implementare.TipJucator;

public class Main {
    public static void main(String[] args) {
        FactoryJucator factoryJucator=new FactoryJucator();
        Jucator fundas= factoryJucator.creare(TipJucator.Fundas,"Henry",27);
        System.out.println(fundas);
    }
}
