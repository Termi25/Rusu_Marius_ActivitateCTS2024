package E_Sportiv.exercitiu2.main;

import E_Sportiv.exercitiu2.implementare.FactoryJucator;
import E_Sportiv.exercitiu2.implementare.FactoryPortar;
import E_Sportiv.exercitiu2.implementare.Jucator;

public class Main {
    public static void main(String[] args) {
        FactoryJucator factoryPortar=new FactoryPortar();
        Jucator portar= factoryPortar.creare("Henry",30);
        System.out.println(portar);
    }
}
