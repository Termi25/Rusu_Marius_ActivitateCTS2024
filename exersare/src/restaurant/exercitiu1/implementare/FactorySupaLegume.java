package restaurant.exercitiu1.implementare;

public class FactorySupaLegume implements Factory{
    @Override
    public Supa creareSupa(String denumireSupa, int gramaj) {
        return new SupaLegume(denumireSupa,gramaj);
    }
}
