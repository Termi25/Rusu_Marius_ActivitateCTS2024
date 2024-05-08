package A_Spital.exercitiu8.main;

import A_Spital.exercitiu8.implementare.Departament;
import A_Spital.exercitiu8.implementare.Sectie;
import A_Spital.exercitiu8.implementare.StructuraAbstracta;
import A_Spital.exercitiu8.implementare.Subdepartament;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta departament =new Departament("IT");
        StructuraAbstracta subdepartament1=new Subdepartament("Dezvoltare Software");
        StructuraAbstracta subdepartament2=new Subdepartament("Testare Software");
        StructuraAbstracta sectie=new Sectie("Data Analytics");

        departament.adauga(subdepartament1);
        departament.adauga(subdepartament2);
        departament.adauga(sectie);

        departament.afisare(" ");
    }
}
