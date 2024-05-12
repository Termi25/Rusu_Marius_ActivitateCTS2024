package D_Banca.exercitiu8.implementare;

public class CreditProxy extends CreditAbstract{
    public CreditProxy(String denumire, int numarLuni, String moneda, double valoare) {
        super(denumire, numarLuni, moneda, valoare);
    }

    @Override
    public void realizeazaCredit() {
        if(moneda.equalsIgnoreCase("RON")){
            System.out.println("S-a realizat creditul "+
                    denumire+" in valoare de "+
                    numarLuni+' '+moneda+
                    " pentru "+numarLuni+" luni.");
        }else{
            System.out.println("Nu se poate realiza credit decat in RON.");
        }
    }
}
