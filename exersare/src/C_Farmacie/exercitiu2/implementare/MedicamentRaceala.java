package C_Farmacie.exercitiu2.implementare;

public class MedicamentRaceala extends Medicament{
    protected MedicamentRaceala(String denumire, Double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MedicamentRaceala{");
        sb.append(this.getDenumire());
        sb.append(", ");
        sb.append(this.getPret());
        sb.append('}');
        return sb.toString();
    }
}
