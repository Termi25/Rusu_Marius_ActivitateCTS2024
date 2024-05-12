package D_Banca.exercitiu5.main;

import D_Banca.exercitiu5.implementare.adapter.AdapterLeasing;
import D_Banca.exercitiu5.implementare.banca.CreditAbstract;
import D_Banca.exercitiu5.implementare.leasing.Leasing;
import D_Banca.exercitiu5.implementare.leasing.LeasingAbstract;

public class Main {
    public static void main(String[] args) {
        LeasingAbstract leasing=new Leasing(1,12,10000.0);
        CreditAbstract adapterLeasing=new AdapterLeasing(leasing);
        adapterLeasing.oferaCredit();
    }
}
