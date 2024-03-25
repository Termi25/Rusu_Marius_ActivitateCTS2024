package E_Sportiv.exercitiu2.implementare;

public class Portar extends Jucator{
    protected Portar(String numeJucator, int varstaJucator) {
        super(numeJucator, varstaJucator);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append(this.getNumeJucator());
        sb.append(", ");
        sb.append(this.getVarstaJucator());
        sb.append('}');
        return sb.toString();
    }
}
