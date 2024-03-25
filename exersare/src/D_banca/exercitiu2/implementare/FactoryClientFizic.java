package D_banca.exercitiu2.implementare;

import D_banca.exercitiu1.implementare.TipCredit;

public class FactoryClientFizic implements FactoryClient{
    @Override
    public Client creare(String numeCreditor, int sumaCredit) {
        return new ClientFizic(numeCreditor,sumaCredit);
    }
}
