package C_Farmacie.exercitiu7.implementare.clase;

public abstract class BonDeCasaAbstract {
    int codBon;
    double sumaDePlata;

    public BonDeCasaAbstract(int codBon, double sumaDePlata) {
        this.codBon = codBon;
        this.sumaDePlata = sumaDePlata;
    }

    public int getCodBon() {
        return codBon;
    }

    public void setCodBon(int codBon) {
        this.codBon = codBon;
    }

    public double getSumaDePlata() {
        return sumaDePlata;
    }

    public void setSumaDePlata(double sumaDePlata) {
        this.sumaDePlata = sumaDePlata;
    }

    @Override
    public String toString() {
        return "BonDeCasaAbstract{" +
                "codBon=" + codBon +
                ", sumaDePlata=" + sumaDePlata +
                '}';
    }

    public abstract void printeazaBon();
}
