package C_Farmacie.exercitiu1.implementare;

public class MedicamentDurere extends Medicament{
    public MedicamentDurere(String denumire, Double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MedicamentDurere{");
        sb.append(this.getDenumire());
        sb.append(", ");
        sb.append(this.getPret());
        sb.append('}');
        return sb.toString();
    }
}
