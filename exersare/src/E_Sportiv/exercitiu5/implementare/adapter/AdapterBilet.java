package E_Sportiv.exercitiu5.implementare.adapter;

import E_Sportiv.exercitiu5.implementare.aplicatie_externa.BiletWebsiteAbstract;
import E_Sportiv.exercitiu5.implementare.aplicatie_proprie.BiletAbstract;

public class AdapterBilet extends BiletWebsiteAbstract {
    private BiletAbstract bilet;

    public AdapterBilet(String numeBilet, String randSiLoc, String ora) {
        super(numeBilet, randSiLoc, ora);
    }

    public AdapterBilet(BiletAbstract bilet) {
        super(bilet.getNumeBilet(),
                bilet.getRand()+"/"+ bilet.getLoc(),
                bilet.getOra());
        this.bilet = bilet;
    }

    @Override
    public void vanzareBilet() {
        this.bilet.vindeBilet();
    }
}
