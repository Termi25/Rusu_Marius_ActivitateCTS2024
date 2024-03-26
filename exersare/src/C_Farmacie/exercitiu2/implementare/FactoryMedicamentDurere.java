package C_Farmacie.exercitiu2.implementare;

public class FactoryMedicamentDurere implements AbstractFactory{
    @Override
    public Medicament creeaza(String denumire, Double pret) {
        return new MedicamentDurere(denumire, pret);
    }
}
