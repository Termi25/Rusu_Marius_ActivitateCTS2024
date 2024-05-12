package E_Sportiv.exercitiu5.implementare.aplicatie_externa;

public abstract class BiletWebsiteAbstract {
    protected String numeBilet;
    protected String randSiLoc;
    protected String ora;

    public BiletWebsiteAbstract(String numeBilet,
                                String randSiLoc,
                                String ora) {
        this.numeBilet = numeBilet;
        this.randSiLoc=randSiLoc;
        this.ora = ora;
    }

    public abstract void vanzareBilet();
}
