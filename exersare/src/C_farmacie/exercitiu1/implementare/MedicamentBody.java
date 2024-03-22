package C_farmacie.exercitiu1.implementare;

public class MedicamentBody extends Medicament{
    public MedicamentBody(String denumire, Double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MedicamentBody{");
        sb.append(this.getDenumire());
        sb.append(", ");
        sb.append(this.getPret());
        sb.append('}');
        return sb.toString();
    }
}
