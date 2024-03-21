package restaurant.exercitiu3.implementare;

public class SupaLegume extends Supa{
    public SupaLegume(String denumire, int cantitateGrame) {
        super(denumire, cantitateGrame);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaLegume{");
        sb.append(this.getDenumire());
        sb.append(", ");
        sb.append(this.getCantitateGrame());
        sb.append('}');
        return sb.toString();
    }
}
