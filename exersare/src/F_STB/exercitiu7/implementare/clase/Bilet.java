package F_STB.exercitiu7.implementare.clase;

public class Bilet extends BiletAbstract{
    public Bilet(int codBilet) {
        super(codBilet);
    }

    @Override
    public void cumparaBilet() {
        System.out.println("S-a cumparat biletul cu codul "
                +codBilet);
    }
}
