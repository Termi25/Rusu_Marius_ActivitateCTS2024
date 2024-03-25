package E_Sportiv.exercitiu1.implementare;

public class Fundas extends Jucator{
    protected Fundas(String numeJucator, int varstaJucator) {
        super(numeJucator, varstaJucator);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append(this.getNumeJucator());
        sb.append(", ");
        sb.append(this.getVarstaJucator());
        sb.append('}');
        return sb.toString();
    }
}
