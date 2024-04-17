package C_Farmacie.exercitiu8.main;

import C_Farmacie.exercitiu8.clase.Categorie;
import C_Farmacie.exercitiu8.clase.Medicament;
import C_Farmacie.exercitiu8.clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta medicamente=new Categorie("Medicamente");
        StructuraAbstracta raceala=new Categorie("Raceala");
        StructuraAbstracta durere=new Categorie("Durere");

        StructuraAbstracta copii=new Categorie("Copii");
        StructuraAbstracta adulti=new Categorie("Adulti");

        StructuraAbstracta nurofen=new Medicament("Nurofen",15.0);
        StructuraAbstracta paracetamol=new Medicament("Paracetamol",18.0);
        StructuraAbstracta mig400=new Medicament("Mig 400",22.0);
        StructuraAbstracta nurofenJunior=new Medicament("Nurofen Junior",10.0);

        medicamente.adauga(raceala);
        medicamente.adauga(durere);

        raceala.adauga(copii);
        raceala.adauga(adulti);

        durere.adauga(mig400);
        adulti.adauga(nurofen);
        adulti.adauga(paracetamol);
        copii.adauga(nurofenJunior);

        medicamente.afisare("  ");
        medicamente.calculeazaPret(0.1);
        System.out.println("--------------------------------------------");
        medicamente.afisare("  ");
    }
}