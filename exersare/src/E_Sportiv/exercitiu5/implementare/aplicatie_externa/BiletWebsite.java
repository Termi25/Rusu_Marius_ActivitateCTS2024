package E_Sportiv.exercitiu5.implementare.aplicatie_externa;

public class BiletWebsite extends BiletWebsiteAbstract{
    public BiletWebsite(String numeBilet, String randSiLoc, String ora) {
        super(numeBilet, randSiLoc, ora);
    }

    @Override
    public void vanzareBilet() {
        System.out.println("Biletul a fost achizitionat sub numele de "+numeBilet);
    }
}
