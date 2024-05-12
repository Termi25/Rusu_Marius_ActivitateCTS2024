package D_Banca.exercitiu9.main;

import D_Banca.exercitiu9.implementare.Agentie;
import D_Banca.exercitiu9.implementare.Componenta;
import D_Banca.exercitiu9.implementare.Filiala;
import D_Banca.exercitiu9.implementare.Sucursala;

public class Main {
    public static void main(String[] args) {
        Componenta sucursala=new Sucursala("sucursala1");
        Componenta agentie1=new Agentie("agentie1");
        Componenta agentie2=new Agentie("agentie2");
        Componenta filiala=new Filiala("filiala");

        agentie1.adauga(filiala);
        agentie1.adauga(filiala);

        sucursala.adauga(agentie1);
        sucursala.adauga(agentie2);

        sucursala.afisare(" ");
    }
}
