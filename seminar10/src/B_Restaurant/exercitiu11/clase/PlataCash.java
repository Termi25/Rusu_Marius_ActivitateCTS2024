package B_Restaurant.exercitiu11.clase;

public class PlataCash implements MetodaPlata{

    @Override
    public void realizeazaPlata(double suma, String nume) {
        System.out.println(nume+" a platit suma "+suma+" sub forma cash.");
    }
}
