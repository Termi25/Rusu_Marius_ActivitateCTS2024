package D_Banca.exercitiu5.implementare.adapter;

import D_Banca.exercitiu5.implementare.banca.CreditAbstract;
import D_Banca.exercitiu5.implementare.leasing.LeasingAbstract;

public class AdapterLeasing extends CreditAbstract {
    private LeasingAbstract leasing;

    public AdapterLeasing(String denumire, double valoare, int numarLuni) {
        super(denumire, valoare, numarLuni);
    }

    public AdapterLeasing(LeasingAbstract leasing) {
        super("Leasing"+leasing.getCodLeasing(),
                leasing.getSumaLeasing(),
                leasing.getDurataLeasing());
        this.leasing = leasing;
    }

    @Override
    public void oferaCredit() {
        this.leasing.oferaLeasing();
    }
}
