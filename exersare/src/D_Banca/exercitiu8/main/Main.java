package D_Banca.exercitiu8.main;

import D_Banca.exercitiu8.implementare.CreditAbstract;
import D_Banca.exercitiu8.implementare.CreditProxy;

public class Main {
    public static void main(String[] args) {
        CreditAbstract credit=new CreditProxy("ExtraLife",24,"RON",100000.0);
        credit.realizeazaCredit();
    }
}
