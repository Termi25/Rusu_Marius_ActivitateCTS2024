package C_Farmacie.exercitiu8.clase;

public class Medicament implements StructuraAbstracta{
    private String numeMedicament;
    private double pretMedicament;

    public Medicament(String numeMedicament, double pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public double getPretMedicament() {
        return pretMedicament;
    }

    public void setPretMedicament(double pretMedicament) {
        this.pretMedicament = pretMedicament;
    }

    @Override
    public void adauga(StructuraAbstracta structura) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sterge(StructuraAbstracta structura) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent+"Medicament "+this.numeMedicament+ " cu pretul "+ this.pretMedicament+ " RON.");
    }

    @Override
    public void calculeazaPret(double procentDiscount) {
        this.pretMedicament*=(1-procentDiscount);
    }
}
