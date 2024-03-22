package C_farmacie.exercitiu1.main;

import C_farmacie.exercitiu1.implementare.FactoryMedicament;
import C_farmacie.exercitiu1.implementare.Medicament;
import C_farmacie.exercitiu1.implementare.TipuriMedicament;

public class Main1 {
    public static void main(String[] args) {
        FactoryMedicament factory=new FactoryMedicament();
        Medicament medicamentDurere= factory
                .creare(TipuriMedicament.Durere,
                        "MIG400",
                        20.0);
        System.out.println(medicamentDurere);
        Medicament medicamentBody=factory
                .creare(TipuriMedicament.Body,
                        "Algocalmin",
                        30.5);
        System.out.println(medicamentBody);
        Medicament medicamentRaceala= factory
                .creare(TipuriMedicament.Raceala,
                        "Aspirina",
                        15.3);
        System.out.println(medicamentRaceala);
    }
}
