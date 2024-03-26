package F_STB.exercitiu2.implementare;

public class Troleibuz extends MijlocTransport {
    protected Troleibuz(int numarTransport, int kilometraj) {
        super(numarTransport, kilometraj);
    }

    private Troleibuz() {
        super();
    }

    @Override
    public MijlocTransport cloneaza() {
        Troleibuz nou=new Troleibuz();
        nou.setNumarTransport(this.getNumarTransport());
        nou.setKilometraj(this.getKilometraj());
        return nou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append(this.getNumarTransport());
        sb.append(", ");
        sb.append(this.getKilometraj());
        sb.append('}');
        return sb.toString();
    }
}
