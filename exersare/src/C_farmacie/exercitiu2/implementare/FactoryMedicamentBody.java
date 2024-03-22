package C_farmacie.exercitiu2.implementare;

public class FactoryMedicamentBody implements AbstractFactory{
    @Override
    public Medicament creeaza(String denumire, Double pret) {
        return new MedicamentBody(denumire, pret);
    }
}
