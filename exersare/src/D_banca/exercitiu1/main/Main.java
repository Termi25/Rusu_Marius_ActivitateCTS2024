package D_banca.exercitiu1.main;

import D_banca.exercitiu1.implementare.Credit;
import D_banca.exercitiu1.implementare.FactoryCredite;
import D_banca.exercitiu1.implementare.TipCredit;

public class Main {
    public static void main(String[] args) {
        FactoryCredite factory=new FactoryCredite();
        Credit creditPersonal= factory.creare(TipCredit.NevoiePersonala,"Popescu",120000,36);
        System.out.println(creditPersonal);
        Credit creditIpotecar= factory.creare(TipCredit.Ipotecar,"George",100000,24);
        System.out.println(creditIpotecar);
    }
}
