package C_Farmacie.exercitiu2.main;

import C_Farmacie.exercitiu2.implementare.AbstractFactory;
import C_Farmacie.exercitiu2.implementare.FactoryMedicamentRaceala;
import C_Farmacie.exercitiu2.implementare.Medicament;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factoryMedRaceala=new FactoryMedicamentRaceala();
        Medicament medicamentRaceala= factoryMedRaceala.creeaza("Aspirina",15.3);
        System.out.println(medicamentRaceala);
    }
}
