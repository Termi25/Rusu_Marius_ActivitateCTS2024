package C_farmacie.exercitiu1.implementare;

public class FactoryMedicament {
    public Medicament creare(TipuriMedicament tip,String denumire,Double pret){
        switch (tip) {
            case Raceala -> {
                return new MedicamentRaceala(denumire,pret);
            }
            case Durere -> {
                return new MedicamentDurere(denumire, pret);
            }
            case Body -> {
                return new MedicamentBody(denumire, pret);
            }
            default -> {
                return null;
            }
        }
    }
}
