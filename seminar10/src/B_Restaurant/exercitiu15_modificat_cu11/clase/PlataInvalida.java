package B_Restaurant.exercitiu15_modificat_cu11.clase;

public class PlataInvalida extends ModPlata{
    @Override
    public void plateste(double suma, String nume) {
        System.out.println(nume+" nu are fonduri suficiente pentru realizarea platii in valoare de "+suma+" RON.");
    }
}
