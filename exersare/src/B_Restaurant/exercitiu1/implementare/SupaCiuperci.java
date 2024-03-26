package B_Restaurant.exercitiu1.implementare;

public class SupaCiuperci extends Supa{

    protected SupaCiuperci(String denumireSupa, int gramaj) {
        super(denumireSupa,gramaj);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaCiuperci{");
        sb.append("denumireSupa='").append(denumireSupa).append('\'');
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
