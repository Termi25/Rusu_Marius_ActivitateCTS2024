package restaurant.exercitiu1.implementare;

public class FactorySupaVita implements Factory{
    @Override
    public Supa creareSupa(String denumireSupa, int gramaj) {
        return new SupaVita(denumireSupa,gramaj);
    }
}
