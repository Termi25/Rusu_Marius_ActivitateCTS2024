package C_farmacie.exercitiu2.main;

import C_farmacie.exercitiu2.implementare.AbstractFactory;
import C_farmacie.exercitiu2.implementare.FactoryMedicamentRaceala;
import C_farmacie.exercitiu2.implementare.Medicament;
import C_farmacie.exercitiu2.implementare.MedicamentBody;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factoryMedRaceala=new FactoryMedicamentRaceala();
        Medicament medicamentRaceala= factoryMedRaceala.creeaza("Aspirina",15.3);
        System.out.println(medicamentRaceala);
    }
}
