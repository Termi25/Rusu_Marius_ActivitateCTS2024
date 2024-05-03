package A_Spital.exercitiu5.implementare.farmacie;

public abstract class AbstractMedicamentFarmacie {
    protected String denumire;

    public AbstractMedicamentFarmacie(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public abstract void cumparaMedicament();
}
