package B_restaurant.exercitiu1.implementare;

public class SupaVita extends Supa{

    protected SupaVita(String denumireSupa, int gramaj) {
        super(denumireSupa, gramaj);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaVita{");
        sb.append("denumireSupa='").append(denumireSupa).append('\'');
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
