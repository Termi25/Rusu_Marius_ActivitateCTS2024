package F_STB.exercitiu7.implementare.clase;

public abstract class BiletAbstract {
    protected int codBilet;

    public BiletAbstract(int codBilet) {
        this.codBilet = codBilet;
    }

    public int getCodBilet() {
        return codBilet;
    }

    public abstract void cumparaBilet();
}
