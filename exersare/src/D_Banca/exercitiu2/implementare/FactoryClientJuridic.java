package D_Banca.exercitiu2.implementare;

public class FactoryClientJuridic implements FactoryClient{
    @Override
    public Client creare(String numeCreditor, int sumaCredit) {
        return new ClientFizic(numeCreditor,sumaCredit);
    }
}
