package B_Restaurant.exercitiu1.implementare;

public class FactorySupaCiuperci implements Factory{

    @Override
    public Supa creareSupa(String denumireSupa, int gramaj) {
        return new SupaCiuperci(denumireSupa,gramaj);
    }
}
