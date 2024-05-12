package E_Sportiv.exercitiu7.implementare.clase;

public class Bilet extends BiletAbstract {

    public Bilet(String numeBilet, int rand, int loc,
                 String ora, boolean joacaEchipaLocala) {
        super(numeBilet, rand, loc, ora, joacaEchipaLocala);
    }

    @Override
    public void vindeBilet() {
        System.out.println("Biletul pe numele de "+numeBilet
                +" a fost vandut.");
    }
}