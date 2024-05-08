package B_Restaurant.exercitiu3.implementare;

public class SupaCiuperci extends Supa {
    public SupaCiuperci(String denumire, int cantitateGrame) {
        super(denumire, cantitateGrame);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaCiuperci{");
        sb.append(this.getDenumire());
        sb.append(", ");
        sb.append(this.getCantitateGrame());
        sb.append('}');
        return sb.toString();
    }
}
