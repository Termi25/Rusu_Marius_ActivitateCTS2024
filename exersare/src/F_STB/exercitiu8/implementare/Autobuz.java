package F_STB.exercitiu8.implementare;

public class Autobuz extends AutobuzAbstract{
    public Autobuz(int numarAutobuz, int numarPasageri) {
        super(numarAutobuz, numarPasageri);
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul a oprit in statie.");
    }
}
