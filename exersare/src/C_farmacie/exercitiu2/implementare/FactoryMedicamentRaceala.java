package C_farmacie.exercitiu2.implementare;

public class FactoryMedicamentRaceala implements AbstractFactory{
    @Override
    public Medicament creeaza(String denumire, Double pret) {
        return new MedicamentRaceala(denumire, pret);
    }
}
