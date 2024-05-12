package D_Banca.exercitiu8.implementare;

public class Credit extends CreditAbstract{
    public Credit(String denumire, int numarLuni, String moneda, double valoare) {
        super(denumire, numarLuni, moneda, valoare);
    }

    @Override
    public void realizeazaCredit() {
        System.out.println("S-a realizat creditul "+
                denumire+" in valoare de "+
                numarLuni+' '+moneda+
                " pentru "+numarLuni+" luni.");
    }
}
