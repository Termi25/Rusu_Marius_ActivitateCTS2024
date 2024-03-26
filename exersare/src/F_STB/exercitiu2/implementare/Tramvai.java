package F_STB.exercitiu2.implementare;

public class Tramvai extends MijlocTransport {
    protected Tramvai(int numarTransport, int kilometraj) {
        super(numarTransport, kilometraj);
    }

    private Tramvai() {
        super();
    }

    @Override
    public MijlocTransport cloneaza() {
        Tramvai nou=new Tramvai();
        nou.setNumarTransport(this.getNumarTransport());
        nou.setKilometraj(this.getKilometraj());
        return nou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append(this.getNumarTransport());
        sb.append(", ");
        sb.append(this.getKilometraj());
        sb.append('}');
        return sb.toString();
    }
}
