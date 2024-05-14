package D_Banca.exercitiu8.implementare;

public class Credit implements CreditAbstract{
    String denumire;
    double valoare;
    int numarLuni;
    String moneda;

    public Credit(String denumire, int numarLuni,
                          String moneda, double valoare) {
        this.denumire = denumire;
        this.numarLuni = numarLuni;
        this.moneda = moneda;
        this.valoare = valoare;
    }



    @Override
    public void realizeazaCredit() {
        System.out.println("S-a realizat creditul "+
                denumire+" in valoare de "+
                numarLuni+' '+moneda+
                " pentru "+numarLuni+" luni.");
    }

    @Override
    public String getMoneda() {
        return moneda;
    }
}
