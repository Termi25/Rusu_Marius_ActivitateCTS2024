package E_Sportiv.exercitiu8.implementare;

public class VanzareBilet extends VanzareBiletAbstract{
    public VanzareBilet(String numeBilet, int rand,
                        int loc, String ora, int varsta) {
        super(numeBilet, rand, loc, ora, varsta);
    }

    @Override
    public void cumparareBilet() {
        System.out.println("Biletul a fost cumparat de "
                +numeBilet);
    }
}
