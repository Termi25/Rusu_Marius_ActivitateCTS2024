package F_STB.exercitiu1.implementare;

public class Troleibuz extends MijlocTransport{
    protected Troleibuz(int numarTransport, int kilometraj) {
        super(numarTransport, kilometraj);
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
