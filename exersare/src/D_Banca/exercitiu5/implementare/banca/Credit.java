package D_Banca.exercitiu5.implementare.banca;

public class Credit extends CreditAbstract{

    public Credit(String denumire, double valoare, int numarLuni) {
        super(denumire, valoare, numarLuni);
    }

    @Override
    public void oferaCredit() {
        System.out.println("Se ofera creditul "+denumire
        +" in valoare de "+valoare);
    }
}
