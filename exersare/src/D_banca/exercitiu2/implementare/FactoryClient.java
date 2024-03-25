package D_banca.exercitiu2.implementare;

import D_banca.exercitiu1.implementare.TipCredit;

public interface FactoryClient {
    public Client creare(String numeCreditor, int sumaCredit);
}
