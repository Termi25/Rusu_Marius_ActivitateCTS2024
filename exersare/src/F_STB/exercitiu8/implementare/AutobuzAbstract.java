package F_STB.exercitiu8.implementare;

public abstract class AutobuzAbstract {
    protected int numarAutobuz;
    protected int numarPasageri;

    public AutobuzAbstract(int numarAutobuz,
                           int numarPasageri) {
        this.numarAutobuz = numarAutobuz;
        this.numarPasageri = numarPasageri;
    }

    public abstract void opresteInStatie();
}
