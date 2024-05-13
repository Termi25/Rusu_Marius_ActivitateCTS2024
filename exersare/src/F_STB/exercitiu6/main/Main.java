package F_STB.exercitiu6.main;

import F_STB.exercitiu6.implementare.Autobuz;
import F_STB.exercitiu6.implementare.Componenta;
import F_STB.exercitiu6.implementare.GrupDimensiuneAutobuz;
import F_STB.exercitiu6.implementare.TipAutobuz;

public class Main {
    public static void main(String[] args) {
        Componenta tipAutobuz=new TipAutobuz("Troleibuz");

        Componenta autobuz1=new Autobuz("Mercedes Benz","B134",10);
        Componenta grupMic=new GrupDimensiuneAutobuz("Mic");
        grupMic.adauga(autobuz1);
        grupMic.adauga(autobuz1);

        Componenta autobuz2=new Autobuz("Mercedes Benz","B156",30);
        Componenta grupMediu=new GrupDimensiuneAutobuz("Mediu");
        grupMediu.adauga(autobuz2);
        grupMediu.adauga(autobuz2);

        tipAutobuz.adauga(grupMic);
        tipAutobuz.adauga(grupMediu);

        tipAutobuz.afisare("  ");
    }
}
