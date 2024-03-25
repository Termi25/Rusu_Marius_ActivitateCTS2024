package E_Sportiv.exercitiu2.implementare;

public class FactoryPortar implements FactoryJucator{
    @Override
    public Jucator creare(String numeJucator, int varstaJucator) {
        return new Portar(numeJucator, varstaJucator);
    }
}
