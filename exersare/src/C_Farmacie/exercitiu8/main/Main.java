package C_Farmacie.exercitiu8.main;

import C_Farmacie.exercitiu8.implementare.Componenta;
import C_Farmacie.exercitiu8.implementare.Medicament;
import C_Farmacie.exercitiu8.implementare.Sectiune;
import C_Farmacie.exercitiu8.implementare.Subsectiune;

public class Main {
    public static void main(String[] args) {
        Componenta sectiune=new Sectiune("Raceala");

        Componenta medicament1=new Medicament("Nurofen");
        Componenta medicament2=new Medicament("Aspirina");

        Componenta subsectiune1=new Subsectiune("Adulti");
        subsectiune1.adauga(medicament1);
        subsectiune1.adauga(medicament2);

        Componenta subsectiune2=new Subsectiune("Copii");
        subsectiune2.adauga(medicament1);
        subsectiune2.adauga(medicament2);

        sectiune.adauga(subsectiune1);
        sectiune.adauga(subsectiune2);

        sectiune.afiseaza(" ");
    }
}
