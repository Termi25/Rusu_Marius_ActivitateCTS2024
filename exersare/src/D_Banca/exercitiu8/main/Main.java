package D_Banca.exercitiu8.main;

import D_Banca.exercitiu8.implementare.Credit;
import D_Banca.exercitiu8.implementare.CreditAbstract;
import D_Banca.exercitiu8.implementare.CreditProxy;

public class Main {
    public static void main(String[] args) {
        CreditAbstract credit=new Credit("ExtraLife",24,"EUR",100000.0);
        credit.realizeazaCredit();

        CreditAbstract creditProxy=new CreditProxy(credit);
        creditProxy.realizeazaCredit();
    }
}
