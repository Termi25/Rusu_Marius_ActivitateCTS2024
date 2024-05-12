package E_Sportiv.exercitiu7.implementare.clase;

public abstract class BiletAbstract {
    protected String numeBilet;
    protected int rand;
    protected int loc;
    protected String ora;
    protected boolean joacaEchipaLocala;

    public BiletAbstract(String numeBilet, int rand,
                         int loc, String ora,
                         boolean joacaEchipaLocala) {
        this.numeBilet = numeBilet;
        this.rand = rand;
        this.loc = loc;
        this.ora = ora;
        this.joacaEchipaLocala = joacaEchipaLocala;
    }

    public abstract void vindeBilet();
}
