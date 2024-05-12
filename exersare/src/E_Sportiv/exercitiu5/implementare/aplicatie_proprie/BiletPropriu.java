package E_Sportiv.exercitiu5.implementare.aplicatie_proprie;

public class BiletPropriu extends BiletAbstract{
    public BiletPropriu(String numeBilet, int rand,
                        int loc, String ora) {
        super(numeBilet, rand, loc, ora);
    }

    @Override
    public void vindeBilet() {
        System.out.println("Biletul pe numele de "+numeBilet
                +" a fost vandut prin aplicatia proprie.");
    }
}
