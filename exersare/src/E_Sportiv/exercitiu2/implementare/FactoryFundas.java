package E_Sportiv.exercitiu2.implementare;

public class FactoryFundas implements FactoryJucator{
    @Override
    public Jucator creare(String numeJucator, int varstaJucator) {
        return new Fundas(numeJucator, varstaJucator);
    }
}
