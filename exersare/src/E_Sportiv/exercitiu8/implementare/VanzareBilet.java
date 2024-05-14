package E_Sportiv.exercitiu8.implementare;

public class VanzareBilet implements VanzareBiletAbstract {
    protected String numeBilet;
    protected int rand;
    protected int loc;
    protected String ora;
    protected int varsta;

    public VanzareBilet(String numeBilet, int rand,
                                int loc, String ora,
                                int varsta) {
        this.numeBilet = numeBilet;
        this.rand = rand;
        this.loc = loc;
        this.ora = ora;
        this.varsta = varsta;
    }

    @Override
    public void cumparareBilet() {
        System.out.println("Biletul a fost cumparat de "
                +numeBilet);
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }
}
