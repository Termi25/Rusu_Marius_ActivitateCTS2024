package A_Spital.exercitiu5.implementare.spital;

public abstract class AbstractMedicamentSpital {
    protected String denumire;

    public AbstractMedicamentSpital(String denumire) {
        this.denumire = denumire;
    }
    private AbstractMedicamentSpital(){

    }
    public abstract void achizitioneazaMedicament(String codReteta);

    public abstract boolean prezintaReteta(String codReteta);
}
