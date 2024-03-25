package E_Sportiv.exercitiu1.implementare;

public class Atacant extends Jucator{
    protected Atacant(String numeJucator, int varstaJucator) {
        super(numeJucator, varstaJucator);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append(this.getNumeJucator());
        sb.append(", ");
        sb.append(this.getVarstaJucator());
        sb.append('}');
        return sb.toString();
    }
}
