package C_Farmacie.exercitiu1.implementare;

public abstract class Medicament {
    private String denumire;
    private Double pret;

    public Medicament(String denumire, Double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }
}
