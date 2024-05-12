package D_Banca.exercitiu5.implementare.banca;

public abstract class CreditAbstract {
    String denumire;
    double valoare;
    int numarLuni;

    public CreditAbstract(String denumire, double valoare,int numarLuni) {
        this.denumire = denumire;
        this.valoare = valoare;
        this.numarLuni=numarLuni;
    }

    public abstract void oferaCredit();
}
