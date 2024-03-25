package E_Sportiv.exercitiu2.implementare;

public class FactoryAtacant implements FactoryJucator{
    @Override
    public Jucator creare(String numeJucator, int varstaJucator) {
        return new Atacant(numeJucator,varstaJucator);
    }
}
