package F_STB.exercitiu8.implementare;

public class Autobuz implements AutobuzAbstract {
    protected int numarAutobuz;
    protected int numarPasageri;

    public Autobuz(int numarAutobuz,
                           int numarPasageri) {
        this.numarAutobuz = numarAutobuz;
        this.numarPasageri = numarPasageri;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul a oprit in statie.");
    }

    @Override
    public int getNrPasageri() {
        return this.numarPasageri;
    }
}
