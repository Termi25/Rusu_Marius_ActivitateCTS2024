package D_Banca.exercitiu8.implementare;

public abstract class CreditAbstract {
    String denumire;
    double valoare;
    int numarLuni;
    String moneda;

    public CreditAbstract(String denumire, int numarLuni,
                          String moneda, double valoare) {
        this.denumire = denumire;
        this.numarLuni = numarLuni;
        this.moneda = moneda;
        this.valoare = valoare;
    }

    public abstract void realizeazaCredit();
}
