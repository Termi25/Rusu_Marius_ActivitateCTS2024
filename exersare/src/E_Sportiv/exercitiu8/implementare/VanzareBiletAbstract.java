package E_Sportiv.exercitiu8.implementare;

public abstract class VanzareBiletAbstract {
    protected String numeBilet;
    protected int rand;
    protected int loc;
    protected String ora;
    protected int varsta;

    public VanzareBiletAbstract(String numeBilet, int rand,
                                int loc, String ora,
                                int varsta) {
        this.numeBilet = numeBilet;
        this.rand = rand;
        this.loc = loc;
        this.ora = ora;
        this.varsta = varsta;
    }

    public abstract void cumparareBilet();
}
