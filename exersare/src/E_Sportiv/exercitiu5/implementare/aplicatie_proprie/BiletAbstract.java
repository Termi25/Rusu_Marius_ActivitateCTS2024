package E_Sportiv.exercitiu5.implementare.aplicatie_proprie;

public abstract class BiletAbstract {
    protected String numeBilet;
    protected int rand;
    protected int loc;
    protected String ora;

    public BiletAbstract(String numeBilet, int rand,
                         int loc, String ora) {
        this.numeBilet = numeBilet;
        this.rand = rand;
        this.loc = loc;
        this.ora = ora;
    }

    public String getNumeBilet() {
        return numeBilet;
    }

    public int getRand() {
        return rand;
    }

    public int getLoc() {
        return loc;
    }

    public String getOra() {
        return ora;
    }

    public abstract void vindeBilet();
}
