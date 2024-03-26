package F_STB.exercitiu2.implementare;

public class Autobuz extends MijlocTransport {
    protected Autobuz(int numarTransport, int kilometraj) {
        super(numarTransport, kilometraj);
    }

    private Autobuz() {
        super();
    }

    @Override
    public MijlocTransport cloneaza() {
        Autobuz nou=new Autobuz();
        nou.setNumarTransport(this.getNumarTransport());
        nou.setKilometraj(this.getKilometraj());
        return nou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append(this.getNumarTransport());
        sb.append(", ");
        sb.append(this.getKilometraj());
        sb.append('}');
        return sb.toString();
    }
}
