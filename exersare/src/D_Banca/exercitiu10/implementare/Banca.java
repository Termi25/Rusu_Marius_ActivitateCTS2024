package D_Banca.exercitiu10.implementare;

public class Banca {
    String denumire;
    String sucursala;
    double capital;

    public Banca(String denumire,
                 String sucursala, double capital) {
        this.denumire = denumire;
        this.sucursala = sucursala;
        this.capital = capital;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getSucursala() {
        return sucursala;
    }

    public double getCapital() {
        return capital;
    }
}
