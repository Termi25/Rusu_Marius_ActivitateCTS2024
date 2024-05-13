package E_Sportiv.exercitiu9.main;

import E_Sportiv.exercitiu9.implementare.Componenta;
import E_Sportiv.exercitiu9.implementare.Loc;
import E_Sportiv.exercitiu9.implementare.Sectiune;
import E_Sportiv.exercitiu9.implementare.Subsectiune;

public class Main {
    public static void main(String[] args) {
        Componenta sectiune=new Sectiune("Tribuna");
        Componenta subsectiune1=new Subsectiune("Tribuna Nord");
        Componenta subsectiune2=new Subsectiune("Tribuna Sud");
        Componenta locDirect1=new Loc(2,3);
        Componenta locDirect2=new Loc(5,4);

        subsectiune1.adauga(locDirect1);
        subsectiune1.adauga(locDirect2);

        sectiune.adauga(subsectiune1);
        sectiune.adauga(subsectiune2);

        sectiune.afisare("  ");
    }
}
